package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

	@FindBy(xpath = "//*[@id=\"ts_program_row_1_1\"]/div[5]/div[2]/a")
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
	
	
	@FindBy(id = "gstaf_format_mux_type")
	@CacheLookup
	WebElement SelectCompliance;

	/* ****************** FLEX RTP OUTPUT **************************** */

	@FindBy(id = "gstaf_format_packetizer")
	WebElement RtpOutput;

	/* ****************** FLEX RTMP OUTPUT **************************** */

	@FindBy(id = "sink_rtmp_ip")
	WebElement SelectRtmp;

	@FindBy(id = "gstaf_sink_rtmp_stream_name_1")
	WebElement Rtmpstreamname;

	@FindBy(id = "gstaf_sink_rtmp_server_url")
	WebElement Rtmpoutputurl;

	/* ****************** FLEX SRT OUTPUT **************************** */

	@FindBy(id = "sink_srt_ip")
	WebElement SelectSRT;

	@FindBy(id = "gstaf_sink_srt_host_1")
	WebElement Srt_IPAddress;

	@FindBy(id = "gstaf_sink_srt_port_1")
	WebElement Srt_Port;
	
	@FindBy(id = "gstaf_sink_srt_server_1")
	WebElement SRTServerEnabled;
	

	/* ****************** FLEX FILE STREAM OUTPUT **************************** */

	@FindBy(id = "sink_file_stream_archive")
	WebElement SelectFileStream;

	@FindBy(id = "gstaf_sink_file_location_1")
	WebElement OutputFilepath;
	
	@FindBy(id = "file_sink_slicing")
	WebElement SelectSlicing;
	
	@FindBy(id = "file_sink_max_files")
	WebElement Maximum_Files;
	
	@FindBy(id = "file_sink_slice_duration")
	WebElement Time_SliceDuration;
	
	@FindBy(id = "file_sink_max_slice_size")
	WebElement Size_SliceSize;
	
	@FindBy(id = "file_sink_slicing_clock")
	WebElement Clock_Duration;
	
	@FindBy(id = "file_sink_name_convention")
	WebElement NameConvention;


	/* ****************** OUTPUT CLUSTERNAME **************************** */

	@FindBy(id = "cluster_name")
	WebElement OutputClusterName;

	/* ******************CREATE OUTPUT **************************** */

	@FindBy(id = "create_output")
	WebElement AddOutput;

	/* ******************ADD FLEX JOB **************************** */

	@FindBy(id = "save_job")
	WebElement AddJob;

	/* ******************ADD OUTPUT GROUP **************************** */

	@FindBy(xpath = "//a[contains(text(), 'Add Output Group')]")
	@CacheLookup
	WebElement AddOutputGroup;

	/* ****************** STREAMERS **************************** */

	@FindBy(id = "show_streamer")
	WebElement SelectStreamer;

	@FindBy(id = "show_streamer_protocol")
	WebElement AddStreamerProtocol;

	@FindBy(id = "streamer_protocol_type")
	WebElement SelectStreamerType;

	@FindBy(id = "add_streamer")
	WebElement AddStreamer;

	@FindBy(id = "streamer_name")
	WebElement StreamerName;

	@FindBy(id = "show_streamer_rtmp")
	WebElement SelectWowzaRtmp;

	@FindBy(id = "show_streamer_rtsp")
	WebElement SelectWowzaRtsp;
	
	

	/* ****************** SCTE **************************** */
	
	@FindBy(id = "add_mux_overhead_1")
	WebElement EnableAddMuxOverhead;

	@FindBy(id = "cuetone_in_manifest_1")
	WebElement EnableCuetoneInManifest;
	
	@FindBy(name = "streamer_scte_mode_1")
	WebElement SelectCueToneMode;
	

	@FindBy(id = "cuetone_splice_info_1")
	WebElement EnableCuetoneSpliceInfo;
	
	@FindBy(id = "scte_spliceinfo_mode_1")
	WebElement SelectSpliceInfoMode;
	

	@FindBy(id = "cuetone_as_timed_meta_1")
	WebElement EnableCuetoneTimedMeta;
	
	@FindBy(id = "timed_meta_mode_2")
	WebElement SelectTimedMetaMode;
	

	

	/********************************************************************************************************************************/

	/* ****************** UDP OUTPUT **************************** */

	public void Flex_UdpOutput(String clustername, String IPLocal, String UdpOutPort, String UdpOutBitrate)
			throws Exception {

		SelectUDP.click();
		Thread.sleep(500);
		OutputClusterName.clear();
		OutputClusterName.sendKeys(clustername);
		Udpoutput_IP.clear();
		Udpoutput_IP.sendKeys(IPLocal);
		Udpoutput_port.clear();
		Udpoutput_port.sendKeys(UdpOutPort);
		Bitrate.clear();
		Bitrate.sendKeys(UdpOutBitrate);
		AddTrack1.click();
		Thread.sleep(500);
		Video1.click();
		new Select(Video1).selectByVisibleText("1_Video");
		AddTrack1.click();
		Thread.sleep(500);
		Audio1.click();
		new Select(Audio1).selectByVisibleText("1_Audio");
		Thread.sleep(500);
		AddOutput.click();

	}
	
	/* ****************** UDP OUTPUT WITH PTS BASED PCR **************************** */

	public void Flex_UdpOutputPTSBasedPCR(String clustername, String IPLocal, String UdpOutPort, String UdpOutBitrate)
			throws Exception {

		SelectUDP.click();
		Thread.sleep(500);
		OutputClusterName.clear();
		OutputClusterName.sendKeys(clustername);
		Udpoutput_IP.clear();
		Udpoutput_IP.sendKeys(IPLocal);
		Udpoutput_port.clear();
		Udpoutput_port.sendKeys(UdpOutPort);
		Bitrate.clear();
		Bitrate.sendKeys(UdpOutBitrate);
		AddTrack1.click();
		Thread.sleep(500);
		Video1.click();
		new Select(Video1).selectByVisibleText("1_Video");
		AddTrack1.click();
		Thread.sleep(500);
		Audio1.click();
		new Select(Audio1).selectByVisibleText("1_Audio");
		Thread.sleep(500);
		SelectCompliance.click();
		new Select(SelectCompliance).selectByVisibleText("PTS Based PCR");
		Thread.sleep(500);
		AddOutput.click();

	}
	
	

	/* ****************** RTMP OUTPUT **************************** */

	public void Flex_RtmpOutput(String clustername, String streamname, String OutputRtmpURL) throws InterruptedException

	{

		SelectRtmp.click();
		Thread.sleep(500);
		OutputClusterName.clear();
		OutputClusterName.sendKeys(clustername);
		Rtmpstreamname.clear();
		Rtmpstreamname.sendKeys(streamname);
		Rtmpoutputurl.clear();
		Rtmpoutputurl.sendKeys(OutputRtmpURL);
		AddOutput.click();

	}

	/* ****************** FILESTREAM OUTPUT **************************** */

	public void Flex_UserDefined(String clustername, String path) throws InterruptedException

	{

		SelectFileStream.click();
		Thread.sleep(500);
		OutputClusterName.clear();
		OutputClusterName.sendKeys(clustername);
		OutputFilepath.clear();
		OutputFilepath.sendKeys(path);
		SelectSlicing.click();
		new Select(SelectSlicing).selectByVisibleText("User Define");
		AddOutput.click();
	}
	
	
	/* ****************** FILESTREAM USERDEFINED **************************** */

	public void Flex_FileStreamOutput(String clustername, String path) throws InterruptedException

	{

		SelectFileStream.click();
		Thread.sleep(500);
		OutputClusterName.clear();
		OutputClusterName.sendKeys(clustername);
		OutputFilepath.clear();
		OutputFilepath.sendKeys(path);
		
		AddOutput.click();
	}

	/* ****************** RTP OUTPUT **************************** */

	public void Flex_RtpOutput(String clustername, String IPLocal, String UdpOutPort, String UdpOutBitrate)
			throws Exception {

		SelectUDP.click();
		Thread.sleep(500);
		OutputClusterName.clear();
		OutputClusterName.sendKeys(clustername);
		Udpoutput_IP.clear();
		Udpoutput_IP.sendKeys(IPLocal);
		Udpoutput_port.clear();
		Udpoutput_port.sendKeys(UdpOutPort);
		Bitrate.clear();
		Bitrate.sendKeys(UdpOutBitrate);
		AddTrack1.click();
		Thread.sleep(500);
		Video1.click();
		new Select(Video1).selectByVisibleText("1_Video");
		AddTrack1.click();
		Thread.sleep(500);
		Audio1.click();
		new Select(Audio1).selectByVisibleText("1_Audio");
		RtpOutput.click();
		new Select(RtpOutput).selectByVisibleText("RTP");
		AddOutput.click();

	}

	/* ****************** ADD FLEX JOB **************************** */

	public void AddFlexJob()

	{
		AddJob.click();
	}

	/* ****************** ADD OUTPUTGROUP **************************** */
	public void AddOutput()

	{
		AddOutputGroup.click();
	}

	/* ****************** FLEX STREAMER **************************** */

	public void Flex_Streamer(String clustername, String StreamerType) throws Exception

	{

		SelectStreamer.click();
		Thread.sleep(500);
		StreamerName.clear();
		StreamerName.sendKeys(clustername);
		AddStreamerProtocol.click();
		Thread.sleep(500);
		SelectStreamerType.click();
		Thread.sleep(500);
		new Select(SelectStreamerType).selectByVisibleText(StreamerType);
	
		

	}

	/* ****************** RTSP STREAMER **************************** */

	public void Flex_RtspStreamer(String clustername) throws Exception

	{

		SelectWowzaRtsp.click();
		Thread.sleep(500);
		StreamerName.clear();
		StreamerName.sendKeys(clustername);
		

	}

	/* ****************** RTMP STREAMER **************************** */
	public void Flex_RtmpStreamer(String clustername) throws Exception

	{

		SelectWowzaRtmp.click();
		Thread.sleep(500);
		StreamerName.clear();
		StreamerName.sendKeys(clustername);
		

	}
	
	public void AddStreamer() throws Exception

	{

		AddStreamer.click();

	}
	
	
	/* ****************** HLS CUETONE **************************** */
	
	public void EnableAddMuxOverhead()

	{

		Actions act = new Actions(driver);
		act.moveToElement(EnableAddMuxOverhead).click().build().perform();
		
	}
	
	public void EnableCuetoneInManifest()

	{

		Actions act = new Actions(driver);
		act.moveToElement(EnableCuetoneInManifest).click().build().perform();
		
	}
	
	public void EnableCuetoneSpliceInfo()

	{

		Actions act = new Actions(driver);
		act.moveToElement(EnableCuetoneSpliceInfo).click().build().perform();
		
	}
	
	public void EnableCuetoneTimedMeta()

	{

		Actions act = new Actions(driver);
		act.moveToElement(EnableCuetoneTimedMeta).click().build().perform();
		
	}
	
	/* ****************** SRT OUTPUT **************************** */

	
	public void Flex_SRTServerOutput(String clustername, String SRTport,String SRTOutBitrate)
			throws Exception {

		SelectSRT.click();
		Thread.sleep(500);
		OutputClusterName.clear();
		OutputClusterName.sendKeys(clustername);
		Actions act = new Actions(driver);
		act.moveToElement(SRTServerEnabled).click().build().perform();
		Srt_Port.clear();
		Srt_Port.sendKeys(SRTport);
		Bitrate.clear();
		Bitrate.sendKeys(SRTOutBitrate);
		AddTrack1.click();
		Thread.sleep(500);
		Video1.click();
		new Select(Video1).selectByVisibleText("1_Video");
		AddTrack1.click();
		Thread.sleep(500);
		Audio1.click();
		new Select(Audio1).selectByVisibleText("1_Audio");
		Thread.sleep(500);
		AddOutput.click();

	}

}
