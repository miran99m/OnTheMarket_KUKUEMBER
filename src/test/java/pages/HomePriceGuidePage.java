package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class HomePriceGuidePage {

	public HomePriceGuidePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath= "//*[@class='tabs-list-tab-text selected']")
	public WebElement homePriceGuideSearch;
	
	@FindBy(xpath= "//*[@id='headlessui-tabs-tab-2']/span")
	public WebElement agentValuation;
	
	@FindBy(xpath= "//*[@id='headlessui-tabs-tab-3']/span")
	public WebElement instantValuation;
	
	@FindBy(xpath= "//*[@class='landing-search-input landing-search-input--with-btn']")
	public WebElement searchBar;
	
}
