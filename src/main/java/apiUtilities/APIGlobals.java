package apiUtilities;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class APIGlobals {

    public static String endPointURL;
    public static String testName;
    public static String scenarioName;
    public static String contentType;
    public static String statusCode;
    public static String inputJsonPath;
    public static String requestBody;
    public static Map<String, Map<String, Object>> userData = new HashMap<String, Map<String, Object>>();
    public static Response response;
}
