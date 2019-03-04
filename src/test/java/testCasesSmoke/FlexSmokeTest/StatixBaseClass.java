package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import pagesSmoke.StatixJobType;
import utilitySmoke.BrowserSmoke;
import utilitySmoke.FlexInputDataProvider;
import utilitySmoke.FlexProfileDataProvider;

public class StatixBaseClass {
	
public WebDriver driver;
	
	public FlexInputDataProvider Info;
	public FlexProfileDataProvider Profile;
	StatixJobType Statix;
	

		@BeforeClass
		public void start() throws Exception
		{
			Info = new FlexInputDataProvider();
			Profile = new FlexProfileDataProvider();
			Statix = new StatixJobType(driver);
			Thread.sleep(1000);
			
			driver = BrowserSmoke.browser_type(driver, Info.getBrowser(), Info.getUrl());
			
			StatixJobType LoginPixfix = PageFactory.initElements(driver, StatixJobType.class);
			LoginPixfix.LoginPixfixStatix(Info.UsernamePixfix(), Info.PasswordPixfix());
			Thread.sleep(1000);
		}
	
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	@AfterMethod
	public void screen(ITestResult result) throws Exception
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			//Helper.screenShoot(driver);
		}
	}




}
