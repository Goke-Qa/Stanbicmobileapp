package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		features="src/test/resources/features",
		glue="steps",
		dryRun=true,
		//monochrome = true,
		plugin= {"pretty", "html:test-output", "html:target/cucumber-reports/report.html"}
		//tags =  "@smoke or @functional"
				
		)
public class TestRunner {

}
