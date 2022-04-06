package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/featureFile/harri.feature"
		,glue= {"stepDefinition"}, 
		monochrome = true
		)
public class cucumberSeleniumRunner {

}

