package Utilities;

import java.util.Locale;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import pages.HomePage;
import pages.RetirementPropertiesPageObj;

public class PageInitializer extends BaseClass {

	public static CommonMethods cm;
	public static HomePage hp;
	public static RetirementPropertiesPageObj rp;

	public static void initialize() {
		cm = new CommonMethods();
		hp = new HomePage();
		rp = new RetirementPropertiesPageObj();
	}
}
