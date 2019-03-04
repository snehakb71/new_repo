package testCasesSmoke.running_testcases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.opencsv.CSVWriter;

import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class TestcasesRun extends BaseClassSmokeTest{
	
	
	
	@AfterTest
	
	public void close()
	{
		driver.close();
	}
	
	
	
	
	@Test(priority=1)
	public void runSmokeVer1aUdpMulticastUdpUnicast() throws Exception
	{
		String jsname="SmokeVer1aUdpMulticastUdpUnicast";
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name="+jsname+ "and @data-type='start']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='SmokeVer1aUdpMulticastUdpUnicast' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}
	//
	@Test(priority=2 )
	public void runSmokevrs1bUdpUnicastRtpUnicastjob() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs1bUdpUnicastRtpUnicastjob' and @data-type='start']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs1bUdpUnicastRtpUnicastjob' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}
	
	@Test(priority=3)
	public void runSmokevrs1cRtpUnicastUdpunicast() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs1cRtpUnicastUdpunicast' and @data-type='start']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs1cRtpUnicastUdpunicast' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}
	
	@Test(priority=4 )
	public void runSmokevrs1dUdpUincastUdpUnicast() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs1dUdpUincastUdpUnicast' and @data-type='start']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs1dUdpUincastUdpUnicast' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}
	
	@Test(priority=5)
	public void stop1bJobs() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='SmokeVer1aUdpMulticastUdpUnicast' and @data-type='stop']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs1bUdpUnicastRtpUnicastjob' and @data-type='stop']")).click();
		
		//driver.findElement(By.xpath("//a[@data-job_name='Smokevrs1dUdpUincastUdpUnicast' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs1cRtpUnicastUdpunicast' and @data-type='stop']")).click();
		//driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs1dUdpUincastUdpUnicast' and @data-type='stop']")).click();
	//	Thread.sleep(1000);
	//	writecsvFile();
		
	}
	
	@Test(priority=6)
	public void runSmokevrs2aUdpMulticastRtmpoutjob() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs2aUdpMulticastRtmpoutjob' and @data-type='start']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs2aUdpMulticastRtmpoutjob' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}
	
	@Test(priority=7)
	public void runSmokevrs2bRTMPInUdpUbnicastjob() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs2bRTMPInUdpUbnicastjob' and @data-type='start']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs2bRTMPInUdpUbnicastjob' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}
	
	@Test(priority=8)
	public void runSmokevrs2cUdpunicastRTMPjob() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs2cUdpunicastRTMPjob' and @data-type='start']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs2cUdpunicastRTMPjob' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}
	
	@Test(priority=9)
	public void runSmokeVrs2dRtmpInputrtmpOutputjob() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='SmokeVrs2dRtmpInputrtmpOutputjob' and @data-type='start']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='SmokeVrs2dRtmpInputrtmpOutputjob' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}
	
	@Test(priority=10)
	public void stop2bJobs() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs2aUdpMulticastRtmpoutjob' and @data-type='stop']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs2bRTMPInUdpUbnicastjob' and @data-type='stop']")).click();
		
		//driver.findElement(By.xpath("//a[@data-job_name='Smokevrs1dUdpUincastUdpUnicast' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[@data-job_name='Smokevrs2cUdpunicastRTMPjob' and @data-type='stop']")).click();
		//driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-job_name='SmokeVrs2dRtmpInputrtmpOutputjob' and @data-type='stop']")).click();
	//	Thread.sleep(1000);
	//	Thread.sleep(1000);
	//	writecsvFile();
		
	}
	
	
	
	
	@Test(priority=11)
	public void runSmokeVersa3aUdpMulticastRtpUnicastjob() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='SmokeVersa3aUdpMulticastRtpUnicastjob' and @data-type='start']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='SmokeVersa3aUdpMulticastRtpUnicastjob' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}
	
	@Test(priority=12)
	public void runSmokeVersa3bRtpUnicastRtmpOut() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='SmokeVersa3bRtpUnicastRtmpOut' and @data-type='start']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='SmokeVersa3bRtpUnicastRtmpOut' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}
	
	@Test(priority=13)
	public void runsmokeVersa3CRtmpInRtpUnicast() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='smokeVersa3CRtmpInRtpUnicast' and @data-type='start']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='smokeVersa3CRtmpInRtpUnicast' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}
	

	@Test(priority=14)
	public void runsmokeVersa3dRtpunicastMp4out() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='smokeVersa3dRtpunicastMp4out' and @data-type='start']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='smokeVersa3dRtpunicastMp4out' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}
	
	@Test(priority=15)
	public void stop3aJobs() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='SmokeVersa3aUdpMulticastRtpUnicastjob' and @data-type='stop']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='SmokeVersa3bRtpUnicastRtmpOut' and @data-type='stop']")).click();
		
		//driver.findElement(By.xpath("//a[@data-job_name='Smokevrs1dUdpUincastUdpUnicast' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[@data-job_name='smokeVersa3CRtmpInRtpUnicast' and @data-type='stop']")).click();
		//driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-job_name='smokeVersa3dRtpunicastMp4out' and @data-type='stop']")).click();
	//	Thread.sleep(1000);
	//	Thread.sleep(1000);
	//	writecsvFile();
		
	}
	
	
	
	@Test(priority=16)
	public void runsmokeVersa6AMulticastUdpMp4out() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='smokeVersa6AMulticastUdpMp4out' and @data-type='start']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='smokeVersa6AMulticastUdpMp4out' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}
	
	@Test(priority=17)
	public void runsmokeVersa6BMp4FileUdpUnicast() throws Exception
	{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='smokeVersa6BMp4FileUdpUnicast' and @data-type='start']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='smokeVersa6BMp4FileUdpUnicast' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}
	
	
		@Test(priority=18)
		public void runsmokeVersa6CUdpPassthroughUdpunicast() throws Exception
		{
			job_versa();
			driver.findElement(By.xpath("//a[@data-job_name='smokeVersa6CUdpPassthroughUdpunicast' and @data-type='start']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@data-job_name='smokeVersa6CUdpPassthroughUdpunicast' and @data-type='stat']")).click();
			Thread.sleep(2000);
		
			driver.navigate().refresh();
			
			Thread.sleep(1000);
			writecsvFile();
	}
	
