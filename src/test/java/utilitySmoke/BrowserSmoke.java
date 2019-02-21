package utilitySmoke;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSmoke {
	public static WebDriver browser_type(WebDriver driver,String browser, String URL) 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\All Needed\\new selenium\\chrome\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		
		}
		
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "C:\\All Needed\\new selenium\\chrome\\chromedriver.exe");
			WebDriver driver1= new ChromeDriver();
			driver1.manage().window().maximize();
		}
		
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver;
		
	}

}
