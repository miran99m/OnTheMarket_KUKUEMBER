package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;



public class FindEstateLettingAgentsPage {
	
	public FindEstateLettingAgentsPage() {
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath= "//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[4]/div/div/div[1]/ul/li[1]/a/div[2]/span")
	public WebElement findEstateLettingAgentBtn;
}
