package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class propertyValuationPage {
	public propertyValuationPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id='container']/div/div[1]/h1")
	public WebElement arrangeAfreeAgentValuation;
	
	@FindBy(name="postcode")
	public WebElement postCode;
	
	@FindBy(xpath="//*[@id='postcodeFind']")
	public WebElement LetsGoBtn;
	
	@FindBy(xpath="//*[@id='addressList']")
	public WebElement addressDropDown;
	
	@FindBy(xpath="//*[@id='addressList']")
	public WebElement reasonForValuation;
	
	@FindBy(id="enter-postcode-btn")
	public WebElement continueBtn;
	
	@FindBy(id="name")
	public WebElement FullName;
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="telephone")
	public WebElement telephone;
	
	@FindBy(id="sale-confidence")
	public WebElement whenToMarketDropDown;
	
	@FindBy(xpath="//*[@id='enter-postcode-form']/div[3]/div[2]/div[6]/div/div[2]/label")
	public WebElement noOffersBtn;
	
	@FindBy(id="contact-agents-submit")
	public WebElement send;
	 
	@FindBy(xpath="//*[@id='enter-postcode-form']/div[3]/div[2]/div[3]/div/div")
	public WebElement validTelephoneNumber;
	
	@FindBy(xpath="//*[@id='enter-postcode-form']/div[3]/p")
	public WebElement confirmtionMsg;
}
