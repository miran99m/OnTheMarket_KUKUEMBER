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
	
	@FindBy(xpath = "//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[4]/a/span")
	public WebElement agentBtn;

	@FindBy (xpath="//*[@id='otm-main-nav']/div[1]/div/nav/ul/li[4]/div/div/div[2]/div[1]/div/div[2]/div/a")
	public WebElement bookAnAgentVisit;

}
