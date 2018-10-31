package defpackage;

//import java.awt.image.FilteredImageSource;
//import java.io.File;
//import java.nio.file.Files;
//
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {

	WebDriver driver= new ChromeDriver();
	Login l=new Login(driver);
	
	@Given("vaild login details and url")
	public void vaild_login_details_and_url() {
	   
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://spimail.spi.com/");
	}

	@When("i enter {string}")
	public void i_enter(String uname) {
		l.user().sendKeys(uname);
	}
	
	
@When("i enter user {string}")
public void i_enter_user(String pass) {
	  
		l.pass().sendKeys(pass);
		
	}
@Then("i click on submit")
public void i_click_on_submit() throws InterruptedException {
		l.click().click();
		Thread.sleep(5000);
	String source=	driver.getPageSource();
	System.out.println(source);
	}}

/*
 * @Then("i click on draft")
 * public void i_click_on_draft() throws Exception {
	driver.findElement(By.xpath("//*[@id='zti__main_Mail__6_textCell']")).click();
			// Write code here that turns the phrase aboactions
	//File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
	//String path="c:/pic";
	//FileUt
	Thread.sleep(2000);
   
}

@Then("five th  mail is selected and clicked.")
public void five_th_mail_is_selected_and_clicked() {
		driver.findElement(By.xpath("//*[@id='zlif__TV-main__3315__su'][text()='Its quiz time.']")).click();
	}

	
	
}

 */
