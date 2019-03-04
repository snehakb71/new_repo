package testCasesSmoke.XportSmokeTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.Job_type;

public class Export extends BaseClassXportSmokeTest {
	
	@Test
	public void export() throws Exception {
		
		Job_type jobType= PageFactory.initElements(driver, Job_type.class);
		jobType.xportJob();
		
		driver.findElement(By.xpath("//input[@data-job-name='SmokeXport_QualityOptimized_UDP_UDP']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@onclick='job_export();']")).click();
		Thread.sleep(1000);
		
		//	C:\Users\LAB\Downloads
		
		new File("C:\\Users\\LAB\\Downloads\\xportJson");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
