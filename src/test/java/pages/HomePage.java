package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[2]/a/span")
	private WebElement buyOption;

	@FindBy(xpath = "//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[4]/a/span")
	private WebElement agentBtn;

	@FindBy(xpath = "//*[@id='otm-main-nav']/div[1]/div/nav/ul/li[4]/div/div/div[2]/div[1]/div/div[2]/div/a")
	private WebElement bookAnAgentVisit;

	@FindBy(xpath = "//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[1]/a/span")
	private WebElement valueMyHome;

	@FindBy(xpath = "//*[@href='/price-guide/']")
	private WebElement homePriceGuide;

	@FindBy(xpath = "//*[@id='app-container']/div/div/div/div/button")
	private WebElement cookiesAccept;

	@FindBy(xpath = "//*[@id='otm-main-nav']/div/div/nav/ul/li")
	private List<WebElement> mainNavMenu;

	@FindBy(xpath = "//*[@id='otm-main-nav']/div/div/nav/ul/li[5]/div/div/div/ul/li")
	private List<WebElement> newHomesMenu;

	@FindBy(xpath = "//*[@id='headlessui-tabs-tab-2']")
	public WebElement rentButton;
	
	@FindBy(xpath = "//*[@id=\"cookie-notification\"]/div/div[2]/button")
	public String acceptCookieButton;
	
	@FindBy(xpath = "//*[@id='otm-main-nav']/div[1]/div/nav/ul/li/div/div/div[1]/ul/li/a/div[2]/span")
	public List<WebElement> listOfDropDownMenu;
	
	@FindBy(xpath = "//*[@id='otm-main-nav']/div[1]/div/nav/ul/li/a/span")
	public List<WebElement> listOfTabName;
	

	
	
	

	public WebElement getBuyOption() {
		return buyOption;
	}

	public WebElement getAgentBtn() {
		return agentBtn;
	}

	public WebElement getBookAnAgentVisit() {
		return bookAnAgentVisit;
	}

	public WebElement getValueMyHome() {
		return valueMyHome;
	}

	public WebElement getHomePriceGuide() {
		return homePriceGuide;
	}

	public WebElement getCookiesAccept() {
		return cookiesAccept;
	}

	public List<WebElement> getMainNavMenu() {
		return mainNavMenu;
	}

	public List<WebElement> getNewHomesMenu() {
		return newHomesMenu;
	}

}
