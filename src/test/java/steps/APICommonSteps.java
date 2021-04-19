package steps;

import java.util.Map;

import apiUtilities.APIGlobals;
import apiUtilities.RestLibrary;
import com.google.gson.JsonObject;
import commonUtilities.ConfigFileReader;
import commonUtilities.YamlReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class APICommonSteps {

    RestLibrary rest = new RestLibrary();
    YamlReader yaml = new YamlReader();
    ConfigFileReader config = new ConfigFileReader();

    @Given("^I want to test API \"([^\"]*)\" for test case \"([^\"]*)\"$")
    public void setAPIEndpointURL(String API, String testCaseName) {
        APIGlobals.userData = yaml.loadYaml(testCaseName.trim(), "testdata.yaml");
        API = RestLibrary.setPathQueryParameters(API.toLowerCase());
        APIGlobals.endPointURL = String.format("%s%s", config.getApiBaseUrl(), API);
        APIGlobals.testName = testCaseName;
    }

    @When("^I set header content type as \"([^\"]*)\"$")
    public void setHeader(String contentType) {
        if (contentType != null && !contentType.isEmpty()) {
            APIGlobals.contentType = contentType;
        }
    }

    @When("^I hit the API \"([^\"]*)\" of request type \"([^\"]*)\"$")
    public void submitRequest(String API, String requestType) {
        if (APIGlobals.userData.get("requestBody") != null) {
            JsonObject jsonObject = new JsonObject();
            for (Map.Entry<String, Object> entry : APIGlobals.userData.get("requestBody").entrySet())
                jsonObject.addProperty(entry.getKey(), (String) entry.getValue());
            APIGlobals.requestBody = jsonObject.toString();
        }
        APIGlobals.response = RestLibrary.request(requestType);
    }

    @Then("^I verify that the status code is \"([^\"]*)\"$")
    public void verifyStatusCode(String expectedResponseCode) {
        System.out.println(APIGlobals.response.prettyPrint());
        Assert.assertEquals(APIGlobals.response.getStatusCode(), Integer.parseInt(expectedResponseCode));
    }

    @And("^I validated response against schema \"([^\"]*)\"$")
    public void verifySchema(String schemaFileName) {
        rest.validateSchema(schemaFileName);
    }

    @And("^I validated the response values with \"([^\"]*)\"$")
    public void verifyValues(String POJOClass) {
        rest.verifyValues(POJOClass);
    }
}