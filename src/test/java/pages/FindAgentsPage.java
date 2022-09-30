package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;


public class FindAgentsPage {
	
	public FindAgentsPage() {
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath="//*[@id='search-location-agents']")
	public WebElement searchTextBox;
	
	@FindBy(xpath= "//*[@id='search-location-agents-btn']")
	public WebElement maginfyingGlassBtn;
	
	@FindBy (xpath="//*[@id='app-container']/div[3]/div/div/h1")
	public WebElement findAgent;
}
