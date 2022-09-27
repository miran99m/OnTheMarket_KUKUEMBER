package stepDefinition;

import org.junit.Test;

import Utilities.BaseClass;
import Utilities.CommonMethods;

public class Miran_SoldHouse extends CommonMethods {

	
	
	@Test
	public void verifyShowHousesSoldWithinValidCode() {
		//*[@id="otm-main-nav"]/div[1]/div/nav/ul/li/a/span
		
		cm.hoverOnMenuTab("Value my home");
		
		cm.wait(4);
	}
	

}
