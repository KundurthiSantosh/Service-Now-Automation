package tests;

import commonUtilities.ConfigFileReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestTest {
    public static void main(String[] args) {
        ConfigFileReader config = new ConfigFileReader();

        RestAssured.baseURI = config.getApiBaseUrl();

        RequestSpecification httpRequest = RestAssured.given().auth().basic("admin","jfawMOkVD46Y");

        Response response = httpRequest.get();

        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);

        System.out.println("Test");

    }
}
