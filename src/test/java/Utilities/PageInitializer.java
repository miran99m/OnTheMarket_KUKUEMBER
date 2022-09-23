package Utilities;

import java.util.Locale;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import pages.HomePage;


public class PageInitializer extends BaseClass {

	public static CommonMethods cm;


	
	public static void initialize() {
		cm = new CommonMethods();
		
	}
}
