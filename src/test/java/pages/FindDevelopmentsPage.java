package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class FindDevelopmentsPage {

	public FindDevelopmentsPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id='headlessui-tabs-panel-3']/div/div/div/input")
	private WebElement findDevSearchBox;
	
	@FindBy(xpath="//*[@id='headlessui-tabs-panel-3']/div/div/div/button")
	private WebElement findDevSearchButton;
	
	public WebElement getFindDevSearchBox() {
		return findDevSearchBox;
	}
	
	public WebElement getFindDevSearchButton() {
		return findDevSearchButton;
	}
	
	
}
