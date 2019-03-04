package testCasesSmoke.VersaIpSmokeTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.opencsv.CSVWriter;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.LoginPage;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import utilitySmoke.BrowserSmoke;
import utilitySmoke.ExcelDataProviderSmoke;
import utilitySmoke.InputDataProviderSmoke;
import utilitySmoke.OutputDataProviderSmoke;
import utilitySmoke.ProfileDataProviderSmoke;

public class BaseClassSmokeTest {

	public WebDriver driver;

	public InputDataProviderSmoke config;
	public ProfileDataProviderSmoke profile;
	public OutputDataProviderSmoke output;
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
		// data = new ExcelDataProviderSmoke();
		log = new LoginPage(driver);
		type = new Job_type(driver);
		versa = new InputVersa(driver);
		Thread.sleep(1000);

		driver = BrowserSmoke.browser_type(driver, config.getBrowser(), config.getUrl());

		LoginPage loginpixfix = PageFactory.initElements(driver, LoginPage.class);
		loginpixfix.loginpix(config.user_name(), config.password());
		Thread.sleep(1000);
		
		
	}

	@AfterClass()
	
	public void teardown() throws Exception {
		
		//writecsvFile();
		//driver.quit();
		
		
		
	}
		
		
		public void writecsvFile() throws Exception{
		
		//String jobName = driver.findElement(By.id("job_name")).getText();
		
		//System.out.println(jobName);
		Thread.sleep(1000);
		driver.findElement(By.id("job_counter_start_0")).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		
		String jobName= driver.findElement(By.xpath("//span[contains(text(), 'Statistics ')]")).getText();
		System.out.println(jobName);
		
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
	
	/* public void writeCsvFile() throws Exception {
		
		Thread.sleep(1000);
		driver.findElement(By.id("job_counter_start_0")).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		String set = driver.findElement(By.xpath("//span[contains(text(), 'Active')]")).getText();
		
		new Select(driver.findElement(By.id("notification_type"))).selectByVisibleText("Error + Info");
		Thread.sleep(1000);
		String set2 = driver.findElement(By.id("stat_notification")).getText();
		
		 File file = new File("C:\\Users\\sr39\\git\\smoketest\\CSV_files\\sneha.csv"); 
		 
		 try {
			 FileWriter outputfile = new FileWriter(file);
			 
			 CSVWriter writer = new CSVWriter(outputfile); 
			 
			 String[] header = { "Name", "Class"}; 
		        writer.writeNext(header);
		        
		        
		        
		        String[] data1 = { set, set2 }; 
		        writer.writeNext(data1); 
		        
		        writer.close();
		        
		        System.out.println("write is completed");
		 }
		 
		 catch (IOException e) { 
		        
		        e.printStackTrace(); 
		    } 
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	/*
	    public void teardown() throws Exception {
		
		Thread.sleep(1000);
		boolean start_button = driver.findElement(By.id("job_counter_start_0")).isDisplayed();
		if (start_button == true) {
			driver.findElement(By.id("job_counter_start_0")).click();
		}
		else
		{
			System.out.println("jobfailed");
		}
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		boolean active_job = driver.findElement(By.xpath("//span[contains(text(), 'Active')]")).isDisplayed();
		if (active_job == true) {
			String se = driver.findElement(By.xpath("//span[contains(text(), 'Active')]")).getText();
			System.out.println(se);
			new Select(driver.findElement(By.id("notification_type"))).selectByVisibleText("Error + Info");
			Thread.sleep(1000);
			String se1 = driver.findElement(By.id("stat_notification")).getText();
			System.out.println(se1);
		} else {
			System.out.println("jobfailed");
		}
		// driver.quit();
	}
	
	

	@AfterMethod
	public void screen(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.FAILURE) {
			//Helper.screenShoot(driver);
		}
	}*/

}
