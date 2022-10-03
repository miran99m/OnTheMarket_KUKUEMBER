package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class HomePage {


	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[1]/a/span")
	public WebElement valueMyHome;
	
	@FindBy(xpath = "//*[ @href='/price-guide/']")
	public WebElement homePriceGuide;
	
	


}
