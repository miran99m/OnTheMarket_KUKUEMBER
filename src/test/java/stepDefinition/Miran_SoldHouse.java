package stepDefinition;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import Utilities.BaseClass;
import Utilities.CommonMethods;

public class Miran_SoldHouse extends CommonMethods {

	
	
	@Ignore
	@Test
	public void verifyShowHousesSoldWithinValidCode() {
		cm.hoverOnMenuTab("Value my home");
		cm.clickOnDropDownTab("Sold prices");
		// Sending Code into the input Field to search 
		cm.sendText(getDriver().findElement(By.xpath("//*[@id=\"headlessui-tabs-panel-4\"]/div[1]/div/div/input")), "PO16 7GZ");
		click(getDriver().findElement(By.xpath("//*[@id=\"headlessui-tabs-panel-4\"]/div[1]/div/div/button")));
		Assert.assertTrue(sp.codeMatchesHousesListed());
		
	}
	
	@Test
	public void verifySoldHomesWithDetachedType() {

		cm.hoverOnMenuTab("Value my home");
		cm.clickOnDropDownTab("Sold prices");
		// Sending Code into the input Field to search 
		cm.sendText(getDriver().findElement(By.xpath("//*[@id=\"headlessui-tabs-panel-4\"]/div[1]/div/div/input")), "PO16 7GZ");
		click(getDriver().findElement(By.xpath("//*[@id=\"headlessui-tabs-panel-4\"]/div[1]/div/div/button")));
		selectByValue(sp.getPropertyType(), "Flat");
		sp.getSearchButton().click();
		Assert.assertTrue(sp.propertyTypeMatches("Flat")); 
	}

	

}
