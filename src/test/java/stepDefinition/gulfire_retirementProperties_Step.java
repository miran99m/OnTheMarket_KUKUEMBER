package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;
import Utilities.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gulfire_retirementProperties_Step extends CommonMethods {

	@Given("User is on Home Page {string}")
	public void user_is_on_home_page(String string) {
		Assert.assertEquals(BaseClass.getDriver().getTitle(), string);

	}

	@When("Hover On Buy menu tab")
	public void hover_on_buy_menu_tab() {
		
		
	//	Actions actions = new Actions(BaseClass.getDriver());
		//actions.moveToElement(hp.BuyOption).perform();
		//System.out.println("Done Mouse hOVER ON 'Buy'");
		//rp.RetirementPropertiesOption.click();
		 
		
	cm.hover(hp.BuyOption);
	
	
	       
	} 

	@When("click on Retirement property for sale")
	public void click_on_retirement_property_for_sale() {

		cm.clickOnDropDownTab("Retirement property for sale");
//		rp.RetirementPropertiesOption.click();
	//	Actions action = new Actions(cm.getDriver());

		//action.moveToElement(rp.RetirementPropertiesOption).click().perform();

	}

	@When("Enter an invalid {string} into the input field under retirement properties tab")
	public void enter_an_invalid_into_the_input_field_under_retirement_properties_tab(String string) {
		rp.LocationInput.sendKeys(string);
		rp.searchButton.click();
	}

	@Then("It should display Location not recognised")
	public void it_should_display_location_not_recognised() {
		Assert.assertTrue(rp.CouldNotViewLocation.getText().contains("not recognised"));

	}

	@When("Enter {string} into the input field under retirement properties tab")
	public void enter_into_the_input_field_under_retirement_properties_tab(String string) {
		rp.LocationInput.sendKeys(string);
		rp.searchButton.click();
	}

	@When("Click On each of the properties below cv nb")
	public void click_on_each_of_the_properties_below_cv_nb() {
		rp.saleInHome.click();
	}

	@Then("The Retirement Text Should display")
	public void the_retirement_text_should_display() {
		Assert.assertEquals(rp.RetirementButton.getText(), "Retirement");
	}

}
