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

public class APICommonSteps {

    RestLibrary rest = new RestLibrary();
    YamlReader yaml = new YamlReader();
    ConfigFileReader config = new ConfigFileReader();

    @Given("^I want to test API \"([^\"]*)\" for test case \"([^\"]*)\"$")
    public void setAPIEndpointURL(String API, String testCaseName){
        APIGlobals.userData = yaml.loadYaml(testCaseName.trim(), "testdata.yml");
        if (APIGlobals.userData.get("pathParameters") != null) {
            for (Map.Entry<String, Object> entry : APIGlobals.userData.get("pathParameters").entrySet())
                API += "/" + entry.getValue().toString();
        }
        if (APIGlobals.userData.get("queryParameters") != null) {
            API += "?";
            for (Map.Entry<String, Object> entry : APIGlobals.userData.get("queryParameters").entrySet())
                API += entry.getKey() + "=" + entry.getValue().toString();
        }
        APIGlobals.endPointURL = String.format("%s%s", config.getApiBaseUrl(), API);
        APIGlobals.testName = testCaseName;
        System.out.println("URL " + APIGlobals.endPointURL);
    }

    @When("^I set header content type as \"([^\"]*)\"$")
    public void setHeader(String contentType) {
        if (contentType != null && !contentType.isEmpty()) {
            APIGlobals.contentType = contentType;
        } else {
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
        switch (requestType) {
            case "GET":
                APIGlobals.response = rest.GETRequest();
                break;

            case "POST":
                APIGlobals.response = rest.POSTRequest();
                break;

            case "PUT":
                APIGlobals.response = rest.PUTRequest();
                break;

            case "DELETE":
                APIGlobals.response = rest.DELETERequest();
                break;

            default:
                break;
        }
    }

    @Then("^I verify that the status code is \"([^\"]*)\"$")
    public void verifyStatusCode(String expectedResponseCode) {
        if (expectedResponseCode.equals(String.valueOf(RestLibrary.getResponseCode()))) {

        } else {

        }
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