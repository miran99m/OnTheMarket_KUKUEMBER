package stepDefinition;

import org.junit.Assert;

import Utilities.BaseClass;
import Utilities.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assertion_StepDefs extends CommonMethods{


	@Given("User is on Home Page {string}")
	public void user_is_on_home_page(String string) {
		assertCurrentTitles(string);
	}
	
//  Miran 
	@Then("it shows only homes with that postCode")
	public void it_shows_only_homes_with_that_postCode() {
		Assert.assertTrue(ssp.codeMatchesHousesListed());
	}

	@Then("all homes with that {string} should show")
	public void all_homes_with_that_should_show(String propType) {
		Assert.assertTrue(ssp.propertyTypeMatches(propType));
	}
	
	
// Gulfire

	@Then("It should display Location not recognised")
	public void it_should_display_location_not_recognised() {
		Assert.assertTrue(rp.CouldNotViewLocation.getText().contains("not recognised"));
	}
	@Then("The Retirement Text Should display")
	public void the_retirement_text_should_display() {
		Assert.assertEquals(rp.RetirementButton.getText(), "Retirement");
	}
	
//	Tukta
	@When("User should be on findAgents page")
	public void user_should_be_on_find_agents_page() {
		assertCurrentUrl(BaseClass.getProperty("agentPageURL"));
	}
	@Then("User should be on Letting agents & estate agents in London Page")
	public void user_should_be_on_letting_agents_estate_agents_in_london_page() {
		cm.wait(2);
		assertCurrentTitles("Estate agents in London | Letting agents | OnTheMarket");
	}
	@When("User should be on Contact Agent page")
	public void user_should_be_on_contact_agent_page() {
		cm.wait(2);
		assertCurrentTitles("OnTheMarket | Property, Houses & Flats for Sale & to Rent");
	}
	@Then("User should be on One Click Properties page")
	public void user_should_be_on_one_click_properties_page() {
		cm.wait(2);
		assertCurrentTitles("1 Clickproperties - Acton | OnTheMarket");
	}
	

//	Nariman
	
	@Then("User should be on arange a free agent valuation page")
	public void user_should_be_on_arange_a_free_agent_valuation_page() {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = BaseClass.getProperty("property-valuationURL");
		Assert.assertEquals(actualUrl, expectedUrl);
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
	
// Chrisitan
    @Then("If user is on Home Price guide page")
    public void user_verifies_title() {
        String actualTitle = driver.getTitle();
        String expectedTitle = BaseClass.getProperty("expectedTitle");
        Assert.assertEquals(actualTitle, expectedTitle);
        cm.wait(1);
    }
    @Then("Verify user in on page for that specific post code")
    public void verify_user_in_on_page_for_that_specific_post_code() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = BaseClass.getProperty("expectedURL");
        Assert.assertEquals(actualUrl, expectedUrl);
        cm.wait(1);
    }
    
// Gulgena
    @Then("houses for sell displayed")
    public void houses_for_sell_displayed() {
    Assert.assertEquals(nfs.NewBuild.getText(), "New build");
    }
    @Then("Message Location not recognised")
    public void message_location_not_recognised() {
        Assert.assertTrue(nfs.unrecognisedLocation.getText().contains("not recognised"));
    }


	
	
	
	
}
