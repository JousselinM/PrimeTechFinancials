package runners;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/features",//this to specify the location of the feature files so cucumber can find 
		glue="tests",//this specify the location of step definitions so that cucumber can map with the scenario
		//dry run when it's true, it scans the whole future files
		
		tags="@newCustomerTableList"
		)
public class DryRunner {

}
