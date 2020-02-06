package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.NopCommerceLoginElements;

public class NopCommerceDemoSteps {
	
	public WebDriver driver; // This is global var.  
	public NopCommerceLoginElements obj; // This is global var for creating the obj of NopCommerceLoginElements page. 
	
	@Given("user launch Chrome Browser")
	public void user_launch_Chrome_Browser() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahmad Siyar Sahar\\eclipse-workspace\\NextHealthProject\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		obj=new NopCommerceLoginElements(driver);
	
	}

	@When("user enters the url {string}")
	public void user_enters_the_url(String url) {
	  driver.get(url);
	  driver.manage().window().maximize();
	}
	
	@Then("user enters user name as {string} and pasword as {string}")
	public void user_enters_user_name_as_and_pasword_as(String email, String password) {
	    obj.typeUserName(email); 
	    obj.typePassword(password);
	}

	@Then("user clicks on login")
	public void user_clicks_on_login() {
	    obj.clickLoginBtn(); // This calls the clickLoginBtn from NopCommerceLoginElements class
		
	}

	@Then("user close")
	public void user_close() {
	   driver.close();
	}




}
