package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import Utilities.BaseClass;
import Utilities.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Miran_SearchFunc_SoldHouse extends CommonMethods {

	@Given("user is on onTheMarket Landing Page")
	public void user_is_on_on_the_market_landing_page() {
		assertCurrentTitles(BaseClass.getProperty("expectedHomeTitle"));
	}

	@When("user hover over ValueMyHome menu tab")
	public void user_hover_over_value_my_home_menu_tab() {
		cm.hoverOnMenuTab(BaseClass.getProperty("valueMyHomeTab"));
	}

	@When("click on sold prices under ValueMyHome menuTab")
	public void click_on_sold_prices_under_value_my_home_menu_tab() {
		cm.clickOnDropDownTab(BaseClass.getProperty("soldPricesDropDownTab"));
	}

	@When("user enters a valid UK {string}")
	public void user_enters_a_valid_uk(String postCode) {
		cm.sendText(sp.getSearchField(), postCode);
	}

	@When("click on search button to change the type")
	public void click_on_search_button_to_change_the_type() {
		click(sp.getSearchButton());
	}

	@Then("it shows only homes with that postCode")
	public void it_shows_only_homes_with_that_postCode() {
		Assert.assertTrue(ssp.codeMatchesHousesListed());
	}

	@When("user selects a {string} under the prototype dropdown")
	public void user_selects_a_under_the_prototype_dropdown(String propType) {
		ssp.getPropertyType().click();
		selectByVisibleText(ssp.getPropertyType(), propType);
	}

	@When("click on search button")
	public void click_on_search_button() {
		ssp.getSearchButton().click();
	}

	@Then("all homes with that {string} should show")
	public void all_homes_with_that_should_show(String propType) {
		Assert.assertTrue(ssp.propertyTypeMatches(propType));
		
	}

}
