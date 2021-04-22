package tests;

import commonUtilities.ConfigFileReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RestTest {

    private static final Logger logger = LogManager.getLogger(RestTest.class);

    public static void main(String[] args) {
        ConfigFileReader config = new ConfigFileReader();

        RestAssured.baseURI = config.getApiBaseUrl();

        RequestSpecification httpRequest = RestAssured.given().auth().basic("admin","jfawMOkVD46Y");

        Response response = httpRequest.get();

        logger.error("Invoked API");

        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);

        System.out.println("Test");

    }
}
