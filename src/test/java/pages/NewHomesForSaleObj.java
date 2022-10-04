package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class NewHomesForSaleObj {

	
	public NewHomesForSaleObj() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }
    
    @FindBy(xpath="//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[5]/a/span")
    public WebElement NewHomesTab;
    
    @FindBy(xpath="//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[5]/div/div/div[1]/ul/li[1]/a/div[2]/span")
    public WebElement NewHomesForSale;
    
    @FindBy(xpath="//*[@id=\"headlessui-tabs-panel-4\"]/div[1]/div/div/input")
    public WebElement AddressInput;

    @FindBy(xpath="//*[@id=\"headlessui-tabs-panel-4\"]/div[1]/div/div/button")
    public WebElement SearchButton;

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div[2]/h1")
    public WebElement unrecognisedLocation;

    @FindBy (xpath="//*[@id=\"result-12392114\"]/div[2]/p/span[1]/a")
    public WebElement houseForSale;
    
    @FindBy(xpath="//*[@id=\"details\"]/div[3]/section/section[1]/div[2]/div[3]/div[1]")
    public WebElement NewBuild;
	
	
	
	
	
	
	
}
