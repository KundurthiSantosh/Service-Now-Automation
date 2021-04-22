package steps;

import commonUtilities.Reporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import runners.TestNGRunner;

public class CucumberHooks {

    private static final Logger logger = LogManager.getLogger(CucumberHooks.class);
    Reporter reporter = new Reporter();

    @Before
    public void reportFeatureStart(Scenario scenario){
        logger.info("Scenario " + scenario.getName()+ " execution started!");
        reporter.startTest(scenario.getName());
    }

}
