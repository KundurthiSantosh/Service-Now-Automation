package apiUtilities;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import commonUtilities.ConfigFileReader;
import commonUtilities.Reporter;
import commonUtilities.StepStatus;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.testng.Assert;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class RestLibrary {

    JSONObjectIterator jsonObjectIterator = new JSONObjectIterator();
    static ConfigFileReader configFileReader = new ConfigFileReader();
    private static final Map<String, Supplier<Response>> MAP = new HashMap<>();
    private static final Logger logger = LogManager.getLogger(RestLibrary.class);
    Reporter reporter = new Reporter();

    /**
     * This function returns a Response of the GET request.
     */
    private static final Supplier<Response> getRequest = () -> {
        RequestSpecification requestSpecification = RestAssured.given().auth().basic(configFileReader.getUsername(), configFileReader.getPassword());
        requestSpecification.header("Content-Type", APIGlobals.contentType);
        return requestSpecification.get(APIGlobals.endPointURL);
    };

    /**
     * This function returns a Response of the PUT request.
     */
    private static final Supplier<Response> putRequest = () -> {
        RequestSpecification requestSpecification = RestAssured.given().auth().basic(configFileReader.getUsername(), configFileReader.getPassword());
        requestSpecification.header("Content-Type", APIGlobals.contentType);
        if (APIGlobals.requestBody.length() > 0) {
            requestSpecification.body(APIGlobals.requestBody);
            return requestSpecification.put(APIGlobals.endPointURL);
        } else
            return null;
    };

    /**
     * This function returns a Response of the POST request.
     */
    private static final Supplier<Response> postRequest = () -> {
        RequestSpecification requestSpecification = RestAssured.given().auth().basic(configFileReader.getUsername(), configFileReader.getPassword());
        requestSpecification.header("Content-Type", APIGlobals.contentType);
        if (APIGlobals.requestBody.length() > 0) {
            requestSpecification.body(APIGlobals.requestBody);
            return requestSpecification.post(APIGlobals.endPointURL);
        } else
            return null;
    };

    /**
     * This function returns a Response of the DELETE request.
     */
    private static final Supplier<Response> deleteRequest = () -> {
        RequestSpecification requestSpecification = RestAssured.given().auth().basic(configFileReader.getUsername(), configFileReader.getPassword());
        requestSpecification.header("Content-Type", APIGlobals.contentType);
        if (APIGlobals.requestBody.length() > 0) {
            requestSpecification.body(APIGlobals.requestBody);
            return requestSpecification.delete(APIGlobals.endPointURL);
        } else
            return null;
    };

    static {
        MAP.put("GET", getRequest);
        MAP.put("PUT", putRequest);
        MAP.put("POST", postRequest);
        MAP.put("DELETE", deleteRequest);
    }

    private JsonObject jsonObject;

    public Response request(String requestType) {
        return MAP.get(requestType).get();
    }

    /**
     * This function takes schema file and validates response against given
     * schema file.
     *
     * @param schemaFile- file name of Schema
     * @author Santosh Kundurthi
     */
    public boolean validateSchema(String schemaFile) {
        try {
            JsonSchemaValidator validator = JsonSchemaValidator
                    .matchesJsonSchema(new File(System.getProperty("user.dir") + configFileReader.getTestDataPath() + "schemas/" + schemaFile));
            APIGlobals.response.then().assertThat().body(validator);
            return true;
        } catch (Exception oEx) {
            oEx.printStackTrace();
            return false;
        }
    }

    /**
     * This function takes POJO Class and converts response object to POJO
     * object
     *
     * @author Santosh Kundurthi
     */
    public void verifyValues(String POJOClass) {
        try {
            if (APIGlobals.userData.get("responseValues") != null) {
                jsonObjectIterator.handleJSONObject(new JSONObject(new Gson().toJson(
                        APIGlobals.response.getBody().as(Class.forName("responses." + POJOClass)))));
                for (Map.Entry<String, Object> entry : APIGlobals.userData.get("responseValues").entrySet())
                    if (jsonObjectIterator.hasKey(entry.getKey()))
                        if (entry.getValue().toString().equals(jsonObjectIterator.getValueFromKey(entry.getKey())))
                            reporter.logStep(StepStatus.PASS, "Value " + entry.getKey() + " from response is as expected "
                                    + entry.getValue().toString());
                        else
                            reporter.logStep(StepStatus.FAIL,
                                    "Actual value for " + entry.getKey() + " from response "
                                            + jsonObjectIterator.getValueFromKey(entry.getKey())
                                            + " did not match with expected value " + entry.getValue().toString());
                    else {
                        reporter.logStep(StepStatus.FAIL, entry.getKey() + " does not exists in response body!");
                        Assert.fail(entry.getKey() + " does not exists in response body!");
                    }
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String setRequestBody() {
        JsonObject jsonObject = new JsonObject();
        if (APIGlobals.userData.get("requestBody") != null) {
            for (Map.Entry<String, Object> entry : APIGlobals.userData.get("requestBody").entrySet())
                jsonObject.addProperty(entry.getKey(), (String) entry.getValue());
        }
        return jsonObject.toString();
    }

    public int getResponseCode() {
        return APIGlobals.response.getStatusCode();
    }

    public String setPathQueryParameters(String API) {
        if (APIGlobals.userData.get("pathParameters") != null) {
            StringBuilder APIBuilder = new StringBuilder(API);
            for (Map.Entry<String, Object> entry : APIGlobals.userData.get("pathParameters").entrySet()) {
                APIBuilder.append("/").append(entry.getValue().toString());
                logger.info("Path parameter " + entry.getValue().toString() + " is appended to endpoint");
            }
            API = APIBuilder.toString();
        }
        if (APIGlobals.userData.get("queryParameters") != null) {
            API += "?";
            StringBuilder APIBuilder = new StringBuilder(API);
            for (Map.Entry<String, Object> entry : APIGlobals.userData.get("queryParameters").entrySet()) {
                APIBuilder.append(entry.getKey()).append("=").append(entry.getValue().toString());
                logger.info("Query parameter " + entry.getKey() + " = " + entry.getValue().toString() + " is appended to endpoint");
            }
            API = APIBuilder.toString();
        }
        return API;
    }
}