package Utilities;

import pages.HomePage;
import pages.HomePriceGuidePage;


public class PageInitializer extends BaseClass {

	public static CommonMethods cm;
	public static HomePage hp;
	public static HomePriceGuidePage hpg;


	
	public static void initialize() {
		cm = new CommonMethods();
		hp = new HomePage();
		hpg = new HomePriceGuidePage();
		
	}
}
