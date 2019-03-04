package testCasesSmoke.running_testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.Job_type;
import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class FileUpload extends BaseClassSmokeTest{
	
	@Test
	public void mp4_file() throws Exception
	{
		Job_type content = PageFactory.initElements(driver, Job_type.class);
		content.content();
		content.mp4FileUpload();
		content.bulkUp();
		driver.navigate().refresh();
		
		content.tsFileUpload();
		content.bulkUp();
		
		Thread.sleep(9000);
		driver.navigate().refresh();
		content.imageFileUpload();
		content.bulkUp();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.navigate().refresh();
	}
	
	

}
