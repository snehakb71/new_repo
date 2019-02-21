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

	// ********** **** *** UDP Input ***** ***** ***//

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

	/////////////////////////// ***************Passthrogh

	@FindBy(id = "track_passthrough_1_1")
	WebElement videopassthrough;

	@FindBy(id = "track_passthrough_1_2")
	WebElement audiopassthrough;

	/////////////////////////////// ************************metatrack

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

	// *** **** **** **** *** **** **** **** *** **** **** RTMP_input *****
	// ***** ***

	@FindBy(id = "versa_src_rtmp")
	WebElement rtmp_input;

	@FindBy(id = "express_deinterlace_tooltip")
	WebElement pull_en;

	@FindBy(id = "gstaf_src_rtmp_server_url")
	WebElement rtmp_server_url_1;

	@FindBy(id = "gstaf_src_rtmp_stream_name")
	WebElement stream_name1;

	/// **** *** *** *** **** **** **** *** **** **** **** SRT Input **********

	@FindBy(id = "versa_src_srt")
	WebElement srt_input;

	@FindBy(id = "gstaf_src_srt_port")
	WebElement srt_port;

	/// ********** ************** **************** ****** *** **** **** ****
	/// RTSP INPUT

	@FindBy(id = "versa_src_rtsp")
	WebElement rtsp_input;

	@FindBy(id = "gstaf_src_rtsp_url")
	WebElement rtsp_url;

	// *********** ************** ******************** ** HTTP INPUT

	@FindBy(id = "versa_src_http")
	WebElement http_input;

	@FindBy(id = "gstaf_src_http_url")
	WebElement http_url;

	// *********** ************** ******************** ** *** Test Pattern

	@FindBy(id = "versa_src_test_pattern")
	WebElement test_pattern_input;

	// *********** ************** ******************** ** ****************
	// file_input

	@FindBy(id = "versa_src_filestream")
	WebElement file_input;

	@FindBy(id = "gstaf_src_file_stream_file_location")
	WebElement file_path;

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

	////////////////////////////// *******************job name

	public void job_name(String job_name) {
		job_na.sendKeys(job_name);
	}
	// *********** ************** ******************** ** for 1 UDP INPUT

	public void udp_in1_multicast(String addr1, String port1, String inter) throws Exception {

		udp1c.click();
		Thread.sleep(1000);
		udp_source1.clear();
		udp_source1.sendKeys(addr1);
		udp_port1.sendKeys(port1);
		udp_inter.click();
		new Select(udp_inter).selectByVisibleText(inter);

	}
	
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

	// *********** ************** ******************** ** For RTMP INPUT

	public void rtmpInput(String rtmp_url, String stream_name) {
		rtmp_input.click();
		pull_en.click();
		rtmp_server_url_1.clear();
		rtmp_server_url_1.sendKeys(rtmp_url);
		stream_name1.sendKeys(stream_name);

	}

	// *********** ************** ******************** For SRT INPUT

	public void srtInput(String srtPort) {
		srt_input.click();
		srt_port.sendKeys(srtPort);

	}

	// *********** ************** ******************** ** For RTSP INPUT

	public void rtspInput(String rtspUrl) {
		rtsp_input.click();
		rtsp_url.clear();
		rtsp_url.sendKeys(rtspUrl);

	}

	// *********** ************** *************** ****For HTTP INPUT

	public void httpInput(String httpURL) {
		http_input.click();
		http_url.clear();
		http_url.sendKeys(httpURL);

	}

	// *********** ************** ******************** ForTest Pattern INPUT

	public void testPattern() {
		test_pattern_input.click();

	}

	/////////////////////////// *************************** Passthrough Tracks
	public void passthrough() {
		videopassthrough.click();
		audiopassthrough.click();
	}

	public void decapt_Rtp(String depac) {
		new Select(depacatizer).selectByVisibleText(depac);
	}

	public void addInput() {
		add_input.click();
	}

	public void secondaryInput() {
		secondaryInput.click();
	}

	public void inp_next() {

		in_next.click();

	}

	public void process_next() {
		process_next.click();
	}

	public void file_input(String input_file_path) {
		file_input.click();
		file_path.sendKeys(input_file_path);

	}

}
