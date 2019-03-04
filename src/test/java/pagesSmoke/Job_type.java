package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Job_type {
	WebDriver driver;

	public Job_type(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * @FindBy(linkText="pixflex-menu-arrow")
	 * 
	 * @CacheLookup WebElement jobs;
	 */

	@FindBy(xpath = "//span[@id='pixflex-menu-arrow']")
	@CacheLookup
	WebElement main_job;

	@FindBy(xpath = "//a[contains(text(), 'PIXFIX Versa')]")
	@CacheLookup
	WebElement versa_job_type;

	@FindBy(xpath = "//a[contains(text(), 'New')]")
	@CacheLookup
	WebElement versa_new_job;

	@FindBy(xpath = "//a[contains(text(), 'PIXFIX Flex')]")
	WebElement flex;

	@FindBy(xpath = "//a[contains(text(), 'PIXFIX Xport')]")
	WebElement xport;

	@FindBy(id = "pixflex-menu-media")
	WebElement content;

	@FindBy(id = "video_active")
	WebElement Storage;

	@FindBy(xpath = "//a[@data-url='/storage/device/sneha']")
	WebElement sne_folder;
	
	@FindBy(xpath = "//a[@data-url='/storage/device/sneha/input']")
	WebElement input_folder;

	
	
	@FindBy(xpath="//a[@data-original-title='Upload Files']")
	WebElement upload;
	
	@FindBy(id="bulk_upload")
	WebElement bulkUpoad;
	
	public void versa_job() throws Exception {
		main_job.click();
		Thread.sleep(1000);

		versa_job_type.click();
		Thread.sleep(1000);
		versa_new_job.click();
		Thread.sleep(1000);

	}

	public void content() throws Exception {
		content.click();
		Thread.sleep(1000);
		Storage.click();
		//sdevice.click();
		Thread.sleep(1000);
		sne_folder.click();
		Thread.sleep(1000);
		input_folder.click();
		Thread.sleep(1000);
		//upload.click();
	}
	
	public void mp4FileUpload() throws Exception
	{
		
		upload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Output\\auto_it_folder\\Mp4_File_Upload.exe");
		Thread.sleep(1000);
		
	}
	
	public void tsFileUpload() throws Exception
	{
		upload.click();
		Thread.sleep(1000);
		
		Runtime.getRuntime().exec("C:\\Output\\auto_it_folder\\Ts_file_upload.exe");
		Thread.sleep(1000);
		
	}
	
	public void imageFileUpload() throws Exception
	{
		upload.click();
		Thread.sleep(1000);
		
		Runtime.getRuntime().exec("C:\\Output\\auto_it_folder\\Image_input.exe");
		Thread.sleep(1000);
		
	}
	
	public void bulkUp() throws Exception {
		bulkUpoad.click();
		Thread.sleep(1000);
	}


	/* ****************** create new xport job ****************************NANDINI */
	
	public void xportJob() throws Exception {
		
		main_job.click();
		Thread.sleep(1000);
		xport.click();
		Thread.sleep(1000);
	}
	
	public void newJob() throws Exception {
		
		versa_new_job.click();
		Thread.sleep(1000);
		
	}

}
