package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class RentSearchPage {

	
	  public RentSearchPage(){
	        PageFactory.initElements(BaseClass.getDriver(), this);
	        }
	    
	    @FindBy(xpath= "//*[@id='headlessui-tabs-panel-4']/div[1]/div/div/input")
	    public WebElement searchButton;
	    
	    @FindBy(xpath="//*[@id='headlessui-popover-button-3']")
	    public WebElement priceButton;
	    
	    @FindBy(id= "min-price")
	    public WebElement minButton;
	    
	    @FindBy(id= "max-price")
	    public WebElement maxButton;
	    
	    @FindBy(id="apply-price-btn")
	    public WebElement applyButton;
	    
	    @FindBy(xpath="//*[@id='headlessui-tabs-tab-3']/span")
	    public WebElement instantValuationButton;

	    @FindBy(xpath="//*[@id=\"headlessui-tabs-panel-6\"]/div[1]/div/div[1]/input")
	    public WebElement searchField;
	    
	    @FindBy(id="to-rent")
	    public WebElement rentalButton;
	    
	    @FindBy(xpath="//*[@id=\"headlessui-tabs-panel-6\"]/div[1]/div/button")
	    public WebElement letsGoButton;
	
	
}
