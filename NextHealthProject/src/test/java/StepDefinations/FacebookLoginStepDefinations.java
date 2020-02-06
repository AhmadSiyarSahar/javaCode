package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.*;
import pageObjects.FacebookLoginPageElements;

public class FacebookLoginStepDefinations {

// In thid class we dont use main method
// This is the class where we use java selenium 
// For each step of the feature file, we write a mehtod

	public WebDriver driver;
	public FacebookLoginPageElements obj; 

	@Given("I want to open chrome browser")
	public void i_want_to_open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahmad Siyar Sahar\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		obj= new FacebookLoginPageElements(driver);
	}

	@When("I enter facebook url as {string}")
	public void i_enter_facebook_url_as(String url) {
		
	   driver.get(url);
	   driver.manage().window().maximize();
	}
	
	@Then("I enter userName as {string} and I enter  password as {string}")
	public void i_enter_userName_as_and_I_enter_password_as(String myName, String myPass) {
	 obj.typeUserName(myName, myPass);
	}


	@Then("I click sign in btn")
	public void i_click_sign_in_btn() {
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
	obj.clickLoginBtn();
	}


}
