package stepDefinition;

import org.junit.Assert;

import Utilities.BaseClass;
import Utilities.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Gulgena_searchNewHomesForSale_Step extends CommonMethods {
   
	

	@When("Hover on New Homes Tab")
	public void hover_on_new_homes_tab() {
	cm.hover(hp.NewHomesTab);
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

    @Then("houses for sell displayed")
	public void houses_for_sell_displayed() {
	Assert.assertEquals(nfs.NewBuild.getText(), "New build");
	}

	@When("Write a zip code  in the  question box {string}")
	public void write_a_zip_code_in_the_question_box(String string) {
		 nfs.AddressInput.sendKeys(string);
		 nfs.SearchButton.click();
	}

	@Then("Message Location not recognised")
	public void message_location_not_recognised() {
		Assert.assertTrue(nfs.unrecognisedLocation.getText().contains("not recognised"));
	}
}
