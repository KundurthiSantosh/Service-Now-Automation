package webUtilities;

import commonUtilities.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class BaseTest {

    public static WebDriver driver = null;
    ConfigFileReader configFileReader = new ConfigFileReader();

    public WebDriver getDriver() {
        if (driver != null) {
            return driver;
        }

        String hub = System.getProperty("HUB_HOST");
        String browser = System.getProperty("BROWSER");
        DesiredCapabilities dc;
        if (hub == null) {
            if (browser == null|| browser.equalsIgnoreCase("chrome"))
                driver = DriverFactory.getDriver("chrome");
            else if (browser.equalsIgnoreCase("firefox"))
                driver = DriverFactory.getDriver(browser);
            else
                return null;
        } else {
            if (browser.equalsIgnoreCase("firefox"))
                dc = DesiredCapabilities.firefox();
            else
                dc = DesiredCapabilities.chrome();
            String completeUrl = "http://" + hub + ":4444/wd/hub";
            try {
                this.driver = new RemoteWebDriver(new URL(completeUrl), dc);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        return driver;
    }

    public void gotoBaseURL(){
        driver.manage().window().maximize();
        driver.get(configFileReader.getWebBaseUrl());
    }
    public void quitDriver() {
        if (null != driver) {
            driver.quit();
        }
    }

}