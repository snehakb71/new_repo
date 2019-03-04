package testCasesSmoke.XportSmokeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pagesSmoke.LoginPage;
import utilitySmoke.BrowserSmoke;
import utilitySmoke.ProfileDataProviderSmoke;
import utilitySmoke.XportDataProvider;

public class BaseClassXportSmokeTest {
	
	public WebDriver driver;
	
	public XportDataProvider data;
	public ProfileDataProviderSmoke profile;
	
	@BeforeClass
	public void start() throws Exception {
		
		data= new XportDataProvider();
		profile= new ProfileDataProviderSmoke();
		
		driver= BrowserSmoke.browser_type(driver, data.browser(), data.serverURL());
		
		LoginPage loginPixfix= PageFactory.initElements(driver, LoginPage.class);
		loginPixfix.loginpix(data.userName(), data.passWord());
		Thread.sleep(1000);
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}

}
