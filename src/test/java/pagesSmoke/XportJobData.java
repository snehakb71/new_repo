package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XportJobData {
	
	WebDriver driver;

	public XportJobData(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* ****************** XPORT JOB DETAILS **************************** */
	
	@FindBy(id = "job_name")
	@CacheLookup
	WebElement jobName;
	
	@FindBy(id = "job_description")
	@CacheLookup
	WebElement jobDescription;
	
	@FindBy(id = "save_job")
	@CacheLookup
	WebElement saveJob;
	
	/********************************************************************************************************************************/
	
	
	public void jobData(String jobname, String jobDesc) {
		
		jobName.clear();
		jobName.sendKeys(jobname);
		jobDescription.clear();
		jobDescription.sendKeys(jobDesc);
	}
	
	public void saveJob() {
		
		saveJob.click();
	}

}
