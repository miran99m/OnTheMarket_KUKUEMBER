package runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/default-cucumber-reports.html", 
				
		},
		features = "src/test/resources/features"
		,glue={"stepDefinition"},
		dryRun = false,
		tags = "@Gulgena and @VerifyHousesOnSale or @NegativeScenario"
		
		)



public class RunnerClass {

}
