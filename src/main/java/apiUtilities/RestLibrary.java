package apiUtilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import commonUtilities.ConfigFileReader;
import org.json.JSONObject;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebDriver;

public class RestLibrary {

    JSONObjectIterator jsonObjectIterator = new JSONObjectIterator();
    static ConfigFileReader configFileReader = new ConfigFileReader();
    private static final Map<String, Supplier<Response>> MAP = new HashMap<>();

    /**
     * This function returns a Response of the GET request.
     *
     */
    private static final Supplier<Response> getRequest = () -> {
        RequestSpecification requestSpecification = RestAssured.given().auth().basic(configFileReader.getUsername(), configFileReader.getPassword());
        requestSpecification.header("Content-Type", APIGlobals.contentType);
        return requestSpecification.get(APIGlobals.endPointURL);
    };

    /**
     * This function returns a Response of the PUT request.
     *
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
     *
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
     *
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

    public static Response request(String requestType){
        return MAP.get(requestType).get();
    }

    /**
     * This function takes schema file and validates response against given
     * schema file.
     *
     * @author Santosh Kundurthi
     * @param schemaFile- file name of Schema
     *
     */
    public void validateSchema(String schemaFile) {

        try {
            JsonSchemaValidator validator = JsonSchemaValidator
                    .matchesJsonSchema(new File(configFileReader.getTestDataPath() + "Schema/" + schemaFile));
            APIGlobals.response.then().body(validator);
        } catch (Exception oEx) {
            oEx.printStackTrace();
        }
    }

    /**
     * This function takes POJO Class and converts response object to POJO
     * object
     *
     * @author Santosh Kundurthi
     *
     */
    public void verifyValues(String POJOClass) {
        try {
            if (APIGlobals.userData.get("responseValues") != null) {
                jsonObjectIterator.handleJSONObject(new JSONObject(new Gson().toJson(
                        APIGlobals.response.getBody().as(Class.forName("com.mm.api_demo_project.responses." + POJOClass)))));
                for (Map.Entry<String, Object> entry : APIGlobals.userData.get("responseValues").entrySet())
                    if (entry.getValue().toString().equals(jsonObjectIterator.getValueFromKey(entry.getKey())))
                        /*reporter.logEvent(StepStatus.Pass, "Value " + entry.getKey() + " from response is as expected "
                                + entry.getValue().toString());*/
                    ;
                    else
                        ;/*
                        reporter.logEvent(StepStatus.Fail,
                                "Actual value for " + entry.getKey() + " from response "
                                        + jsonObjectIterator.getValueFromKey(entry.getKey())
                                        + " did not match with expected value " + entry.getValue().toString());*/

            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * This function returns response code
     *
     * @author Santosh Kundurthi
     *
     * @return Response Code
     *
     */
    public static int getResponseCode() {
        return APIGlobals.response.getStatusCode();
    }

    public static String setPathQueryParameters(String API){
        if (APIGlobals.userData.get("pathParameters") != null) {
            StringBuilder APIBuilder = new StringBuilder(API);
            for (Map.Entry<String, Object> entry : APIGlobals.userData.get("pathParameters").entrySet())
                APIBuilder.append("/").append(entry.getValue().toString());
            API = APIBuilder.toString();
        }
        if (APIGlobals.userData.get("queryParameters") != null) {
            API += "?";
            StringBuilder APIBuilder = new StringBuilder(API);
            for (Map.Entry<String, Object> entry : APIGlobals.userData.get("queryParameters").entrySet())
                APIBuilder.append(entry.getKey()).append("=").append(entry.getValue().toString());
            API = APIBuilder.toString();
        }
        return API;
    }
}