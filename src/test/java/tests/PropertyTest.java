package tests;

import commonUtilities.ConfigFileReader;

public class PropertyTest {

    public static void main(String[] args) {
        ConfigFileReader config = new ConfigFileReader();

        System.out.println("Implicit Wait " + config.getImplicitWait());
        System.out.println("Driver Path " + config.getDriverPath());
        System.out.println("API Base URL " + config.getApiBaseUrl());
    }
}
