package runners;

import commonUtilities.Reporter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeTest;
import webUtilities.BaseTest;

@CucumberOptions(
        features = "src/test/features/IncidentPageWeb.feature",
        glue = {"steps"},
        plugin = {"pretty", "json:target/cucumber.json"}
)

public class TestNGRunnerWeb extends AbstractTestNGCucumberTests {

    Reporter reporter = new Reporter();
    BaseTest baseTest = new BaseTest();
    private static final Logger logger = LogManager.getLogger(TestNGRunnerAPI.class);

    @BeforeSuite
    public void initializeTestExecution() {
        logger.info("Initializing Test Suite");
        reporter.intializeReports();
        logger.info("Test Suite is initialized successfully");
    }

    @BeforeTest
    public void setUpDriver(){
        baseTest.getDriver();
    }

    @AfterTest
    public void tearDownDriver(){
        baseTest.quitDriver();
    }

    @AfterSuite
    public void closeAndFlushExtentReport() {
        logger.info("Test Suite is flushed successfully");
        reporter.flushReport();
    }
}
