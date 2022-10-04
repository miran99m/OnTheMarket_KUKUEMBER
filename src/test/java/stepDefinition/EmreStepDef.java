package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import Utilities.BaseClass;
import Utilities.CommonMethods;
import Utilities.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmreStepDef extends CommonMethods {

	
//	  Select select;
//
//	    @Given("User is on Home Page")
//	    public void user_is_on_home_page() {
////	        BaseClass.getDriver();
//	    }
//
//	    @When("User clicks on rent button")
//	    public void user_clicks_on_rent_button() {
//	        hp.rentButton.click();
//	    }
//
//	    @Then("User should be directed to Rent Search Page")
//	    public void user_should_be_directed_to_Rent_Search_Page() {
//	        Assert.assertEquals("propertiesToRentURL", BaseClass.getDriver().getCurrentUrl());
//	    }
//
//	    // ----------------------------------------------------
//
//	    @Given("User is on Rent Search Page")
//	    public void user_is_on_rent_search_page() {
//	        BaseClass.getDriver().get("propertiesToRentPageURL");
//	    }
//
//	    @When("User clicks on search field, send keys UK, press enter, click price button, click min. button, click ₤100 pcm, click max. button, select ₤500 pcm, click apply button")
//	    public void user_clicks_many_buttons() {
//	        rsp.searchField.click();
//	        rsp.searchField.sendKeys("UK", Keys.ENTER);
//	        rsp.priceButton.click();
//	        rsp.minButton.click();
//	        select.selectByVisibleText("₤100 pcm");
//	        rsp.maxButton.click();
//	        select.selectByVisibleText("₤500 pcm");
//	        rsp.applyButton.click();
//
//	    }
//
//	    @Then("User should be on the page of filtered prices")
//	    public void user_should_be_on_the_page_of_filtered_prices() {
//	        Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Constants.filteredUrl);
//	    }
//	    
//	    
//	    
//	    
//	    
//	    
//	    
//	    @Given("User is on Rent Search Page")
//	    public void user_is_on_Rent_Search_Page() {
//	        BaseClass.getDriver().get("propertiesToRentPageURL");
//	    }
//	    
//	    @When("User clicks on rent buttonn")
//	    public void user_clicks_on_rent_buttonn() {
//	        hp.rentButton.click();
//	    }
//
//	    @Then("User should be directed to Rent Search Pagee")
//	    public void user_should_be_directed_to_Rent_Search_Pagee() {
//	        Assert.assertEquals("propertiesToRentURL", BaseClass.getDriver().getCurrentUrl());
//	    }
//	    
//	    @When("User clicks on instant valuation, enters value, clicks rental, clicks lets go")
//	    public void user_clicks_on_instant_valuation_enters_value_clicks_rental_clicks_lets_go() {
//	        rsp.instantValuationButton.click();
//	        rsp.searchField.sendKeys("PO16 7GZ");
//	        rsp.rentalButton.click();
//	        rsp.letsGoButton.click();
//	    }
//
//	    @Then("User should be directed to instant valuation page")
//	    public void user_should_be_directed_to_instant_valuation_page() {
//	        Assert.assertEquals(BaseClass.getDriver().getTitle(),
//	                "Instant Online House Valuation | Value My House | OnTheMarket");
//	    }
}
