package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features",
		glue = {"StepDef"},
		plugin = {"pretty",
				"html:target/site/cucumber-pretty",
				"json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/cucumber.xml"
		},
		monochrome = true,
		strict=true,
		dryRun=false
)
public class TestRunner {

}
