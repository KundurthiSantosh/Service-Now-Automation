package steps;

import commonUtilities.ConfigFileReader;
import commonUtilities.Reporter;
import commonUtilities.StepStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.IncidentsPage;
import pages.LoginPage;
import webUtilities.BaseTest;

public class ServiceNowSteps extends BaseTest {

    Reporter reporter = new Reporter();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    IncidentsPage incidentsPage = new IncidentsPage();
    ConfigFileReader configFileReader = new ConfigFileReader();

    @Given("I am on Service now login page")
    public void i_am_on_service_now_login_page() {
        gotoBaseURL();
        loginPage.switchToFrame();
        if(loginPage.validatePageTitle("ServiceNow"))
            reporter.logStep(StepStatus.PASS, "Launched Service Now");
        else
            reporter.logStep(StepStatus.FAIL_WITH_SCREENSHOT, "Unable to launch Service Now");
    }

    @Given("I login with valid credentials")
    public void i_login_with_valid_credentials() {
        if(loginPage.enterUserName(configFileReader.getUsername()))
            reporter.logStep(StepStatus.PASS, "Entered username");
        else
            reporter.logStep(StepStatus.FAIL_WITH_SCREENSHOT, "Not able to enter username");
        if(loginPage.enterPassword(configFileReader.getPassword()))
            reporter.logStep(StepStatus.PASS, "Entered password");
        else
            reporter.logStep(StepStatus.FAIL_WITH_SCREENSHOT, "Unable to enter password");
        if(loginPage.clickLogin())
            reporter.logStep(StepStatus.PASS, "Clicked on Login button");
        else
            reporter.logStep(StepStatus.FAIL_WITH_SCREENSHOT, "Login button is not available");
    }

    @When("I am on home page")
    public void i_am_on_home_page() {
        if(homePage.isFilterAvailable())
            reporter.logStep(StepStatus.PASS, "Logged in successfully and navigated to Home page");
        else
            reporter.logStep(StepStatus.FAIL_WITH_SCREENSHOT, "Login failed");
    }

    @When("I click on Incident tab on left hand pane")
    public void i_click_on_incident_tab_on_left_hand_page() {
        if(homePage.clickIncidentTab())
            reporter.logStep(StepStatus.PASS, "Clicked on incident tab");
        else
            reporter.logStep(StepStatus.FAIL_WITH_SCREENSHOT, "Unable to click on incident tab");
        if(homePage.clickAllIncidents())
            reporter.logStep(StepStatus.PASS, "Clicked on ALl incidents tab");
        else
            reporter.logStep(StepStatus.FAIL_WITH_SCREENSHOT, "Unable to click on All incidents link");
    }

    @When("I search for {string}")
    public void i_search_for(String string) {
        incidentsPage.switchToFrame();
        if(incidentsPage.searchIncident(string))
            reporter.logStep(StepStatus.PASS, "Entered " + string + " for search box");
        else
            reporter.logStep(StepStatus.FAIL_WITH_SCREENSHOT, "Unable to enter " + string + " in search box");
        incidentsPage.clickEnterKey();
    }

    @Then("I should get only {string} on results page")
    public void i_should_get_only(String string) {
        if(incidentsPage.getResultsCount() == 1 && incidentsPage.incidentNumberMatch(string))
            reporter.logStep(StepStatus.PASS, "Incident displayed is as expected: " + string);
        else
            reporter.logStep(StepStatus.FAIL_WITH_SCREENSHOT, "Incident displayed is not as expected");
    }

}
