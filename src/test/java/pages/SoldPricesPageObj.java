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

	@FindBy(xpath = "//select[@id='property-type-prices']")
	private WebElement propertyType;

	@FindBy(xpath = "//*[@id=\"search-bar-sold-prices\"]/div[1]/button")
	private WebElement searchButton;

	@FindBy(xpath = "//*[@id='tab-container']/div[1]/div/div/ul/li/span[2]")
	private List<WebElement> propTypeList;

	public WebElement getPropertyType() {
		return propertyType;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	public List<WebElement> getPropTypeList() {
		return propTypeList;
	}

	public Boolean codeMatchesHousesListed() {
		Boolean matches = null;
		String locationInputField = BaseClass.getDriver().findElement(By.xpath("//*[@id=\"search\"]"))
				.getAttribute("value");
		List<WebElement> list = BaseClass.getDriver()
				.findElements(By.xpath("//*[@id=\"tab-container\"]/div[1]/div/div/h2"));
		for (WebElement eachSoldHouse : list) {
			if (eachSoldHouse.getText().contains(locationInputField)) {
				matches = true;
			} else {
				matches = false;
				break;
			}
		}
		return matches;
	}

	public Boolean propertyTypeMatches(String propTypeName) {
		Boolean matches = null;
		for (WebElement eachType : propTypeList) {
			if (eachType.getText().contains(propTypeName)) {
				matches = true;
			} else {
				matches = false;
				break;
			}
		}
		return matches;
	}

}
