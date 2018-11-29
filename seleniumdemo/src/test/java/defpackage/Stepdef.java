package defpackage;

//import java.awt.image.FilteredImageSource;
//import java.io.File;
//import java.nio.file.Files;
//
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
  WebDriver driver;
	@Given("vaild login details and url")
	public void vaild_login_details_and_url() {
	   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	   driver =new ChromeDriver();
	  
	driver.get("https://spimail.spi.com/");
	}

	@When("i enter {string}")
	public void i_enter(String name) {
	  

		Login log=new Login(driver);
		log.user().sendKeys(name);
		
		
	}

	@When("i enter user {string}")
	public void i_enter_user(String passname) {

		Login log=new Login(driver);
		log.pass().sendKeys(passname);
		
	}

	@Then("i click on submit")
	public void i_click_on_submit() throws Exception {
		Login log=new Login(driver);
		log.submit().click();
		  Thread.sleep(1000);
	}

	@Then("i click on draft")
	public void i_click_on_draft() throws Exception {
		Draft d=new Draft(driver);
		d.draft().click();
	   Thread.sleep(2000);
	   driver.close();
	}

	

	@Given("valid url")
	public void valid_url() {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		  driver =new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    FlipCart f=new FlipCart(driver);
	    f.cross().click();
	}

	
	@When("i hover over Sports,Books &")
	public void i_hover_over_Sports_Books() throws Exception {
		FlipCart f=new FlipCart(driver);
		 WebElement src= f.sports();
		    Actions actions=new Actions(driver);
		    actions.moveToElement(src).perform();
		    Thread.sleep(2000);
		    f.cricket().click();
		    
	    
	}
	

	@Then("click on cricket.")
	public void click_on_cricket() {
		
	
		
	}


	
}
