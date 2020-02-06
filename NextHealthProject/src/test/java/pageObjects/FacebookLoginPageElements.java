package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPageElements {
	
	
	public WebDriver ldriver; 
	
	public FacebookLoginPageElements(WebDriver rdriver) {
		
		ldriver=rdriver; 
		PageFactory.initElements(rdriver, this);
	}
	
	// Defining Locators 
	@FindBy (xpath= "//input[@id='email']") WebElement uName; 
	@FindBy(xpath="//input[@id='pass']") WebElement pass; 
	@FindBy(xpath="//input[@type='submit']") WebElement Loginbtn1;
	
	
	// defining methods for each locator 
	public void typeUserName(String myName, String myPass) {
		uName.sendKeys(myName);
		pass.sendKeys(myPass);
	}
	
	
	public void clickLoginBtn() {
		Loginbtn1.click();
		
	}
	

}
