package Utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;




public class CommonMethods extends PageInitializer {

	
	public void clickRadioOrCheckBox(List<WebElement> radioOrCheckBox, String value) {
		String actualValue;
		for (WebElement el : radioOrCheckBox) {
			actualValue = el.getAttribute("value").trim();
			if (el.isEnabled() && actualValue.equals(value)) {
				el.click();
				break;
			}
		}
	}
	
	public void clickAddToCartButtonsAndCheckMarksDisplayed(List<WebElement> list, WebElement CheckMarkedAddToCart) {		
		for (WebElement item : list) {
			item.click();
			CheckMarkedAddToCart.isDisplayed();
			cm.wait(1);
		}
	}

	public void selectByVisibleText(WebElement element, String textToSelect) {
		try {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (WebElement el : options) {
				if (el.getText().equals(textToSelect)) {
					select.selectByVisibleText(textToSelect);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectByIndex(WebElement element, int index) {
		try {
			Select select = new Select(element);
			int size = select.getOptions().size();
			if (size > index) {
				select.selectByIndex(index);
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	public static void selectByValue(WebElement element, String textTobeSelected) {
		try {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (WebElement el : options) {
				if (el.getText().equals(textTobeSelected)) {
					select.selectByValue(textTobeSelected);
					break;
				}
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	public void acceptAlert() {
		try {
			Alert alert = getDriver().switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	public void dismissAlert() {
		try {
			Alert alert = getDriver().switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	public void switchToFrame(String nameOrId) {
		try {
			getDriver().switchTo().frame(nameOrId);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	public void switchToFrame(int index) {
		try {
			getDriver().switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	public void switchToFrame(WebElement element) {
		try {
			getDriver().switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	public static String getAlertText() {
		String alertText = null;

		try {
			Alert alert = getDriver().switchTo().alert();
			alertText = alert.getText();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		return alertText;
	}

	public void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public void clickOnMenuTab(String tabName) {
		List<WebElement> listOfTabName = getDriver().findElements(By.xpath("//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li/a/span"));
		for (WebElement eachMenu : listOfTabName) {
			if (eachMenu.getText().contains(tabName)) {
				eachMenu.click();
				break;
			}
		}
	}
	

	

	public void sendAlertText(String str) {
		try {
			Alert alert = getDriver().switchTo().alert();
			alert.sendKeys(str);
			alert.accept();

		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	public static void switchToChildWindow() {
		String mainWindow = getDriver().getWindowHandle();
		Set<String> windows = getDriver().getWindowHandles();
		for (String eachWindow : windows) {
			if (!eachWindow.equals(mainWindow)) {
				getDriver().switchTo().window(eachWindow);
			}
		}
	}

	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Constants.EXPLICIT_WAIT_TIME);
		return wait;
	}
//	waits for element to be clickable
	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}
//	waits for element to be visible
	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}
//	Waits for the element to be visible before clicks on it 
	public static void click(WebElement element) {
		waitForVisibility(element).click();
	}
	
//	js executer(Declaring and initializing js object and returning it 
	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		return js;
	}
//	clicks on the element by JS
	public static void jsClick(WebElement element) {
		getJSObject().executeScript("arguments[0].click", element);
	}
	
	public static void jsSentText(WebElement element, String text) {
		String valueText = element.getAttribute("value");
		getJSObject().executeScript("arguments[0].value='"+valueText+"'",text);
	}
	
	public static void scrollToElement(WebElement element) {
		getJSObject().executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void scrollByPixel(int pixel) {
		getJSObject().executeScript("window.scrollBy(0, "+pixel+")");
	}
	
	public void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	public void hover(WebElement element) {
		Actions action = new Actions(getDriver());
		action.moveToElement(element).build().perform();
	}
	
	public void dragsAndDrops(WebElement element, WebElement element2) {
		Actions action = new Actions(getDriver());
		action.dragAndDrop(element,element2).build().perform();
	}
	
	public void doubleClicks(WebElement element) {
		Actions action = new Actions(getDriver());
		action.doubleClick(element).build().perform();
	}
		
	public void clickOnDropDownTab(String dropDownTabName) {
		List<WebElement> list = BaseClass.getDriver().findElements
				(By.xpath("//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li/div/div/div[1]/ul/li/a/div[2]/span"));
		for (WebElement eachTab : list) {
			if(eachTab.getText().equalsIgnoreCase(dropDownTabName)) {
				eachTab.click();
				break;
			}
		}
	}
	public void hoverOnMenuTab(String tabName) {
		Actions action = new Actions(getDriver());
		List<WebElement> listOfTabName = getDriver().findElements(By.xpath("//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li/a/span"));
		for (WebElement eachMenu : listOfTabName) {
			if (eachMenu.getText().contains(tabName)) {
				action.moveToElement(eachMenu).build().perform();
				break;
			}
		}
	}
	
	public void acceptCookies() {
		click(getDriver().findElement(By.xpath("//*[@id=\"cookie-notification\"]/div/div[2]/button")));
	}

	public static String getTimeStamp() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		return sdf.format(date.getTime());
	}

	public static byte[] takeScreenshot(String filename) {
		TakesScreenshot ts = (TakesScreenshot) BaseClass.getDriver();
		byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);

		File file = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = Constants.screenShotPNGPath + filename + getTimeStamp() + ".png";

		try {
			FileUtils.copyFile(file, new File(destinationFile));
		} catch (Exception ex) {
			System.out.println("Cannot take screenshot!");
		}

		return picBytes;
	}

	public static Boolean isPalindrome(String word) {
		String reverse = null;
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		if (word.equalsIgnoreCase(reverse)) {
			return true;

		} else {

			return false;
		}
	}
	
	public void assertTitles(String expectedTitle) {
		String actualTitle = getDriver().getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);		
	}
	
}
