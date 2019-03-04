package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InputVersa {

	WebDriver driver;

	public InputVersa(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "job_name")
	@CacheLookup
	WebElement job_na;

	// ********** **** *** ****** **** ********* **** ***UDP Input ***** *****
	// ***//

	@FindBy(id = "versa_src_udp")
	@CacheLookup
	WebElement udp1c;

	@FindBy(id = "gstaf_src_udp_ip")
	@CacheLookup
	WebElement udp_source1;

	@FindBy(id = "gstaf_src_udp_port")
	@CacheLookup
	WebElement udp_port1;

	@FindBy(id = "gstaf_src_udp_interface")
	@CacheLookup
	WebElement udp_inter;

	@FindBy(id = "gstaf_format_depacketizer")
	WebElement depacatizer;

	@FindBy(id = "demux_program_number_1")
	@CacheLookup
	WebElement sec_program1;

	@FindBy(id = "add_program")
	@CacheLookup
	WebElement add_program;

	@FindBy(id = "demux_program_number_2")
	@CacheLookup
	WebElement sec_program2;

	@FindBy(xpath = "//a[@onclick='add_track(2);']")
	@CacheLookup
	WebElement add_track;

	@FindBy(id = "track_type_2")
	@CacheLookup
	WebElement track_type;

	/////////////////////////// *************** *** ****** **** * Passthrogh

	@FindBy(id = "track_passthrough_1_1")
	WebElement videopassthrough;

	@FindBy(id = "track_passthrough_1_2")
	WebElement audiopassthrough;

	/////////////////////////////// ************************ metatrack

	@FindBy(xpath = "//a[@onclick='add_track(1);']")
	WebElement addTrack;

	@FindBy(id = "track_type_1")
	WebElement trackType;

	@FindBy(id = "meta_type_1")
	WebElement metaTracktype;

	@FindBy(id = "meta_cuetone_src_1_3")
	WebElement cuetoneSource;

	@FindBy(id = "meta_cuetone_src_type_1_3")
	WebElement cuetoneType;
	
	///// ******************** ******************* **********For Ts Scte File 
	@FindBy(xpath = "//a[@onclick='add_track(2);']")
	WebElement addTrackTS;
	
	@FindBy(id = "track_type_2")
	WebElement trackType_Ts;
	
	@FindBy(id = "meta_type_2")
	WebElement metaTracktypeTS;
	
	@FindBy(id = "meta_cuetone_src_2_3")
	WebElement cuetoneSourceTs;
	
	@FindBy(id = "meta_cuetone_src_type_2_3")
	WebElement cuetoneTypeTs;

	////////////////// ****** **** ********* **** ********* Perodic Scte

	@FindBy(id = "raw_meta_cuetone_content_duration_1_3")
	WebElement pero_conDuration;

	@FindBy(id = "raw_meta_cuetone_ad_duration_1_3")
	WebElement pero_AdDuration;

	//////////// ****** **** ********* **** ********* Scte line
	

	@FindBy(id = "scte104_line")
	WebElement scteLine;
	
	
	// *** **** **** **** *** **** **** **** *** **** **** ****** ****RTMP_input
	// *****

	@FindBy(id = "versa_src_rtmp")
	WebElement rtmp_input;

	@FindBy(id = "express_deinterlace_tooltip")
	WebElement pull_en;

	@FindBy(id = "gstaf_src_rtmp_server_url")
	WebElement rtmp_server_url_1;

	@FindBy(id = "gstaf_src_rtmp_stream_name")
	WebElement stream_name1;

	/// **** *** *** *** **** **** **** *** **** **** **** ****** **** SRT Input
	/// **********

	@FindBy(id = "versa_src_srt")
	WebElement srt_input;
	
	@FindBy(id = "gstaf_src_srt_server")
	WebElement srt_Clientinput;
	
	@FindBy(id = "gstaf_src_srt_host")
	WebElement srt_input_ip;
	

	@FindBy(id = "gstaf_src_srt_port")
	WebElement srt_port;

	/// **** *** *** *** **** **** **** *** **** **** **** ****** NDI Input
	/// **********

	@FindBy(id = "versa_src_ndi")
	WebElement Ndi_input;

	@FindBy(id = "ndi_src")
	WebElement ndiSource;

	/// ********** ************** **************** ****** *** ****** **** RTSP
	/// INPUT

	@FindBy(id = "versa_src_rtsp")
	WebElement rtsp_input;

	@FindBy(id = "gstaf_src_rtsp_url")
	WebElement rtsp_url;

	// *********** ************** ******************** ******** **** *** HTTP
	// INPUT

	@FindBy(id = "versa_src_http")
	WebElement http_input;

	@FindBy(id = "gstaf_src_http_url")
	WebElement http_url;

	// *********** ************** ******************** ** ********* **** Test
	// Pattern

	@FindBy(id = "versa_src_test_pattern")
	WebElement test_pattern_input;

	// *********** ************** ******************** ** ******** file_input

	@FindBy(id = "versa_src_filestream")
	WebElement file_input;

	@FindBy(id = "gstaf_src_file_stream_file_location")
	WebElement file_path;

	
	@FindBy(id="gstaf_format_demux")
	WebElement deMux;
	
	public void demuxer_se(String demux_ts)
	{
		new Select(deMux).selectByVisibleText(demux_ts);
	}
	
	// *********** ************** ******************** ** ****** ***Image Slate

	@FindBy(xpath = "//a[contains(text(), 'Image Slate')]")
	WebElement imageSlateInput;

	@FindBy(id = "gstaf_src_image_slate_image_location")
	WebElement imagepath;

	// *********** ************** ******************** ** ****** Raw input
	// Webelements

	@FindBy(id = "versa_src_raw_multi")
	WebElement Raw_input;

	@FindBy(id = "gstaf_src_raw_video_device_id")
	WebElement rawVideoDevice_name;

	@FindBy(id = "gstaf_src_raw_video_bmd_video_interface")
	WebElement rawVideoInterface;

	@FindBy(id = "gstaf_src_raw_audio_device_id")
	WebElement rawAudioDevice_name;

	// *********** ************** ******************** ** after Adding the input

	@FindBy(id = "add_pfmt_input")
	@CacheLookup
	WebElement add_input;

	@FindBy(id = "pfmt_input_secondary_block_1_1")
	WebElement secondaryInput;

	@FindBy(id = "input_next")
	@CacheLookup
	WebElement in_next;

	@FindBy(id = "process_next")
	@CacheLookup
	WebElement process_next;

	////////////////////////////// ************************* **** ***job name

	public void job_name(String job_name) {
		job_na.clear();
		job_na.sendKeys(job_name);
	}
	// *********** ************** ******************** ** ****** for 1 UDP INPUT

	public void udp_in1_multicast(String addr1, String port1, String inter) throws Exception {

		udp1c.click();
		Thread.sleep(1000);
		udp_source1.clear();
		udp_source1.sendKeys(addr1);
		udp_port1.sendKeys(port1);
		udp_inter.click();
		new Select(udp_inter).selectByVisibleText(inter);

	}

	// ****** **** ********* **** ********* **** ********* For Unicast udp

	public void udp_in1_unicast(String addr1, String port1) throws Exception {

		udp1c.click();
		Thread.sleep(1000);
		udp_source1.clear();
		udp_source1.sendKeys(addr1);
		udp_port1.sendKeys(port1);

	}

	// *********** ************** ******************** ** for MPTS UDP INPUT

	public void two_prog_udp(String addr1, String port1, String inter, String prog_name1, String prog_name2)
			throws InterruptedException {
		udp1c.click();
		Thread.sleep(1000);
		udp_source1.clear();
		udp_source1.sendKeys(addr1);
		udp_port1.sendKeys(port1);
		udp_inter.click();
		udp_inter.sendKeys(inter);
		sec_program1.clear();
		sec_program1.sendKeys(prog_name1);
		add_program.click();
		sec_program2.clear();
		sec_program2.sendKeys(prog_name2);
		add_track.click();
		new Select(track_type).selectByVisibleText("Video");
		add_track.click();
		new Select(track_type).selectByVisibleText("Audio");

	}

	// *********** ************** ******************** ** ******For RTMP INPUT

	public void rtmpInput(String rtmp_url, String stream_name) {
		rtmp_input.click();
		pull_en.click();
		rtmp_server_url_1.clear();
		rtmp_server_url_1.sendKeys(rtmp_url);
		stream_name1.sendKeys(stream_name);

	}

	// *********** ************** ******************** ****** For SRT INPUT

	public void srtInput(String srtclientip, String srtPort) {
		srt_input.click();
		srt_Clientinput.click();
		srt_input_ip.sendKeys(srtclientip);
		srt_port.sendKeys(srtPort);

	}

	// *********** ************** ******************** ****** For NDI INPUT

	public void ndiInput(String NdiSource) {
		Ndi_input.click();
		new Select(ndiSource).selectByVisibleText(NdiSource);
	}

	// *********** ************** ******************** ******** For RTSP INPUT

	public void rtspInput(String rtspUrl) {
		rtsp_input.click();
		rtsp_url.clear();
		rtsp_url.sendKeys(rtspUrl);

	}

	// *********** ************** *************** ********** **For HTTP INPUT

	public void httpInput(String httpURL) {
		http_input.click();
		http_url.clear();
		http_url.sendKeys(httpURL);

	}

	// *********** ************** ******************** For Test Pattern INPUT

	public void testPattern() {
		test_pattern_input.click();

	}

	// *********** ************** ************************** File INPUT
	public void file_input(String input_file_path) {
		file_input.click();
		file_path.sendKeys(input_file_path);

	}

	// *********** ************** ************************ Image slate Input
	public void ImageSlate(String input_Image_path) {
		imageSlateInput.click();
		imagepath.sendKeys(input_Image_path);

	}
	// *********** ************** ******************** ****** *Raw Input

	public void rawInput(String VideoDevice, String VideoInterFace, String AudioDevice) {
		Raw_input.click();
		new Select(rawVideoDevice_name).selectByVisibleText(VideoDevice);
		new Select(rawVideoInterface).selectByVisibleText(VideoInterFace);
		new Select(rawAudioDevice_name).selectByVisibleText(AudioDevice);
	}

	/////////////////////////// *************************** * Passthrough Tracks
	public void passthrough() {
		videopassthrough.click();
		audiopassthrough.click();
	}

	/////////////////////////// ****************************** Depacatizer
	/////////////////////////// Tracks

	public void decapt_Rtp(String depac) {
		new Select(depacatizer).selectByVisibleText(depac);
	}

	public void addInput() {
		add_input.click();
	}

	public void secondaryInput() {
		secondaryInput.click();
	}

	/////////////////////////// *************************** input next

	public void inp_next() {

		in_next.click();

	}

	////////////////////////// *************************** Process next
	public void process_next() {
		process_next.click();
	}

	/////////////////////////// ************************** Scte track

	public void cuetone(String metatrack, String metatype) {
		addTrack.click();
		new Select(trackType).selectByVisibleText(metatrack);
		new Select(metaTracktype).selectByVisibleText(metatype);

	}
	
	public void cuetoneSource(String cueSource) {
		new Select(cuetoneSource).selectByVisibleText(cueSource);
	}
	
	public void cuetoneSourceAPI(String API) {
		new Select(cuetoneType).selectByVisibleText(API);
	}
	
	public void cuetoneForTsFile(String metatrack, String metatype) {
		addTrackTS.click();
		new Select(trackType_Ts).selectByVisibleText(metatrack);
		new Select(metaTracktypeTS).selectByVisibleText(metatype);

	}

	public void addTrack() {
		addTrack.click();
	}

	
	
	
	public void cuetoneSourceTSFile(String cueSource) {
		new Select(cuetoneSourceTs).selectByVisibleText(cueSource);
	}


	

	public void cuetoneSourceAPITsFile(String API) {
		new Select(cuetoneTypeTs).selectByVisibleText(API);
	}
	
	public void periodic(String content_Dur, String Ad_dur) {
		pero_conDuration.sendKeys(content_Dur);
		pero_AdDuration.sendKeys(Ad_dur);
	}
	
	public void scteLineNum(String lineNum)
	{
		scteLine.sendKeys(lineNum);
	}

}
