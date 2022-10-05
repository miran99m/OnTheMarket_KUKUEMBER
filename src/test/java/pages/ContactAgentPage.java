package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;



public class ContactAgentPage {
	
	public ContactAgentPage() {
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath="//*[@id=\"name\"]")
	public WebElement fullNameBox;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	public WebElement emailBox;
	
	@FindBy(xpath="//*[@id=\"telephone\"]")
	public WebElement phoneBox;
	
	@FindBy(xpath="//*[@id=\"postcode\"]")
	public WebElement postcodeBox;
	
	@FindBy (xpath="//*[@id=\"sale-situation\"]")
	public WebElement IhavePropertyToSellBox;
	
	@FindBy(xpath= "//*[@id=\"rent-situation\"]")
	public WebElement IhavePropertyToRentBox;
	
	@FindBy(xpath= "//*[@id='ab-otmContact']/div/input[2]")
	public WebElement noRadioBtn;
	
	@FindBy(xpath="//*[@id='ab-contact-form-submit']")
	public WebElement submitBtn;
	
	@FindBy(xpath= "//*[@id='situation']")
    public WebElement situationBox;
	
}
