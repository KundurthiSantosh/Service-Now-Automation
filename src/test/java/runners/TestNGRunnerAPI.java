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
        features = "src/test/features/IncidentTableAPI.feature",
        glue = {"steps"},
        plugin = {"pretty", "json:target/cucumber.json"}
)

public class TestNGRunnerAPI extends AbstractTestNGCucumberTests {

    Reporter reporter = new Reporter();
    private static final Logger logger = LogManager.getLogger(TestNGRunnerAPI.class);

    @BeforeSuite
    public void initializeExtentReport() {
        logger.info("Initializing Test Suite");
        reporter.intializeReports();
        logger.info("Test Suite is initialized successfully");
    }

    @AfterSuite
    public void closeAndFlushExtentReport() {
        logger.info("Test Suite is flushed successfully");
        reporter.flushReport();
    }
}
