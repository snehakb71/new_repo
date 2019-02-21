package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlexOutput {

	WebDriver driver;

	public FlexOutput(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* ****************** FLEX UDP OUTPUT **************************** */

	@FindBy(id = "sink_udp_ip")
	@CacheLookup
	WebElement SelectUDP;

	@FindBy(id = "gstaf_sink_udp_ip_1")
	@CacheLookup
	WebElement Udpoutput_IP;

	@FindBy(id = "gstaf_sink_udp_port_1")
	@CacheLookup
	WebElement Udpoutput_port;

	@FindBy(xpath = "xpath://*[@id=\"ts_program_row_1_1\"]/div[5]/div[2]/a")
	@CacheLookup
	WebElement AddTrack1;

	@FindBy(id = "mpeg_ts_tracks_1_1")
	@CacheLookup
	WebElement Video1;

	@FindBy(id = "mpeg_ts_tracks_1_1")
	@CacheLookup
	WebElement Audio1;

	@FindBy(id = "muxer_ts_bitrate_1")
	@CacheLookup
	WebElement Bitrate;

	/* ****************** FLEX RTP OUTPUT **************************** */

	@FindBy(id = "gstaf_format_packetizer")
	WebElement RtpOutput;

	/* ****************** FLEX RTMP OUTPUT **************************** */

	@FindBy(id = "sink_rtmp_ip")
	WebElement SelectRtmp;

	@FindBy(id = "gstaf_sink_rtmp_stream_name_1")
	WebElement Rtmpoutputurl;

	@FindBy(id = "gstaf_sink_rtmp_server_url")
	WebElement Rtmpstreamname;

	/* ****************** FLEX SRT OUTPUT **************************** */

	@FindBy(id = "sink_srt_ip")
	WebElement SelectSRT;

	@FindBy(id = "gstaf_sink_srt_host_1")
	WebElement Srt_IPAddress;

	@FindBy(id = "gstaf_sink_srt_port_1")
	WebElement Srt_Port;

	/* ****************** FLEX FILE STREAM OUTPUT **************************** */

	@FindBy(id = "sink_file_stream_archive")
	WebElement SelectFileStream;

	@FindBy(id = "gstaf_sink_file_location_1")
	WebElement OutputFilepath;

	/* ****************** OUTPUT CLUSTERNAME **************************** */

	@FindBy(id = "cluster_name")
	WebElement OutputClusterName;

	/* ******************CREATE OUTPUT **************************** */

	@FindBy(id = "create_output")
	WebElement AddOutput;

	/********************************************************************************************************************************/

	/* ****************** UDP OUTPUT **************************** */

	public void Flex_UdpOutput(String clustername, String ipaddress, String port) throws Exception {

		OutputClusterName.clear();
		OutputClusterName.sendKeys(clustername);
		SelectUDP.click();
		Thread.sleep(500);
		Udpoutput_IP.clear();
		Udpoutput_IP.sendKeys(ipaddress);
		Udpoutput_port.clear();
		Udpoutput_port.sendKeys(port);
		AddTrack1.click();
		Thread.sleep(500);
		Video1.click();
		new Select(Video1).selectByVisibleText("1_Video");
		Audio1.click();
		new Select(Audio1).selectByVisibleText("1_Audio");
		Thread.sleep(500);
		AddOutput.click();

	}

	/* ****************** RTMP OUTPUT **************************** */

	public void Flex_RtmpOutput(String clustername, String rtmpurl, String streamname) throws InterruptedException

	{
		OutputClusterName.clear();
		OutputClusterName.sendKeys(clustername);
		SelectRtmp.click();
		Thread.sleep(500);
		Rtmpoutputurl.clear();
		Rtmpoutputurl.sendKeys(rtmpurl);
		Rtmpstreamname.sendKeys(streamname);
		AddOutput.click();

	}

	/* ****************** SRT OUTPUT **************************** */

	public void Flex_SRTOutput(String clustername, String srtip, String srtport) throws InterruptedException {
		OutputClusterName.clear();
		OutputClusterName.sendKeys(clustername);
		SelectSRT.click();
		Thread.sleep(500);
		Srt_IPAddress.clear();
		Srt_IPAddress.sendKeys(srtip);
		Srt_IPAddress.clear();
		Srt_Port.clear();
		Srt_Port.sendKeys(srtport);
		AddOutput.click();

	}

	/* ****************** FILESTREAM OUTPUT **************************** */

	public void Flex_FileStreamOutput(String clustername, String path)

	{
		OutputClusterName.clear();
		OutputClusterName.sendKeys(clustername);
		SelectFileStream.click();
		OutputFilepath.clear();
		OutputFilepath.sendKeys(path);
		AddOutput.click();
	}

	/* ****************** RTP OUTPUT **************************** */

	public void Flex_RtpOutput(String clustername,String ipaddress, String port, String intrface) throws Exception {

		OutputClusterName.clear();
		OutputClusterName.sendKeys(clustername);
		SelectUDP.click();
		Thread.sleep(500);
		Udpoutput_IP.clear();
		Udpoutput_IP.sendKeys(ipaddress);
		Udpoutput_port.clear();
		Udpoutput_port.sendKeys(port);
		AddTrack1.click();
		Thread.sleep(500);
		Video1.click();
		new Select(Video1).selectByVisibleText("1_Video");
		Audio1.click();
		new Select(Audio1).selectByVisibleText("1_Audio");
		RtpOutput.click();
		new Select(RtpOutput).selectByVisibleText("RTP");
		AddOutput.click();

	}

}
