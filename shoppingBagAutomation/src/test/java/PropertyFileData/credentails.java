package PropertyFileData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import repository.objectRepository;

public class credentails {
	static Properties prop;
	public static WebDriver driver;
	
	public static void setup() throws IOException
	{
		
	prop = new Properties();
	FileInputStream ip = new FileInputStream("C:\\Users\\shrinidhi.harish\\eclipse-workspace\\SoftvisionWorkplace\\"
			+ "shoppingBagAutomation\\src\\test\\java\\PropertyFileData\\credentails.properties");
	prop.load(ip);
	
	}
	public static WebDriver Browser_Property() throws IOException
	{	
		
        String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver","./Driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("no browser value given");
		}
		return driver;
}
	public static void url()
	{
	driver.get(prop.getProperty("url"));
	}
	
	public static void usernamePassword() throws InterruptedException, IOException
	{
		
		setup();
		Browser_Property();
		url();
		
		driver.findElement(By.id(objectRepository.Sign_In())).click();
		driver.findElement(By.xpath(objectRepository.UserName_TextBox())).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(objectRepository.Next_Button())).click();
		Thread.sleep(5000);
	
		WebElement passwordtextbox = driver.findElement(By.xpath(objectRepository.Password_TextBox()));
		passwordtextbox.sendKeys(prop.getProperty("password"));
		passwordtextbox.sendKeys(Keys.ENTER);
		
	}
	
}