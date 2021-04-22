package webUtilities;

import commonUtilities.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {
    ConfigFileReader configFileReader = new ConfigFileReader();
    private static final Supplier<WebDriver> chromeSupplier = () -> {
        System.setProperty("webdriver.chrome.driver", TestCaseHelper.DRIVER_PATH + "/chromedriver");
        return new ChromeDriver();
    };
    private static final Supplier<WebDriver> firefoxSupplier = () -> {
        System.setProperty("webdriver.gecko.driver", TestCaseHelper.DRIVER_PATH + "/geckodriver");
        return new FirefoxDriver();
    };

    private static final Map<String, Supplier<WebDriver>> MAP = new HashMap<>();

    static{
        MAP.put("chrome", chromeSupplier);
        MAP.put("firefox", firefoxSupplier);
    }

    public static WebDriver getDriver(String browser){
        return MAP.get(browser).get();
    }
}
