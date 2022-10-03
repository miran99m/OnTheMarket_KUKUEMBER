package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;
import Utilities.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefClass extends CommonMethods {


	@Given("Browser is open")
	public void browser_is_open() {
	}

	@When("User hovers over Value my home tab")
	public void user_hovers_over_value_my_home_tab() {
    cm.hover(hp.valueMyHome);
    cm.wait(1);

	}

	@Then("click on Home Price Guide")
	public void click_on_home_price_guide() {
		hp.homePriceGuide.click();
		cm.wait(1);
	
	}

	@Then("If user is on Home Price guide page")
	public void user_verifies_title() {
		String actualTitle = driver.getTitle();
		String expectedTitle = BaseClass.getProperty("expectedTitle");
		Assert.assertEquals(actualTitle, expectedTitle);
		cm.wait(1);
	}

	@Then("Verify that Home Price Guide tab is selected")
	public void verify_that_home_price_guide_tab_is_selected() {
		hpg.homePriceGuideSearch.isSelected();
		cm.wait(1);
	}

	@Then("Click on Agent Valuation tab and verify it is selected")
	public void click_on_agent_valuation_tab_and_verify_it_is_selected() {
		hpg.agentValuation.click();
		hpg.agentValuation.isSelected();
		cm.wait(1);
	}

	@Then("Click on Instant Valuation tab and verify it is selected")
	public void click_on_instant_valuation_tab_and_verify_it_is_selected() {
		hpg.instantValuation.click();
		hpg.instantValuation.isSelected();
		cm.wait(1);
	}

	@Then("Enter postcode and hit enter")
	public void enter_postcode_and_hit_enter() {
		hpg.searchBar.sendKeys(BaseClass.getProperty("postcode"));
		hpg.searchBar.sendKeys(Keys.ENTER);
		cm.wait(1);
	}
	@Then("Verify user in on page for that specific post code")
	public void verify_user_in_on_page_for_that_specific_post_code() {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = BaseClass.getProperty("expectedURL");
		Assert.assertEquals(actualUrl, expectedUrl);
		cm.wait(1);
	}
	
	






}
