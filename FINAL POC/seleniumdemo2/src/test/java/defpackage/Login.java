package defpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login 
{
WebDriver driver;

public Login(WebDriver driver)
{
	this.driver=driver;
}
By click=By.xpath("//input[@type='submit']");
By user=By.xpath("//*[@id=\"username\"]");
By pass=By.xpath("//*[@id=\"password\"]");
//By mail=By.xpath("//input[@type='submit']");

public WebElement user()
{
return driver.findElement(user)	;
}
public WebElement pass()
{
return driver.findElement(pass)	;
}
public WebElement click()
{
return driver.findElement(click)	;
}


}
