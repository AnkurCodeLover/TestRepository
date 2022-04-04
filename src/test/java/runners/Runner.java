package runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/featureFile/JApplication.feature"
		,glue= {"/ExamProject/src/main/java/stepDefinition/JAppyStepDefnition.java"},
		tags = { "@TestCodeNew1	" }, 
		monochrome = true
		)
public class Runner {

}
