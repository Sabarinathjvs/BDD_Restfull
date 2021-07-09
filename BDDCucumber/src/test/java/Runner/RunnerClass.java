package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/Featurefile/Login.feature",
		glue= {"StepDefinition"},
		dryRun=false, //to check all features are defined in step definitions file
		monochrome=true, //for pretty output in readable format
		strict=true,
		tags= {"@Test"}
		)

public class RunnerClass {

}
	