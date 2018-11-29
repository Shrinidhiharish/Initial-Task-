package defpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Draft {
	WebDriver drives;

	public Draft(WebDriver driver)
	{
		this.drives=driver;
	}
By draft=By.xpath("//div[@class='ImgDraftFolder']");

public WebElement draft()
{
return drives.findElement(draft);
}
}
