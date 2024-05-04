package Demo1;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Prac1 
{
	public static void main(String[] args) {
		
		//To run the Script without using setProperty method
		
//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.edgedriver().setup();
//		WebDriverManager.operadriver().setup();
//		WebDriverManager.chromiumdriver().setup()
//		WebDriverManager.iedriver().setup();
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
//		WebDriverManager.edgedriver().setup();
//		EdgeDriver driver = new EdgeDriver();
		
		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		
		driver.close();
	}
	
	@Test
	public void test()
	{
		
	}
	

}

	
	