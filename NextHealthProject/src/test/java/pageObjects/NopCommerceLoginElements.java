package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopCommerceLoginElements {
	
	
	// Page obj has 3 parts 1- consrutctor 2- define locators 3- define mehtods for each locator 

	
	// Creating Constructor 
	public WebDriver ldriver; 
	
	public NopCommerceLoginElements (WebDriver rdriver) {
		
		ldriver=rdriver; 
		PageFactory.initElements(rdriver, this);
	}
	
	
	// Defining Locators 
	@FindBy (xpath= "//input[@id='Email']") WebElement uName; 
	@FindBy(xpath="//input[@id='Password']") WebElement pass; 
	@FindBy(xpath="//input[@type='submit']") WebElement Loginbtn;
	@FindBy(xpath="//a[contains(text(),'Logout')]") WebElement logOut; 
	
	
	
	// defining methods for each locator 
	public void typeUserName(String userName) {
		uName.sendKeys(userName);
	}
	
	public void typePassword(String password) {
		pass.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		Loginbtn.click();
	}
	
	public void clickLogOUt() {
	
	}
	
}
