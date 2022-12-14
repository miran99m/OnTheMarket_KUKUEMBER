package stepDefinition;

import Utilities.BaseClass;
import Utilities.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void start() {
		BaseClass.getDriver();
	}
	@After
	public void end(Scenario scenario) {
		
		byte[] pic;
		if(scenario.isFailed()) {
			pic=CommonMethods.takeScreenshot("Failed/" + scenario.getName());
		}else {
			pic=CommonMethods.takeScreenshot("Pass/" + scenario.getName());
		}
		scenario.attach(pic, "image/png", scenario.getName());
		BaseClass.tearDown();
	}

}
