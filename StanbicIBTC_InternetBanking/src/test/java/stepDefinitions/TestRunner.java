package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/login.feature", 
glue = {"stepDefinitions"},
monochrome = true,
plugin = {"pretty","html:target/cucumber-reports/report.html"})

public class TestRunner {

}
