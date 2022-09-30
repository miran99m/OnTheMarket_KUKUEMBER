package Utilities;

import java.util.Locale;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import pages.ContactAgentPage;
import pages.FindAgentsPage;
import pages.FindEstateLettingAgentsPage;
import pages.HomePage;
import pages.OneClickPropertiesPage;
import pages.RetirementPropertiesPageObj;
import pages.SoldPricesPageObj;
import pages.lettingAgentsEstateAgentInLondonPage;
import stepDefinition.Miran_SoldHouse;


public class PageInitializer extends BaseClass {

	public static CommonMethods cm;
	public static SoldPricesPageObj sp;
	public static HomePage hp;
	public static RetirementPropertiesPageObj rp;
	public static ContactAgentPage cap;
	public static FindAgentsPage fap;
	public static FindEstateLettingAgentsPage fep;
	public static lettingAgentsEstateAgentInLondonPage lap;
	public static OneClickPropertiesPage ocp;
	
	public static void initialize() {
		cm = new CommonMethods();
		sp = new SoldPricesPageObj();
		hp = new HomePage();
		rp = new RetirementPropertiesPageObj();
		cap = new ContactAgentPage();
		fap = new FindAgentsPage();
		fep = new FindEstateLettingAgentsPage();
		lap = new lettingAgentsEstateAgentInLondonPage();
		ocp = new OneClickPropertiesPage();
	}
}
