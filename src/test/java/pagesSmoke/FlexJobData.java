package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlexJobData {

	WebDriver driver;

	public FlexJobData(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* ****************** LOGIN PAGE **************************** */

	@FindBy(name = "username")
	@CacheLookup
	WebElement PixfixUserName;

	@FindBy(name = "password")
	@CacheLookup
	WebElement PixfixPassword;

	@FindBy(id = "submitbutton")
	@CacheLookup
	WebElement LoginPixfix;

	/* ****************** PIXFIX JOB DETAILS **************************** */

	@FindBy(xpath = "//span[@id='pixflex-menu-arrow']")
	@CacheLookup
	WebElement ClickJobs;

	@FindBy(xpath = "//a[contains(text(), 'PIXFIX Flex')]")
	@CacheLookup
	WebElement ClickFlexJobType;

	@FindBy(xpath = "//a[contains(text(), 'New')]")
	@CacheLookup
	WebElement CreateNewFlexJob;

	/* ****************** FLEX JOB DETAILS **************************** */

	@FindBy(id = "job_name")
	@CacheLookup
	WebElement Jobname;

	@FindBy(id = "job_description")
	@CacheLookup
	WebElement Jobdescription;

	/*******************************************************************************************************************/
	
	
	

	public void LoginPixfix(String UsernamePixfix, String PasswordPixfix) throws InterruptedException

	{
		PixfixUserName.clear();
		PixfixUserName.sendKeys(UsernamePixfix);
		PixfixPassword.clear();
		PixfixPassword.sendKeys(PasswordPixfix);
		LoginPixfix.click();
		Thread.sleep(500);

	}

	public void NavigateToNew() throws InterruptedException

	{
	
		ClickJobs.click();
		Thread.sleep(500);
		ClickFlexJobType.click();
		Thread.sleep(500);
		CreateNewFlexJob.click();
		Thread.sleep(500);

	}

	public void FlexJobDataInfo(String jobname)

	{
		Jobname.clear();
		Jobname.sendKeys(jobname);
		Jobdescription.clear();
		Jobdescription.sendKeys("Flex");

	}

}
