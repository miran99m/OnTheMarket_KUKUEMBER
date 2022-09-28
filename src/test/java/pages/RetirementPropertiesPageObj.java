package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class RetirementPropertiesPageObj {
	
	public RetirementPropertiesPageObj() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	 
	@FindBy (xpath= "//*[@id=\"headlessui-tabs-panel-4\"]/div[1]/div/div/input")
	public WebElement LocationInput;
	
	@FindBy (xpath = "//*[@id=\"headlessui-tabs-panel-4\"]/div[1]/div/div/button")
	public WebElement searchButton;
	
	@FindBy (xpath = "//*[@id=\"maincontent\"]/div[2]/h1")
	public WebElement CouldNotViewLocation;
		
	@FindBy (xpath = "//*[@id=\"result-12124817\"]/div[1]/div/a/div/div/div[4]/div[1]/div/picture/img")
	public WebElement saleInHome;
	
	@FindBy(xpath = " //*[@id=\"details\"]/div[3]/section/section[1]/div[2]/div[3]/div[2]")
	public WebElement RetirementButton;
	
	
	@FindBy(xpath = "//*[@id=\"otm-main-nav\"]/div[2]/nav/ul/li[2]/div/div/div[1]/ul/li[7]/a")
	public WebElement RetirementPropertiesOption;
}

 


////*[@id="otm-main-nav"]/div[1]/div/div[3]