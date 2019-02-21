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
	
	/* ****************** FLEX JOB DETAILS **************************** */
	
	@FindBy(id = "job_name")
	@CacheLookup
	WebElement Jobname;
	
	@FindBy(id = "job_description")
	@CacheLookup
	WebElement Jobdescription;
	
	/********************************************************************************************************************************/
	
	
	public void JobData(String jobname)
	
	{
		Jobname.clear();
		Jobname.sendKeys(jobname);
		Jobdescription.clear();
		Jobdescription.sendKeys("Flex");
			
	}
	
	

}
