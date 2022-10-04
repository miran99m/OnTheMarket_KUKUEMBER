package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class SignInFunctionalityPageObj {

	
	

	    public SignInFunctionalityPageObj() {
	        PageFactory.initElements(BaseClass.getDriver(), this);
	    }
	    
	    

	    @FindBy(xpath="//*[@id=\"otm-main-nav\"]/div[1]/div/div[2]/a/span[2]")
	    public WebElement signInButton;
	    
	    @FindBy(xpath="//*[@id='login-email-modal']")
	    public WebElement enterEmail;
	    
	    @FindBy(xpath="//form[@id='login']/button[1]")
	    public WebElement nextButton;
	    
	    @FindBy(xpath="//*[@id=\"login-password\"]")
	    public WebElement password;
	    
	    @FindBy(xpath="//*[@id=\"password\"]/button")
	    public WebElement SignInPasswordButton;
	    
	    @FindBy(xpath="//*[@id=\"headlessui-tabs-tab-1\"]/span")
	    public WebElement validateSingInFunctionality;
	    
	    //2ND TestCase-LoginFuctionality-Forgotten Password
	    
	    @FindBy(xpath="//*[@id='reset-password']")
	    public WebElement forgottenPassword;
	    
	    
	    @FindBy(id="login-pages")
	    public WebElement validatePasswordReset;
	    //login-pages
	    
	    @FindBy(xpath="//*[@id='reset-email']")
	    public WebElement ResetEmail;
	    
	    
	    @FindBy(xpath="//*[@id='forgot-password-btn']")
	    public WebElement sendResetCode;
	    
	    @FindBy(id="reset-code")
	    public WebElement ValidateResetCode;
	    
}
