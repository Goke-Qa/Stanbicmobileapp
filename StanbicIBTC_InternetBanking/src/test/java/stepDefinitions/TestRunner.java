package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features="src/test/resources/Features", 
glue = {"stepDefinitions"},
monochrome = true,
plugin = {"pretty","html:target/cucumber-reports/report.html"},
tags = "@smoke"
		)

public class TestRunner {

}
