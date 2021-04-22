package steps;

import apiUtilities.APIGlobals;
import apiUtilities.RestLibrary;
import commonUtilities.ConfigFileReader;
import commonUtilities.Reporter;
import commonUtilities.StepStatus;
import commonUtilities.YamlReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class APICommonSteps {

    RestLibrary rest = new RestLibrary();
    YamlReader yaml = new YamlReader();
    ConfigFileReader config = new ConfigFileReader();
    private static final Logger logger = LogManager.getLogger(APICommonSteps.class);
    Reporter reporter = new Reporter();

    @Given("^I want to test API \"([^\"]*)\" for test case \"([^\"]*)\"$")
    public void setAPIEndpointURL(String API, String testCaseName) {
        APIGlobals.userData = yaml.loadYaml(testCaseName.trim(), config.getAPITestDataFile());
        logger.info("Test Case = " + testCaseName);
        APIGlobals.testName = testCaseName;
        API = rest.setPathQueryParameters(API.toLowerCase());
        APIGlobals.endPointURL = String.format("%s%s", config.getApiBaseUrl(), API);
        if (APIGlobals.endPointURL != null) {
            reporter.logStep(StepStatus.PASS, "API URL set to " + APIGlobals.endPointURL);
            logger.info("API URL set to: " + APIGlobals.endPointURL);
        } else {
            reporter.logStep(StepStatus.FAIL, "API URL is not set");
            logger.error("API URL Set up failed");
        }

    }

    @When("^I set header content type as \"([^\"]*)\"$")
    public void setHeader(String contentType) {
        if (contentType != null && !contentType.isEmpty()) {
            logger.info("Content type set as " + contentType);
            APIGlobals.contentType = contentType;
            if (contentType != null) {
                reporter.logStep(StepStatus.PASS, "Content type for API is set to " + contentType);
                logger.info("Content type set to: " + contentType);
            } else {
                logger.error("Content type is not available from feature file!");
                reporter.logStep(StepStatus.FAIL, "Content type is not available from feature file");
            }
        }
    }

    @When("^I hit the API \"([^\"]*)\" of request type \"([^\"]*)\"$")
    public void submitRequest(String API, String requestType) {
        APIGlobals.requestBody = rest.setRequestBody();
        APIGlobals.response = rest.request(requestType);
        logger.info(API + " API of " + requestType + " request type is called!");
        reporter.logStep(StepStatus.PASS, API + " API of " + requestType + " request type is called!");
    }

    @Then("^I verify that the status code is \"([^\"]*)\"$")
    public void verifyStatusCode(String expectedResponseCode) {
        logger.info("Status code is validated!");
        if (APIGlobals.response.getStatusCode() == Integer.parseInt(expectedResponseCode)) {
            reporter.logStep(StepStatus.PASS, "Response code is as expected: " + expectedResponseCode);
        } else {
            reporter.logStep(StepStatus.FAIL, "Response code does not match. Expected: " + expectedResponseCode + " Actual: " + APIGlobals.response.getStatusCode());
            Assert.fail("Status code is not as expected: " + expectedResponseCode);
        }

    }

    @And("^I validated response against schema \"([^\"]*)\"$")
    public void verifySchema(String schemaFileName) {
        if(schemaFileName.trim().length() == 0) {
            logger.error("Schema file name is empty. Please provide schema file to validate.");
            reporter.logStep(StepStatus.FAIL, "Schema file is empty");
        }
        else
            if (rest.validateSchema(schemaFileName)){
                reporter.logStep(StepStatus.PASS, "Schema of API response body matches that of expected");
            }
    }

    @And("^I validated the response values with \"([^\"]*)\"$")
    public void verifyValues(String POJOClass) {
        rest.verifyValues(POJOClass);
    }
}