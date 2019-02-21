package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlexInput {

	WebDriver driver;

	public FlexInput(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	/* ****************** FLEX UDP INPUT **************************** */

	@FindBy(id = "udp_src_btn")
	@CacheLookup
	WebElement Selectudp;

	@FindBy(id = "udp_ip")
	@CacheLookup
	WebElement Udpinput_ip;

	@FindBy(id = "udp_port")
	@CacheLookup
	WebElement Udpinput_port;

	@FindBy(id = "udp_interface")
	@CacheLookup
	WebElement Udpinput_interface;

	/* ****************** FLEX RTP INPUT **************************** */

	@FindBy(id = "gstaf_format_depacketizer")
	WebElement Depacketizer;

	/* ****************** FLEX RTMP INPUT **************************** */

	@FindBy(id = "rtmp_src_btn")
	WebElement Selectrtmp;

	@FindBy(id = "gstaf_src_rtmp_server_url")
	WebElement Rtmpinputurl;

	@FindBy(id = "gstaf_src_rtmp_stream_name")
	WebElement Rtmpstreamname;

	/* ****************** FLEX SRT INPUT **************************** */

	@FindBy(id = "srt_src_btn")
	WebElement Srt_input;

	@FindBy(id = "gstaf_src_srt_port")
	WebElement Srt_port;

	/* ****************** FLEX RTSP INPUT **************************** */

	@FindBy(id = "rtsp_src_btn")
	WebElement Rtsp_input;

	@FindBy(id = "rtsp_input_url")
	WebElement Rtsp_url;

	/* ****************** FLEX HTTP INPUT **************************** */

	@FindBy(id = "http_src_btn")
	WebElement Http_input;

	@FindBy(id = "http_input_url")
	WebElement Http_url;

	/* ****************** FLEX TEST PATTERN INPUT **************************** */

	@FindBy(id = "raw_sdmi_src_btn")
	WebElement Test_pattern_input;

	@FindBy(id = "video_test_pattern_value")
	WebElement Video_pattern;

	@FindBy(id = "audio_test_pattern_value")
	WebElement Audio_pattern;

	/* ****************** FLEX FILE STREAM INPUT **************************** */

	@FindBy(id = "filestream_src_btn")
	WebElement SelectFileStream;

	@FindBy(id = "input_file_name")
	WebElement Filepath;
	
	
	/* ****************** FLEX IMAGE SLATE INPUT **************************** */

	@FindBy(id = "imageslate_src_btn")
	WebElement SelectImageSlate;

	@FindBy(id = "gstaf_src_image_slate_image_location")
	WebElement ImagePath;
	
	
	/* ****************** FLEX WEBCAM INPUT **************************** */

	@FindBy(id = "webcam_src_btn")
	WebElement SelectWebcam;

	@FindBy(id = "raw_video_uvc_device_id")
	WebElement webcamdevice;
	
	
	
	/**************************************************************************************************************/
	

	
	/* ****************** UDP INPUT **************************** */

	public void Flex_UdpInput(String ipaddress, String port, String intrface) throws Exception {

		Selectudp.click();
		Thread.sleep(500);
		Udpinput_ip.clear();
		Udpinput_ip.sendKeys(ipaddress);
		Udpinput_port.clear();
		Udpinput_port.sendKeys(port);
		Udpinput_interface.click();
		new Select(Udpinput_interface).selectByVisibleText(intrface);

	}

	/* ****************** RTMP INPUT **************************** */

	public void Flex_RtmpInput(String rtmpurl, String streamname) throws InterruptedException

	{
		Selectrtmp.click();
		Thread.sleep(500);
		Rtmpinputurl.clear();
		Rtmpinputurl.sendKeys(rtmpurl);
		Rtmpstreamname.sendKeys(streamname);

	}

	/* ****************** SRT INPUT **************************** */

	public void Flex_SRTInput(String srtPort) throws InterruptedException {
		Srt_input.click();
		Thread.sleep(500);
		Srt_port.sendKeys(srtPort);

	}

	/* ****************** RTSP INPUT **************************** */

	public void Flex_RTSPInput(String rtspUrl) throws InterruptedException {
		Rtsp_input.click();
		Thread.sleep(500);
		Rtsp_url.clear();
		Rtsp_url.sendKeys(rtspUrl);

	}

	/* ****************** HTTP INPUT **************************** */

	public void Flex_HTTPInput(String httpURL) throws InterruptedException {
		Http_input.click();
		Thread.sleep(500);
		Http_url.clear();
		Http_url.sendKeys(httpURL);

	}

	/* ****************** PATTERN INPUT **************************** */

	public void Flex_TestPattern()

	{
		Test_pattern_input.click();
		Video_pattern.click();
		Audio_pattern.click();

	}

	/* ****************** FILESTREAM INPUT **************************** */

	public void Flex_FileStream(String path) {
		SelectFileStream.click();
		Filepath.clear();
		Filepath.sendKeys(path);
	}

	/* ****************** RTP INPUT **************************** */

	public void Flex_RtpInput(String ipaddress, String port, String intrface) throws Exception {

		Selectudp.click();
		Thread.sleep(500);
		Udpinput_ip.clear();
		Udpinput_ip.sendKeys(ipaddress);
		Udpinput_port.clear();
		Udpinput_port.sendKeys(port);
		Udpinput_interface.click();
		new Select(Udpinput_interface).selectByVisibleText(intrface);
		Depacketizer.click();
		new Select(Depacketizer).selectByVisibleText("RTP");

	}
	
	/* ****************** IMAGESLATE INPUT **************************** */

	public void Flex_ImageSlate(String path) {
		SelectImageSlate.click();
		ImagePath.clear();
		ImagePath.sendKeys(path);
	}
	
	
	/* ****************** WEBCAM INPUT **************************** */

	public void Flex_Webcam(String device) {
		SelectWebcam.click();
		webcamdevice.click();
		new Select(webcamdevice).selectByVisibleText(device);
	}

}
