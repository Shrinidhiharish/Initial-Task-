package defpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {

	WebDriver driver;
	
	@Given("vaild login details and url")
	public void vaild_login_details_and_url() {
	   
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://spimail.spi.com/");
	}

	@When("i enter {string}")
	public void i_enter(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}
	
	
@When("i enter user {string}")
public void i_enter_user(String pass) {
	  
		driver.findElement(By.id("password")).sendKeys(pass);
		
	}
@Then("i click on submit")
public void i_click_on_submit() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
	}

@Then("five th  mail is selected and clicked.")
public void five_th_mail_is_selected_and_clicked() {
		driver.findElement(By.xpath("//span[@id='zlif__CLV-main__-3448__pa__0']")).click();
	}

	
	
}
