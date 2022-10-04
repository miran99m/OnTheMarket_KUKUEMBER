package Utilities;

import pages.ContactAgentPage;
import pages.FindAgentsPage;
import pages.FindDevelopmentsPage;
import pages.FindEstateLettingAgentsPage;
import pages.HomePage;
import pages.HomePriceGuidePage;
import pages.NewHomesForSaleObj;
import pages.OneClickPropertiesPage;
import pages.RentSearchPage;
import pages.RetirementPropertiesPageObj;
import pages.SearchedSoldPricesPageObj;
import pages.SoldPricesPageObj;
import pages.lettingAgentsEstateAgentInLondonPage;
import pages.propertyValuationPage;


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
	public static propertyValuationPage pv;
	public static SearchedSoldPricesPageObj ssp;
	public static FindDevelopmentsPage fdp;
	public static HomePriceGuidePage hpg;
  public static NewHomesForSaleObj nfs;
  public static RentSearchPage rsp;
	
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
		pv = new propertyValuationPage();
		ssp = new SearchedSoldPricesPageObj();
		fdp = new FindDevelopmentsPage();
		hpg = new HomePriceGuidePage();
		nfs = new NewHomesForSaleObj();
    	rsp = new RentSearchPage ();

	}
}
