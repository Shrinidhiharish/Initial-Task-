package defpackage;//pom file where we have all xpaths

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login 
{
WebDriver drives;

public Login(WebDriver driver)
{
	this.drives=driver;
}
By submit=By.xpath("//input[@type='submit']");
By user=By.xpath("//*[@id='username']");
By pass=By.xpath("//*[@id='password']");


//By mail=By.xpath("//input[@type='submit']");




public WebElement user()
{
return drives.findElement(user)	;
}
public WebElement pass()
{
return drives.findElement(pass)	;
}
public WebElement submit()
{
return drives.findElement(submit)	;
}


}
