package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StatixJobType

{

	WebDriver driver;

	public StatixJobType(WebDriver driver) {
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

	@FindBy(xpath = "//a[contains(text(), 'PIXFIX Statix')]")
	@CacheLookup
	WebElement ClickFlexJobType;

	@FindBy(xpath = "//a[contains(text(), 'New')]")
	@CacheLookup
	WebElement CreateNewFlexJob;

	/* ****************** STATIX JOB DETAILS **************************** */

	@FindBy(id = "job_name")
	@CacheLookup
	WebElement Jobname;

	@FindBy(id = "job_description")
	@CacheLookup
	WebElement Jobdescription;

	/* ****************** STATIX INPUT DETAILS **************************** */

	@FindBy(id = "src_type")
	@CacheLookup
	WebElement SelectStatixInput;

	@FindBy(id = "input_src_folder_path")
	@CacheLookup
	WebElement FolderPath;

	@FindBy(id = "input_file_name")
	@CacheLookup
	WebElement FilePath;

	/* ****************** STATIX PROFILE DETAILS **************************** */

	@FindBy(id = "show_profile")
	@CacheLookup
	WebElement ClickProfile;

	@FindBy(id = "pfmt_profile_preset")
	@CacheLookup
	WebElement SelectPreset;

	/* ****************** STATIX OUTPUT FILE DETAILS **************************** */

	@FindBy(id = "sink_file_stream_archive")
	@CacheLookup
	WebElement ClickFileStream;

	@FindBy(id = "cluster_name")
	@CacheLookup
	WebElement OutputClusterName;

	@FindBy(id = "gstaf_sink_file_location_1")
	@CacheLookup
	WebElement DestinationPath;

	@FindBy(id = "gstaf_format_mux")
	@CacheLookup
	WebElement SelectMuxerType;
	
	@FindBy(id = "create_output")
	@CacheLookup
	WebElement CreateOutput;
	
	

	@FindBy(xpath = "//a[contains(text(), 'Add Output Group')]")
	@CacheLookup
	WebElement AddOutputGroup;

	@FindBy(id = "save_job")
	@CacheLookup
	WebElement AddStatixJob;

	/*
	 * ****************** STATIX STREAMER OUTPUT DETAILS
	 * ****************************
	 */

	@FindBy(id = "show_streamer")
	@CacheLookup
	WebElement ClickStreamer;

	@FindBy(id = "streamer_name")
	@CacheLookup
	WebElement Streamname;

	@FindBy(id = "show_streamer_protocol")
	@CacheLookup
	WebElement AddStreamerProtocol;

	@FindBy(id = "streamer_protocol_type")
	@CacheLookup
	WebElement SelectStreamerType;

	@FindBy(id = "streamer_file_path")
	@CacheLookup
	WebElement SelectStreamerPath;

	@FindBy(id = "add_streamer")
	@CacheLookup
	WebElement AddStreamer;

	@FindBy(xpath = "//*[@id=\"statix_folder_block\"]/div[2]/label/span[1]")
	@CacheLookup
	WebElement EnableSubfolder;

	/*******************************************************************************************************************/

	public void LoginPixfixStatix(String UsernamePixfix, String PasswordPixfix) throws InterruptedException

	{
		PixfixUserName.clear();
		PixfixUserName.sendKeys(UsernamePixfix);
		PixfixPassword.clear();
		PixfixPassword.sendKeys(PasswordPixfix);
		LoginPixfix.click();
		Thread.sleep(500);

	}

	public void NavigateToNewStatix() throws InterruptedException

	{

		ClickJobs.click();
		Thread.sleep(500);
		ClickFlexJobType.click();
		Thread.sleep(500);
		CreateNewFlexJob.click();
		Thread.sleep(500);

	}

	public void StatixJobDataInfo(String jobname)

	{
		Jobname.clear();
		Jobname.sendKeys(jobname);
		Jobdescription.clear();
		Jobdescription.sendKeys("Statix");

	}

	public void StatixInputFile(String filepath)

	{
		SelectStatixInput.click();
		new Select(SelectStatixInput).selectByVisibleText("File");
		FilePath.clear();
		FilePath.sendKeys(filepath);

	}
	
	
	public void StatixInputFolder(String filepath)

	{
		SelectStatixInput.click();
		new Select(SelectStatixInput).selectByVisibleText("Folder");
		FolderPath.clear();
		FolderPath.sendKeys(filepath);

	}

	public void StatixAddProfile(String preset) throws InterruptedException

	{
		ClickProfile.click();
		Thread.sleep(500);
		SelectPreset.click();
		Thread.sleep(500);
		new Select(SelectPreset).selectByVisibleText(preset);

	}

	public void StatixAddFileOut(String culstername, String Filepath, String MuxerType) throws InterruptedException

	{
		ClickFileStream.click();
		Thread.sleep(500);
		OutputClusterName.clear();
		OutputClusterName.sendKeys(culstername);
		DestinationPath.clear();
		DestinationPath.sendKeys(Filepath);
		SelectMuxerType.click();
		new Select(SelectMuxerType).selectByVisibleText(MuxerType);
		CreateOutput.click();
		Thread.sleep(500);

	}

	public void StatixAddStreamer(String culstername, String Filepath, String protocol) throws InterruptedException

	{
		ClickStreamer.click();
		Thread.sleep(500);
		Streamname.clear();
		Streamname.sendKeys(culstername);
		AddStreamerProtocol.click();
		Thread.sleep(500);
		SelectStreamerType.click();
		new Select(SelectStreamerType).selectByVisibleText(protocol);
		Thread.sleep(500);
		SelectStreamerPath.clear();
		SelectStreamerPath.sendKeys(Filepath);
		AddStreamer.click();
		Thread.sleep(500);

	}

	public void AddOutput() throws InterruptedException

	{
		AddOutputGroup.click();
		Thread.sleep(500);

	}

	public void AddStatixJobType() throws InterruptedException

	{
		AddStatixJob.click();
		Thread.sleep(500);

	}

}
