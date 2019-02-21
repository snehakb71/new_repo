package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Job_type {
WebDriver driver;
	
	public Job_type(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(linkText="pixflex-menu-arrow")
	@CacheLookup
	WebElement jobs;*/
	
	@FindBy(xpath="//span[@id='pixflex-menu-arrow']")
	@CacheLookup
	WebElement main_job;
	
	@FindBy(xpath="//a[contains(text(), 'PIXFIX Versa')]")
	@CacheLookup
	WebElement versa_job_type;
	
	@FindBy(xpath="//a[contains(text(), 'New')]")
	@CacheLookup
	WebElement versa_new_job;

	@FindBy(xpath="//a[contains(text(), 'PIXFIX Flex')]")
	WebElement flex;
	
	@FindBy(xpath="//a[contains(text(), 'PIXFIX Xport')]")
	WebElement xport;
	
	public void versa_job_job() throws Exception
	{
		main_job.click();
		Thread.sleep(1000);
		
		versa_job_type.click();
		Thread.sleep(1000);
	}
	
	public void versa_job() throws Exception
	{
		main_job.click();
		Thread.sleep(1000);
		
		versa_job_type.click();
		Thread.sleep(1000);
		versa_new_job.click();
		Thread.sleep(1000);
		
	}

}
