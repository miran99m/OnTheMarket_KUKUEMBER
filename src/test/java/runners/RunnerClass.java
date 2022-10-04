package runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/default-cucumber-reports.html", 
				
		},
		features = "src/test/resources/features"
		,glue="stepDefinition",
		dryRun = false,
		tags = "@ltest1"
		
		)



public class RunnerClass {

}
