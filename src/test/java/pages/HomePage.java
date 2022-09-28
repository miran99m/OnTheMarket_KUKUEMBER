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
	
	@FindBy(xpath = "//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[2]/a/span")
	public WebElement BuyOption ;
	
	
	//@FindBy(xpath = "//*[@id=\"otm-main-nav\"]/div[2]/nav/ul/li[2]/div/div/div[1]/ul/li[7]/a/div/span")
	//public WebElement RetirementPropertiesOption;
	//*[@id="otm-main-nav"]/div[1]/div/div[3]
	
//

}
