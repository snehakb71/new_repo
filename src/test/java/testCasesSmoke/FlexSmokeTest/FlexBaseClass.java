package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;
import utilitySmoke.BrowserSmoke;
import utilitySmoke.FlexInputDataProvider;
import utilitySmoke.FlexProfileDataProvider;

public class FlexBaseClass {

	public WebDriver driver;

	public FlexInputDataProvider Info;
	public FlexProfileDataProvider Profile;
	FlexJobData Login;
	FlexInput Input;
	FlexProfile Preset;
	FlexOutput Output;

	@BeforeClass
	public void start() throws Exception {
		Info = new FlexInputDataProvider();
		Profile = new FlexProfileDataProvider();
		Login = new FlexJobData(driver);
		Input = new FlexInput(driver);
		Preset = new FlexProfile(driver);
		Output = new FlexOutput(driver);
		Thread.sleep(1000);

		driver = BrowserSmoke.browser_type(driver, Info.getBrowser(), Info.getUrl());

		FlexJobData LoginPixfix = PageFactory.initElements(driver, FlexJobData.class);
		LoginPixfix.LoginPixfix(Info.UsernamePixfix(), Info.PasswordPixfix());
		Thread.sleep(1000);
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	@AfterMethod
	public void screen(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.FAILURE) {
			// Helper.screenShoot(driver);
		}
	}

}
