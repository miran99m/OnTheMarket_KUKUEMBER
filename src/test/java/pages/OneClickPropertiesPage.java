package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class OneClickPropertiesPage {
	
	public OneClickPropertiesPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	
	}
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div[4]/div[1]/div/h1")
	public WebElement oneClickpropertiesTaxt;

}
