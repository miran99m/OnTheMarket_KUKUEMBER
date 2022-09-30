package stepDefinition;

import org.junit.Assert;

import Utilities.BaseClass;
import Utilities.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookAgentNariman extends CommonMethods {
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		BaseClass.getDriver();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = BaseClass.getProperty("url");
		Assert.assertEquals(expectedUrl, expectedUrl);
	}

	@When("User hover Agents menu tab")
	public void user_hover_agents_menu_tab() {
		cm.hover(hp.agentBtn);
	}

	@When("User click on Book an agent visit")
	public void user_click_on_book_an_agent_visit() {
		hp.bookAnAgentVisit.click();
	}

	@Then("User should be on arange a free agent valuation page")
	public void user_should_be_on_arange_a_free_agent_valuation_page() {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = BaseClass.getProperty("property-valuationURL");
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@When("User enters postcode")
	public void user_enters_postcode() {
		pv.postCode.sendKeys("L22DP");
	}

	@When("User clicks on Lets Go button")
	public void user_clicks_on_lets_go_button() {
		pv.LetsGoBtn.click();
	}

	@When("User select address")
	public void user_select_address() {
		cm.dynamicDropDown(pv.addressDropDown, "2 Tithebarn Street");
	}

	@When("User selects reason for valuation")
	public void user_selects_reason_for_valuation() {
		cm.dynamicDropDown(pv.reasonForValuation, "Selling your property");
	}

	@When("press Continue button")
	public void press_continue_button() {
		pv.continueBtn.click();
	}

	@When("User enters {string}")
	public void user_enters(String fullName) {
		pv.FullName.sendKeys(fullName);
	}

	@When("User enters valid {string}")
	public void user_enters_valid(String email) {
		pv.email.sendKeys(email);
	}
	@When("User enters valid {string} number")
	public void user_enters_valid_number(String string) {
	    pv.telephone.sendKeys(string);
	}

	@When("User leaves telephone blank")
	public void user_leaves_telephone_blank() {
		pv.telephone.sendKeys("");
	}

	@When("User selects Im ready now as when are you looking to market your property")
	public void user_selects_im_ready_now_as_when_are_you_looking_to_market_your_property() {
		cm.dynamicDropDown(pv.whenToMarketDropDown, "I'm ready now");
	}

	@When("User opts out from contact list")
	public void user_opts_out_from_contact_list() {
		pv.noOffersBtn.click();
	}

	@When("User clicks Send button")
	public void user_clicks_send_button() {
		pv.send.click();
	}

	@Then("User should receive Please enter a valid telephone number on the next page")
	public void user_should_receive_please_enter_a_valid_telephone_number_on_the_next_page() {
		String errmsg = pv.validTelephoneNumber.getText();
		Assert.assertEquals(errmsg, "Please enter a valid telephone number");
	}

	@Then("User should receive Your request for a property valuation has been sent to you on the next page")
	public void user_should_receive_your_request_for_a_property_valuation_has_been_sent_to_you_on_the_next_page() {
		String confMsg = pv.confirmtionMsg.getText();
		Assert.assertEquals(confMsg, "Your request for a property valuation has been sent to your chosen agents.");



	}

}
