package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import Utilities.BaseClass;
import Utilities.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActionStepDef extends CommonMethods {

// Miran
	@When("user hover over ValueMyHome menu tab {string}")
	public void user_hover_over_value_my_home_menu_tab(String str) {
		cm.hoverOnMenuTab(str);
	}

	@When("click on sold prices under ValueMyHome menuTab {string}")
	public void click_on_sold_prices_under_value_my_home_menu_tab(String str) {
		cm.clickOnDropDownTab(str);
	}

	@When("user enters a valid UK {string}")
	public void user_enters_a_valid_uk(String postCode) {
		cm.sendText(sp.getSearchField(), postCode);
	}

	@When("click on search button to change the type")
	public void click_on_search_button_to_change_the_type() {
		click(sp.getSearchButton());
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
	

//	Gulfire
	@When("Hover On Buy menu tab")
	public void hover_on_buy_menu_tab() {
		cm.hover(hp.BuyOption);

	}

	@When("click on Retirement property for sale")
	public void click_on_retirement_property_for_sale() {
		cm.clickOnDropDownTab("Retirement property for sale");

	}

	@When("Enter an invalid {string} into the input field under retirement properties tab")
	public void enter_an_invalid_into_the_input_field_under_retirement_properties_tab(String string) {
		rp.LocationInput.sendKeys(string);
		rp.searchButton.click();
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
	

//	Tukta
	@When("User hover Agents button")
	public void user_hover_agents_button() {
		hover(hp.agentBtn);
		cm.wait(2);
	}

	@When("User click on findEstateLettingAgents button")
	public void user_click_on_find_estate_letting_agents_button() {
		fep.findEstateLettingAgentBtn.click();
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

	@When("User click on Email agent button choose the first one")
	public void user_click_on_email_agent_button_choose_the_first_one() {
		lap.emailAgentBtn.click();
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
		cap.submitBtn.click();

	}
	

//	Nariman
	@When("User hover Agents menu tab")
	public void user_hover_agents_menu_tab() {
		cm.hover(hp.agentBtn);
	}

	@When("User click on Book an agent visit")
	public void user_click_on_book_an_agent_visit() {
		hp.bookAnAgentVisit.click();
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
	
	
//	Christian
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
    
    
//	Gulgena
    
    @When("Hover on New Homes Tab")
    public void hover_on_new_homes_tab() {
    cm.hoverOnMenuTab("New homes");
    }

 
    @When("Click on the New homes for sale")
    public void click_on_the_new_homes_for_sale() {
        cm.clickOnDropDownTab("New homes for sale");
    }

    @When("Write a  UK zip code  in the  question box {string}")
    public void write_a_uk_zip_code_in_the_question_box(String string) {
        nfs.AddressInput.sendKeys(string);
        nfs.SearchButton.click();
    }

    @When("we click on the houses for sale tab")
    public void we_click_on_the_houses_for_sale_tab() {
        nfs.houseForSale.click();
    }

    @When("Write a zip code  in the  question box {string}")
    public void write_a_zip_code_in_the_question_box(String string) {
         nfs.AddressInput.sendKeys(string);
         nfs.SearchButton.click();
    }


}
