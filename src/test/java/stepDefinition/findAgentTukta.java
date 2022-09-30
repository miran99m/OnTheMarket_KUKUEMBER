package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import Utilities.BaseClass;
import Utilities.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class findAgentTukta extends CommonMethods{
	
	

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = BaseClass.getProperty("url");
		Assert.assertEquals(actualUrl,expectedUrl);
		}
	    

	@When("User hover Agents button")
	public void user_hover_agents_button() {
		hover(hp.agentBtn);
		cm.wait(2);
	}

	@When("User click on findEstateLettingAgents button")
	public void user_click_on_find_estate_letting_agents_button() {
		fep.findEstateLettingAgentBtn.click();
	}

	@When("User should be on findAgents page")
	public void user_should_be_on_find_agents_page() {
		String actualURL = driver.getCurrentUrl();
		String expectedURL = BaseClass.getProperty("agentPageURL");
		Assert.assertEquals(actualURL,expectedURL);
	}

	@When("User click on searchTextBox")
	public void user_click_on_search_text_box() {
	    fap.searchTextBox.click();
	}

	@When("User enter London as a City in seachTextBox")
	public void user_enter_london_as_a_city_in_seach_text_box() {
		fap.searchTextBox.sendKeys("London");
		scrollByPixel(250);
	}

	@When("User click on MagnifyingGlass")
	public void user_click_on_magnifying_glass() {
	    fap.maginfyingGlassBtn.click();
	}

	@Then("User should be on Letting agents & estate agents in London Page")
	public void user_should_be_on_letting_agents_estate_agents_in_london_page() {
		Assert.assertEquals(BaseClass.getDriver().getTitle(),"Estate agents in London | Letting agents | OnTheMarket");
	}

//===========================================================================================
	
	@When("User click on Email agent button choose the first one")
	public void user_click_on_email_agent_button_choose_the_first_one() {
		lap.emailAgentBtn.click();
	}

	@When("User should be on Contact Agent page")
	public void user_should_be_on_contact_agent_page() {
		Assert.assertEquals(BaseClass.getDriver().getTitle(),"OnTheMarket | Property, Houses & Flats for Sale & to Rent");

	}

	@When("User enter full name in textbox {string}")
	public void user_enter_full_name_in_textbox(String string) {
		cap.fullNameBox.sendKeys(string);
	}

	@When("User enter email in textbox {string}")
	public void user_enter_email_in_textbox(String string) {
		cap.emailBox.sendKeys(string);
	}

	@When("User enter phone number in textbox {string}")
	public void user_enter_phone_number_in_textbox(String string) {
		cap.phoneBox.sendKeys(string);
	}

	@When("User enter post code in textbox {string}")
	public void user_enter_post_code_in_textbox(String string) {
		cap.postcodeBox.sendKeys(string);
	}

	@When("User click on I have property to sell dropDown button choose option no")
	public void user_click_on_i_have_property_to_sell_drop_down_button_choose_option_no() {
		cm.selectByVisibleText(cap.IhavePropertyToSellBox, "No");
	}

	@When("User click on I have property to rent dropDown button choose option no")
	public void user_click_on_i_have_property_to_rent_drop_down_button_choose_option_no() {
		cm.selectByVisibleText(cap.IhavePropertyToRentBox, "No");
	}

	@When("User click on radio button OntheMarket can Contact me with relevant properties choose no")
	public void user_click_on_radio_button_onthe_market_can_contact_me_with_relevant_properties_choose_no() {
		cm.scrollByPixel(200);		
		cap.noRadioBtn.click();
		
	}

	@When("User click submit button")
	public void user_click_submit_button() {
		cap.submitBtn.click();	}

	@Then("User should be on One Click Properties page")
	public void user_should_be_on_one_click_properties_page() {
		//Assert.assertEquals(BaseClass.getDriver().getTitle(),"1 Clickproperties - Action | OnTheMarket");
		assertTitles("1 Clickproperties - Acton | OnTheMarket");
	}
	
	
	
}
	
	
	
	