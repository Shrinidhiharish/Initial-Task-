package supportingClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PropertyFileData.credentails;

public class MobileClass{
	public static void mobileStepDefinition() throws InterruptedException, IOException
	{
		
	WebElement search = credentails.driver.findElement(By.xpath("//input[@class='sh-dh__stf']"));
	search.sendKeys("mobiles");
	search.sendKeys(Keys.ENTER);
	
	}

}