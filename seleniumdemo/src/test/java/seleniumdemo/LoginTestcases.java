package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import defpackage.Login;

public class LoginTestcases 
{
public void test()
{
	System.setProperty("webdriver.chrom.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://spimail.spi.com/");
	Login l=new Login(driver);
	l.user().sendKeys("shrinidhi.harish");
	l.pass().sendKeys("$hravan@1107");
	l.click().click();
}
}
