package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;


public class SoldPricesPageObj {

	public SoldPricesPageObj() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='headlessui-tabs-panel-4']/div[1]/div/div/button")
	private WebElement searchButton;
	
	@FindBy(xpath = "//*[@id='headlessui-tabs-panel-4']/div[1]/div/div/input")
	private WebElement searchField;

	public WebElement getSearchField() {
		return searchField;
	}
	
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	



	


	

	

}
