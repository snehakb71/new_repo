package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class XportInput {
	
	WebDriver driver;
	
	public XportInput(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	/* ****************** Xport UDP INPUT **************************** */
	
	@FindBy(xpath = "//*[@id=\"input_src_block\"]/div[2]/div[1]/a")
	@CacheLookup
	WebElement udpIn;
	
	@FindBy(id = "udp_ip")
	@CacheLookup
	WebElement udpIn_ip;

	@FindBy(id = "udp_port")
	@CacheLookup
	WebElement udpIn_port;

	@FindBy(id = "udp_interface")
	@CacheLookup
	WebElement udpIn_interface;
	
	/* ****************** XPORT SRT INPUT **************************** */

	@FindBy(id = "srt_src_btn")
	WebElement srtIn;
	
	@FindBy(id = "gstaf_src_srt_server")
	WebElement srtIn_pull;
	
	@FindBy(id = "gstaf_src_srt_host")
	WebElement srtIn_address;

	@FindBy(id = "gstaf_src_srt_port")
	WebElement srtIn_port;
	
	/* ****************** XPORT TEST PATTERN INPUT **************************** */

	@FindBy(xpath = "//*[@id=\"input_src_block\"]/div[2]/div[3]/a")
	WebElement testPatternIn;

	@FindBy(id = "video_test_pattern_value")
	WebElement videoPattern;

	@FindBy(id = "audio_test_pattern_value")
	WebElement audioPattern;
	
	/* ****************** Xport RAW INPUT **************************** */
	
	@FindBy(xpath = "//a[@onclick=\"set_input_source('MULTI_RAW');\"]")
	@CacheLookup
	WebElement RAWIn;
	
	@FindBy(id = "raw_video_device_id")
	@CacheLookup
	WebElement rawVedioDevice;
	
	@FindBy(id = "raw_audio_device_id")
	@CacheLookup
	WebElement rawAudioDevice;
	
	@FindBy(id = "raw_video_iface")
	@CacheLookup
	WebElement rawVedioInterface;
	
	/**************************************************************************************************************/
	

	/* ****************** UDP INPUT **************************** */

	public void udpInput(String ipaddress, String port, String intrface) throws Exception {

		udpIn.click();
		Thread.sleep(500);
		udpIn_ip.clear();
		udpIn_ip.sendKeys(ipaddress);
		udpIn_port.clear();
		udpIn_port.sendKeys(port);
		udpIn_interface.click();
		new Select(udpIn_interface).selectByVisibleText(intrface);
	}
		
	/* ****************** SRT INPUT **************************** */

	public void srtInput(String ip, String port) throws Exception {
		
		srtIn.click();
		Thread.sleep(500);
		srtIn_pull.click();
		srtIn_address.clear();
		srtIn_address.sendKeys(ip);
		srtIn_port.clear();
		srtIn_port.sendKeys(port);
	}
	
	/* ****************** TEST PATTERN INPUT **************************** */

	public void TestPattern() {
		
		testPatternIn.click();
		videoPattern.click();
		audioPattern.click();
	}
	

	/* ****************** RAW/SDI INPUT **************************** */

	public void RAWinput(String videoDevice, String audioDevice, String videoInterface) throws Exception {
				
		RAWIn.click();
		Thread.sleep(500);
		new Select(rawVedioDevice).selectByValue(videoDevice);;
		new Select(rawAudioDevice).selectByVisibleText(audioDevice);
		new Select(rawVedioInterface).selectByVisibleText(videoInterface);
	}

}
