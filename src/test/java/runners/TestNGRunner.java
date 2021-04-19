package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "/home/santosh/IdeaProjects/Service-Now-Automation/src/test/features"
        ,glue = {"steps"}
        ,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        ,monochrome = true
        ,publish = true
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}