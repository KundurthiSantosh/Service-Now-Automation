package runners;

import java.io.IOException;

import commonUtilities.Reporter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.APICommonSteps;

@CucumberOptions(
        features = "src/test/features/",
        glue = { "steps" },
        plugin = { "pretty", "json:target/cucumber.json" }
)

public class TestNGRunner extends AbstractTestNGCucumberTests {

    Reporter reporter = new Reporter();
    private static final Logger logger = LogManager.getLogger(TestNGRunner.class);

    @BeforeSuite
    public void initializeExtentReport(){
        logger.info("Intializing Test Suite");
        reporter.intializeReports();
        logger.info("Test Suite is intialized sucessfully");
    }

    @AfterSuite
    public void closeAndFlushExtentReport() {
        logger.info("Test Suite is flushed sucessfully");
        reporter.flushReport();
    }
}
