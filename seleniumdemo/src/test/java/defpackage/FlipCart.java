package defpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipCart {
		WebDriver drives;

		public FlipCart(WebDriver driver)
		{
			this.drives=driver;
		}

By cross=By.xpath("//button[@class='_2AkmmA _29YdH8']");

By cricket=By.xpath("//a[@title='Cricket']");

By sports=By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[7]/span");
	
	public WebElement cross()
	{
	return drives.findElement(cross)	;
	}
	public WebElement cricket()
	{
	return drives.findElement(cricket)	;
	}
	public WebElement sports()
	{
	return drives.findElement(sports)	;
	}
}