/*	@Test
	///public void jobversa() throws Exception
	//{
		job_versa();
		driver.findElement(By.xpath("//a[@data-job_name='smokeVersa6CUdpPassthroughUdpunicast' and @data-type='start']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='smokeVersa6CUdpPassthroughUdpunicast' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}*/
	
	
	
	
	
	
	public void job_versa() throws Exception
	{
		
		boolean ver= driver.findElement(By.xpath("//a[contains(text(), 'PIXFIX Versa')]")).isDisplayed();
		if(ver==true)
		{
			driver.findElement(By.xpath("//a[contains(text(), 'PIXFIX Versa')]")).click();
			Thread.sleep(1000);
		}
		else{
		driver.findElement(By.xpath("//span[@id='pixflex-menu-arrow']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(), 'PIXFIX Versa')]")).click();
		Thread.sleep(1000);
		}
		new Select(driver.findElement(By.id("query_limit"))).selectByVisibleText("200");
		Thread.sleep(1000);
		
	}
	
public void writecsvFile() throws Exception{
		
		//String jobName = driver.findElement(By.id("job_name")).getText();
		
		//System.out.println(jobName);
		//Thread.sleep(1000);
	//	driver.findElement(By.id("job_counter_start_0")).click();
		//Thread.sleep(1000);
		//driver.navigate().refresh();
		//Thread.sleep(1000);
		
		
		String jobName= driver.findElement(By.xpath("//span[contains(text(), 'Statistics ')]")).getText();
		//System.out.println(jobName);
		
		//boolean status = driver.findElement(By.xpath("//span[contains(text(), 'Active')]")).isDisplayed();
		
		//if (active_job == true) {
		
		String status = driver.findElement(By.xpath("//span[contains(text(), 'Active')]")).getText();
		
		//}
		
		
		new Select(driver.findElement(By.id("notification_type"))).selectByVisibleText("Error + Info");
		Thread.sleep(1000);
		String notification = driver.findElement(By.id("stat_notification")).getText();
		
		
		File log = new File("C:\\Users\\sr39\\git\\smoketest\\CSV_files\\sneha.csv");

				try{
				    if(!log.exists()){
				        System.out.println("We had to make a new file.");
				        log.createNewFile();
				    }

				    FileWriter fileWriter = new FileWriter(log, true);

				    CSVWriter bufferedWriter = new CSVWriter(fileWriter);
				    
				   String[] header = { "JobName", "Job Status", "Notification"}; 
				   bufferedWriter.writeNext(header);
				    
				    
					String[] data ={jobName, status, notification};
				    
				    bufferedWriter.writeNext(data);
				    
				    
				   
				    bufferedWriter.close();

				    System.out.println("Done");
				} catch(IOException e) {
				    System.out.println("COULD NOT LOG!!");
				}
		
		
		//writeCsvFile();
	   
		
	}
	
	
	
	
	
	

}
