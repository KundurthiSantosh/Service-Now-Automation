package commonUtilities;

import jdk.nashorn.internal.objects.NativeRegExp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath= "src/test/resources/configuration.properties";


    public ConfigFileReader(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getDriverPath(){
        String driverPath = properties.getProperty("drivers-path");
        if(driverPath!= null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }

    public long getImplicitWait() {
        String implicitlyWait = properties.getProperty("implicit-wait");
        if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
        else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
    }

    public String getApiBaseUrl() {
        String url = properties.getProperty("api-base-url");
        if(url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    public String getTestDataPath(){
        String testDataPath = properties.getProperty("test-data-path");
        if(testDataPath != null) return testDataPath;
        else throw new RuntimeException("test data path not specified in the Configuration.properties file.");
    }

    public String getUsername(){
        String username = properties.getProperty("username");
        if(username != null) return username;
        else
            throw new RuntimeException("Username not found in the Configuration.properties file.");
    }

    public String getPassword(){
        String password = properties.getProperty("password");
        if(password != null) return password;
        else
            throw new RuntimeException("Password not found in the Configuration.properties file.");
    }
}