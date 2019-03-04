package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(id = "gstaf_src_srt_host")
	WebElement SRT_Address;

	@FindBy(id = "gstaf_src_srt_port")
	WebElement SRT_Port;
	
	@FindBy(id = "gstaf_src_srt_server")
	WebElement SRTClientEnabled;
	
	
	
	/* ****************** FLEX NDI INPUT **************************** */

	@FindBy(id = "ndi_src_btn")
	WebElement SelectNDI;

	@FindBy(id = "ndi_src")
	WebElement NDIVideoSource;
	
	@FindBy(id = "ndi_audio_src")
	WebElement NDIAudioSource;
	

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

	/* ****************** FLEX RAW INPUT **************************** */

	@FindBy(id = "raw_video_src_btn")
	WebElement ClickRawInput;

	@FindBy(id = "raw_video_device_id")
	WebElement SelectVideoDevice;

	@FindBy(id = "raw_video_iface")
	WebElement SelectVideoInterface;

	@FindBy(id = "raw_video_mode")
	WebElement SelectVideoStandard;

	@FindBy(id = "raw_audio_device_id")
	WebElement SelectAudioDevice;

	@FindBy(id = "src_audio_channel")
	WebElement SelectAudioChannel;

	@FindBy(id = "src_audio_interface")
	WebElement SelectAudioInterface;

	/* ****************** FLEX SCTE **************************** */

	@FindBy(id = "input_metadata_enable")
	WebElement EnableMetaData;

	@FindBy(id = "input_meta_type")
	WebElement SelectMetaType;

	@FindBy(id = "meta_cuetone_src")
	WebElement SelectContentType;

	@FindBy(id = "meta_cuetone_src_type")
	WebElement SelectAPICuetoneType;

	@FindBy(id = "raw_meta_cuetone_content_duration")
	WebElement PeriodicContentDuration;

	@FindBy(id = "raw_meta_cuetone_content_duration")
	WebElement PeriodicAdDuration;

	/**************************************************************************************************************/

	/* ****************** UDP INPUT **************************** */

	public void Flex_UdpInput(String UdpInputIP, String UdpInputPort, String UdpInputInterface) throws Exception {

		Selectudp.click();
		Thread.sleep(500);
		Udpinput_ip.clear();
		Udpinput_ip.sendKeys(UdpInputIP);
		Udpinput_port.clear();
		Udpinput_port.sendKeys(UdpInputPort);
		Udpinput_interface.click();
		Thread.sleep(500);
		new Select(Udpinput_interface).selectByVisibleText(UdpInputInterface);
		Thread.sleep(500);

	}

	public void Flex_UdpInputUnicast(String UdpInputIPUnicast, String UdpInputPort) throws Exception

	{

		Selectudp.click();
		Udpinput_ip.clear();
		Udpinput_ip.sendKeys(UdpInputIPUnicast);
		Udpinput_port.clear();
		Udpinput_port.sendKeys(UdpInputPort);

	}

	/* ****************** RTMP INPUT **************************** */

	public void Flex_RtmpInput(String InputRtmpurl, String streamname) throws InterruptedException

	{
		Selectrtmp.click();
		Thread.sleep(500);
		Rtmpinputurl.clear();
		Rtmpinputurl.sendKeys(InputRtmpurl);
		Rtmpstreamname.clear();
		Rtmpstreamname.sendKeys(streamname);

	}

	/* ****************** SRT INPUT **************************** */

	public void Flex_SRTClientInput(String SRTAddress,String SRTPort) throws InterruptedException {
		Srt_input.click();
		Thread.sleep(500);
		SRTClientEnabled.click();
		Thread.sleep(500);
		SRT_Address.clear();
		SRT_Address.sendKeys(SRTAddress);
		SRT_Port.clear();
		SRT_Port.sendKeys(SRTPort);

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

	public void Flex_FileStreamInput(String path) {
		SelectFileStream.click();
		Filepath.clear();
		Filepath.sendKeys(path);
	}

	/* ****************** RTP INPUT **************************** */

	public void Flex_RtpInput(String RTPIP, String port, String IPInterface) throws Exception {

		Selectudp.click();
		Thread.sleep(500);
		Udpinput_ip.clear();
		Udpinput_ip.sendKeys(RTPIP);
		Udpinput_port.clear();
		Udpinput_port.sendKeys(port);
		Udpinput_interface.click();
		new Select(Udpinput_interface).selectByVisibleText(IPInterface);
		Depacketizer.click();
		new Select(Depacketizer).selectByVisibleText("RTP");

	}

	public void Flex_RtpInputUnicast(String RTPIP, String port) throws Exception {

		Selectudp.click();
		Thread.sleep(500);
		Udpinput_ip.clear();
		Udpinput_ip.sendKeys(RTPIP);
		Udpinput_port.clear();
		Udpinput_port.sendKeys(port);
		Depacketizer.click();
		Thread.sleep(500);
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

	/* ****************** RAW INPUT **************************** */

	public void Flex_RawInput(String videodevice, String audiodevice) throws InterruptedException

	{
		ClickRawInput.click();
		Thread.sleep(500);
		SelectVideoDevice.click();
		Thread.sleep(500);
		new Select(SelectVideoDevice).selectByVisibleText(videodevice);
		SelectVideoDevice.click();
		Thread.sleep(500);
		new Select(SelectVideoDevice).selectByVisibleText(audiodevice);

	}

	/* ****************** UDP SCTE **************************** */
	
	public void EnableMetaData()

	{

		Actions act = new Actions(driver);
		act.moveToElement(EnableMetaData).click().build().perform();
		
	}

	public void Inband(String metatype)

	{

		SelectMetaType.click();
		new Select(SelectMetaType).selectByVisibleText(metatype);
		SelectContentType.click();
		new Select(SelectContentType).selectByVisibleText("INBAND");
	}

	public void ApiCueOutAndDuration(String metatype)

	{

		SelectMetaType.click();
		new Select(SelectMetaType).selectByVisibleText(metatype);
		SelectContentType.click();
		new Select(SelectContentType).selectByVisibleText("API");
		SelectAPICuetoneType.click();
		new Select(SelectAPICuetoneType).selectByVisibleText("CueOut & Duration");
	}
	
	public void ApiCueOutAndCueIn(String metatype)

	{

		SelectMetaType.click();
		new Select(SelectMetaType).selectByVisibleText(metatype);
		SelectContentType.click();
		new Select(SelectContentType).selectByVisibleText("API");
		SelectAPICuetoneType.click();
		new Select(SelectAPICuetoneType).selectByVisibleText("CueOut & CueIn");
	}

	public void Periodic(String metatype,String contentduration,String adduration)

	{

		SelectMetaType.click();
		new Select(SelectMetaType).selectByVisibleText(metatype);
		SelectContentType.click();
		new Select(SelectContentType).selectByVisibleText("PERIODIC");
		SelectAPICuetoneType.click();
		PeriodicContentDuration.clear();
		PeriodicContentDuration.sendKeys(contentduration);
		PeriodicAdDuration.clear();
		PeriodicAdDuration.sendKeys(adduration);
		
	}
	
	
	

}
