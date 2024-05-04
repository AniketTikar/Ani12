package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relative_Locator_Demo
{
	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("#ui-id-3 > span")).click();
		driver.findElement(By.partialLinkText("Sign ")).click();
		
		//By emailLocator = RelativeLocator.with(By.tagName("input")).above(By.id("pass"));
		
		driver.close();
		
	}

}
