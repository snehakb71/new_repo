package testCasesSmoke.RawInputSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.LoginPage;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import utilitySmoke.BrowserSmoke;
import utilitySmoke.InputDataProviderSmoke;
import utilitySmoke.OutputDataProviderSmoke;
import utilitySmoke.ProfileDataProviderSmoke;
import utilitySmoke.XportDataProvider;

public class RawInputBase {
	
	public WebDriver driver;

	public InputDataProviderSmoke config;
	public ProfileDataProviderSmoke profile;
	public OutputDataProviderSmoke output;
	public XportDataProvider data;
	// public ExcelDataProviderSmoke data;
	LoginPage log;
	Job_type type;
	InputVersa versa;
	LoginPage loginpixfix = PageFactory.initElements(driver, LoginPage.class);
	InputVersa udp = PageFactory.initElements(driver, InputVersa.class);
	ProfileVersa prof = PageFactory.initElements(driver, ProfileVersa.class);
	OutputVersa ud_out1 = PageFactory.initElements(driver, OutputVersa.class);

	/*
	 * @BeforeSuite public void starting() throws Exception { config = new
	 * InputDataprovider(); profile = new ProfileDataProvider(); output = new
	 * OutputDataProvider(); data = new ExceldataProvider(); log = new
	 * LoginPageObject(driver); type = new Job_type(driver); versa = new
	 * Versa_Input(driver);
	 * 
	 * }
	 */

	@BeforeClass
	public void start() throws Exception {
		config = new InputDataProviderSmoke();
		profile = new ProfileDataProviderSmoke();
		output = new OutputDataProviderSmoke();
		data = new XportDataProvider();
		// data = new ExcelDataProviderSmoke();
		log = new LoginPage(driver);
		type = new Job_type(driver);
		versa = new InputVersa(driver);
		Thread.sleep(1000);

		driver = BrowserSmoke.browser_type(driver, config.getBrowser(), config.getRawServerUrl());

		LoginPage loginpixfix = PageFactory.initElements(driver, LoginPage.class);
		loginpixfix.loginpix(config.user_name(), config.password());
		Thread.sleep(1000);

	}

	@AfterClass()

	public void teardown() throws Exception {

	// driver.quit();

	}

}
