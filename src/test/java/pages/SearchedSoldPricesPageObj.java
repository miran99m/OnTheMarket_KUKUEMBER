package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class SearchedSoldPricesPageObj {

	

	public SearchedSoldPricesPageObj() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\"search-bar-sold-prices\"]/div[1]/button")
	private WebElement searchButton;
	
	@FindBy(xpath = "//*[@id='tab-container']/div[1]/div/div/ul/li/span[2]")
	private List<WebElement> propTypeList;
	
	@FindBy(xpath = "//*[@id='property-type-prices']")
	private WebElement propertyType;

	@FindBy(xpath = "//*[@id='search']")
	private WebElement locationField;
	
	@FindBy(xpath = "//*[@id='tab-container']/div[1]/div/div/h2")
	private List<WebElement> searchedHouseList ;
	
	public WebElement getPropertyType() {
		return propertyType;
	}
	
	public WebElement getSearchButton() {
		return searchButton;
	}
	public List<WebElement> getPropTypeList() {
		return propTypeList;
	}

	public WebElement getLocationField() {
		return locationField;
	}

	public List<WebElement> getSearchedHouseList() {
		return searchedHouseList;
	}
	


}
