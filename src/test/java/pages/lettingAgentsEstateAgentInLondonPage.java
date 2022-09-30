package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;



public class lettingAgentsEstateAgentInLondonPage {
	
	public lettingAgentsEstateAgentInLondonPage() {
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='__next']/div[4]/div/ul/li[1]/div[2]/div[2]/a[2]")
	public WebElement emailAgentBtn;
	
	@FindBy(xpath = "//*[@id='ab-parent']/div[1]/label")
	public WebElement fullNameText;
	
	
	
}
