package apiUtilities;

import java.io.File;
import java.util.Map;

import commonUtilities.ConfigFileReader;
import org.json.JSONObject;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestLibrary {

    JSONObjectIterator jsonObjectIterator = new JSONObjectIterator();
    ConfigFileReader configFileReader = new ConfigFileReader();

    /**
     * This function returns a Response of the GET request.
     *
     * @author Santosh Kundurthi
     * @return Response of GET request
     */
    public Response GETRequest() {
        RequestSpecification requestSpecification = RestAssured.given().auth().basic(configFileReader.getUsername(), configFileReader.getPassword());
        requestSpecification.header("Content-Type", APIGlobals.contentType);
        return requestSpecification.get(APIGlobals.endPointURL);

    }

    /**
     * This function returns a Response of the PUT request.
     *
     * @author Santosh Kundurthi
     * @return Response of PUT request
     */
    public Response PUTRequest() {
        RequestSpecification requestSpecification = RestAssured.given().auth().basic(configFileReader.getUsername(), configFileReader.getPassword());
        requestSpecification.header("Content-Type", APIGlobals.contentType);
        if (APIGlobals.requestBody.length() > 0) {
            requestSpecification.body(APIGlobals.requestBody);
            return requestSpecification.put(APIGlobals.endPointURL);
        } else {
            return null;
        }
    }

    /**
     * This function returns a Response of the DELETE request.
     *
     * @author Santosh Kundurthi
     * @return Response of DELETE request
     */
    public Response DELETERequest() {
        RequestSpecification requestSpecification = RestAssured.given().auth().basic(configFileReader.getUsername(), configFileReader.getPassword());
        requestSpecification.header("Content-Type", APIGlobals.contentType);
        if (APIGlobals.requestBody.length() > 0) {
            requestSpecification.body(APIGlobals.requestBody);
            return requestSpecification.delete(APIGlobals.endPointURL);
        } else {
            return null;
        }
    }

    /**
     * This function returns a Response of the POST request.
     *
     * @author Santosh Kundurthi
     * @return Response of POST request
     */
    public Response POSTRequest() {
        RequestSpecification requestSpecification = RestAssured.given().auth().basic(configFileReader.getUsername(), configFileReader.getPassword());
        requestSpecification.header("Content-Type", APIGlobals.contentType);
        if (APIGlobals.requestBody.length() > 0) {
            requestSpecification.body(APIGlobals.requestBody);
            return requestSpecification.post(APIGlobals.endPointURL);
        } else {
            return null;
        }
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
     * @param POJOClass
     *
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

            } else
                ;
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
}