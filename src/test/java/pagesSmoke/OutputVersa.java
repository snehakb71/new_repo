package pagesSmoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OutputVersa {
	WebDriver driver;

	public OutputVersa(WebDriver driver) {
		this.driver = driver;

	}

	// * * * * * * * * * * * * * * * * * * * * * * * * * UDP OUTPUT * * * * * * * * * * *

	@FindBy(id = "sink_udp_ip")
	@CacheLookup
	WebElement output_type;

	@FindBy(id = "cluster_name")
	@CacheLookup
	WebElement cluster_name;

	@FindBy(id = "gstaf_sink_udp_ip_1")
	@CacheLookup
	WebElement udp_out_add1;

	@FindBy(id = "gstaf_sink_udp_port_1")
	@CacheLookup
	WebElement udp_out_port1;

	@FindBy(id = "ts_rc_mode_1")
	@CacheLookup
	WebElement rate_control1;

	@FindBy(xpath = "//a[@onclick='show_mpegts_program_track_list(1,1)']")
	@CacheLookup
	WebElement addtrack1;

	@FindBy(id = "mpeg_ts_tracks_1_1")
	@CacheLookup
	WebElement track1;

	@FindBy(id = "gstaf_sink_udp_ip_2")
	@CacheLookup
	WebElement udp_add2;

	@FindBy(id = "gstaf_sink_udp_port_2")
	@CacheLookup
	WebElement udp_out_port2;

	@FindBy(id = "ts_rc_mode_2")
	@CacheLookup
	WebElement rate_control2;

	@FindBy(xpath = "//a[@onclick='show_mpegts_program_track_list(1,2)']")
	@CacheLookup
	WebElement addtrack2;

	@FindBy(id = "mpeg_ts_tracks_2_1")
	@CacheLookup
	WebElement track2;

	@FindBy(id = "gstaf_sink_udp_ip_3")
	@CacheLookup
	WebElement udp_add3;

	@FindBy(id = "gstaf_sink_udp_port_3")
	@CacheLookup
	WebElement udp_out_port3;

	@FindBy(id = "ts_rc_mode_3")
	@CacheLookup
	WebElement rate_control3;

	@FindBy(xpath = "//a[@onclick='show_mpegts_program_track_list(1,3)']")
	@CacheLookup
	WebElement addtrack3;

	@FindBy(id = "mpeg_ts_tracks_3_1")
	@CacheLookup
	WebElement track3;

	@FindBy(id = "gstaf_format_packetizer")
	WebElement pacatizer;

	@FindBy(id = "ts_scte_1_1")
	WebElement CueToneMode;
	
	@FindBy(id = "muxer_ts_bitrate_val_1")
	WebElement muxer_bitrateGetValue;
	
	@FindBy(id = "muxer_ts_bitrate_1")
	WebElement muxer_bitrateFiled;
	
	@FindBy(id = "gstaf_format_mux_type")
	WebElement compliance;
	
	
	
	// * * * * * * * * * * * * * * * * * * * * * * * * * rtmp Output elements *
	// * * * * *

	@FindBy(xpath = "//a[contains(text(), ' RTMP(Push) ')]")
	@CacheLookup
	WebElement rtmp_out1;

	@FindBy(id = "cluster_name")
	@CacheLookup
	WebElement cluster_na;

	@FindBy(id = "gstaf_sink_rtmp_stream_name_1")
	@CacheLookup
	WebElement rtmp1;

	@FindBy(id = "gstaf_sink_rtmp_stream_name_2")
	@CacheLookup
	WebElement rtmp2;

	@FindBy(id = "gstaf_sink_rtmp_stream_name_3")
	@CacheLookup
	WebElement rtmp3;

	@FindBy(id = "gstaf_sink_rtmp_server_url")
	@CacheLookup
	WebElement rtmp_serverurl;

	// * * * * * * * * * * * * * * * * * * * * * * ****** MP4 output Elements *

	@FindBy(id = "sink_file_stream_archive")
	@CacheLookup
	WebElement file_out;

	@FindBy(id = "gstaf_sink_file_location_1")
	@CacheLookup
	WebElement file_path1;

	@FindBy(id = "gstaf_sink_file_location_2")
	@CacheLookup
	WebElement file_path2;

	@FindBy(id = "gstaf_sink_file_location_3")
	@CacheLookup
	WebElement file_path3;

	@FindBy(id = "gstaf_format_mux")
	@CacheLookup
	WebElement muxer_type;

	@FindBy(id = "file_sink_slicing")
	@CacheLookup
	WebElement type_of_slicing;

	@FindBy(id = "file_sink_max_files")
	@CacheLookup
	WebElement max_file;

	@FindBy(id = "file_sink_slice_duration")
	@CacheLookup
	WebElement time_slice_dur;

	@FindBy(id = "file_sink_max_slice_size")
	@CacheLookup
	WebElement slice_size;

	@FindBy(id = "file_sink_slicing_clock")
	@CacheLookup
	WebElement slice_clock;

	@FindBy(id = "file_sink_name_convention")
	@CacheLookup
	WebElement timestamp;

	// * * * * * * * * * * * * * * * * * * * * * * * * * * SRt OUTPUT * * * * *
	// * * * * * *

	@FindBy(id = "sink_srt_ip")
	WebElement srt_out;

	@FindBy(id = "gstaf_sink_srt_host_1")
	WebElement srt_ip;

	
	
	@FindBy(id = "gstaf_sink_srt_server_1")
	WebElement srt_server;
	
	@FindBy(id = "gstaf_sink_srt_port_1")
	WebElement srt_port;

	// * * * * * * * * * * * * * * * * * * * * * * * * * * NDI OUTPUT * * * * *
	// * * * * * *
	@FindBy(id = "sink_ndi_ip")
	WebElement NDi_out;

	@FindBy(id = "gstaf_sink_raw_video_ndi_1")
	WebElement NdiVideo_source;

	@FindBy(id = "gstaf_sink_raw_audio_ndi_1")
	WebElement NdiAudio_source;

	// * * * * * * * * * * * * * * * * * * * * * * * * * * Raw OUTPUT * * * * *
	// * * * * * *
	@FindBy(id = "sink_hdmi_sdi_device")
	WebElement raw_out;

	@FindBy(id = "gstaf_sink_raw_video_bmd_device_1")
	WebElement RawVideo_source;

	@FindBy(id = "gstaf_sink_raw_audio_bmd_device_1")
	WebElement RawAudio_source;
	
	
	@FindBy(id = "sink_scte_line_1")
	WebElement ScteLine;
	
	
	@FindBy(id = "sink_scte_104_1")
	WebElement ScteLineNumber;
	
	
	@FindBy(id = "output_track_1_CUE_1")
	WebElement scteTrack;
	public void scteLine(String LineNo)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ScteLine).click().build().perform();
		ScteLineNumber.clear();
		ScteLineNumber.sendKeys(LineNo);
		scteTrack.click();
	}

	// * * * * * * * * * * * * * * * * * * * * * * * * * * streamer OUTPUT * * *
	// * * * * * * * *

	@FindBy(id = "show_streamer")
	WebElement hlsDashMssHds;

	@FindBy(id = "streamer_name")
	WebElement streamer_name;

	@FindBy(id = "show_streamer_protocol")
	WebElement protol_sel;

	@FindBy(id = "streamer_protocol_type")
	WebElement protocol_type;

	@FindBy(id = "show_streamer_rtmp")
	WebElement rtmp_streamer;

	@FindBy(id = "show_streamer_rtsp")
	WebElement rtsp_streamer;

	@FindBy(id = "cuetone_in_manifest_1")
	WebElement HlsCuetoneManifest;

	@FindBy(id = "cuetone_splice_info_1")
	WebElement HlsCuetoneSplice;

	@FindBy(id = "cuetone_as_timed_meta_1")
	WebElement hlsCueTimesMeta;

	@FindBy(id = "add_mux_overhead_1")
	WebElement HlsMuxOverHead;

	// * * * * * * * * * * * output cration * * * * * * * * * * *

	@FindBy(id = "create_output")
	@CacheLookup
	WebElement create_out;

	@FindBy(id = "job_create")
	@CacheLookup
	WebElement add_job;

	@FindBy(xpath = "//a[contains(text(), 'Add Output Group')]")
	WebElement next_out;

	@FindBy(xpath = "//a[contains(text(), 'Add Streamer')]")
	WebElement create_streamer;
	
	
	

	

	// * * * * * * * single profile UDP output Creation * * * * * * * * * *

	public void udp_1_profile(String clust_name, String add, String port, String rc_mode1, String trc1, String trc2) {
		output_type.click();
		cluster_name.sendKeys(clust_name);
		udp_out_add1.clear();
		udp_out_add1.sendKeys(add);
		udp_out_port1.sendKeys(port);
		new Select(rate_control1).selectByVisibleText(rc_mode1);
		addtrack1.click();
		track1.sendKeys(trc1);
		addtrack1.click();
		track1.sendKeys(trc2);

	}
	
	public void CbrBitarteValue()
	{
		String sn = muxer_bitrateGetValue.getText();
		//String sn=driver.findElement(By.id("muxer_ts_bitrate_val_1")).getText();
		System.out.println(sn);
		muxer_bitrateFiled.sendKeys(sn);
	}
	
	public void complience(String complience)
	{
		new Select(compliance).selectByVisibleText(complience);
	}

	///////////////////////////// scte UDP output

	public void udp_1_profileSCTE(String clust_name, String add, String port, String rc_mode1, String cueMode,
			String trc1, String trc2, String metatrack) {
		output_type.click();
		cluster_name.sendKeys(clust_name);
		udp_out_add1.clear();
		udp_out_add1.sendKeys(add);
		udp_out_port1.sendKeys(port);
		new Select(rate_control1).selectByVisibleText(rc_mode1);
		new Select(CueToneMode).selectByVisibleText(cueMode);
		addtrack1.click();
		track1.sendKeys(trc1);
		addtrack1.click();
		track1.sendKeys(trc2);
		addtrack1.click();
		track1.sendKeys(metatrack);

	}

	// * * * * * * * Multiple(3) profile UDP output Creation * * * * * * * * * *
	public void udp1_out(String clust_name, String udpo_ad1, String udpo_port1, String rc_mode1, String tr1,
			String tr2) {

		output_type.click();
		cluster_name.sendKeys(clust_name);
		udp_out_add1.clear();
		udp_out_add1.sendKeys(udpo_ad1);

		udp_out_port1.sendKeys(udpo_port1);
		new Select(rate_control1).selectByVisibleText(rc_mode1);
		addtrack1.click();
		track1.sendKeys(tr1);
		addtrack1.click();
		track1.sendKeys(tr2);

	}

	public void udp2_out(String udpo_ad2, String udpo_port2, String rc_mode2, String tr1, String tr2) {
		udp_add2.clear();
		udp_add2.sendKeys(udpo_ad2);
		udp_out_port2.sendKeys(udpo_port2);
		new Select(rate_control2).selectByVisibleText(rc_mode2);
		addtrack2.click();
		track2.sendKeys(tr1);
		addtrack2.click();
		track2.sendKeys(tr2);
	}

	public void udp3_out(String udpo_add3, String udpo_port3, String rc_mode3, String tr1, String tr2) {
		// System.out.println("snehaa");
		udp_add3.clear();
		udp_add3.sendKeys(udpo_add3);
		udp_out_port3.sendKeys(udpo_port3);
		new Select(rate_control3).selectByVisibleText(rc_mode3);
		addtrack3.click();
		track3.sendKeys(tr1);
		addtrack3.click();
		track3.sendKeys(tr2);
	}

	// * * * * * * * single profile rtmp output Creation * * * * * * * * * *

	public void rtmp_1_profile(String clust_name, String streamname1, String server_url) throws Exception {
		rtmp_out1.click();
		Thread.sleep(1000);
		cluster_name.sendKeys(clust_name);
		rtmp1.sendKeys(streamname1);
		rtmp_serverurl.clear();
		rtmp_serverurl.sendKeys(server_url);

	}

	// * * * * * * * Multiple(3) profile RTMP output Creation * * * * * * * * *
	// *
	public void rtmp_3_multiprofile(String cluster_name, String streamname1, String streamname2, String streamname3,
			String server_url) {
		rtmp_out1.click();
		cluster_na.sendKeys(cluster_name);
		rtmp1.sendKeys(streamname1);
		rtmp2.sendKeys(streamname2);
		rtmp3.sendKeys(streamname3);
		rtmp_serverurl.sendKeys(server_url);

	}

	//////////////* * * * * * ** * * * * * ** * * * * * ** * * Ndi Output

	public void ndiOut(String clust_name, String videosource, String AudioSorce) {
		NDi_out.click();
		cluster_name.sendKeys(clust_name);
		NdiVideo_source.sendKeys(videosource);
		NdiAudio_source.sendKeys(AudioSorce);
	}
	
//////////////* * * * * * ** * * * * * ** * * * * * ** * * Srt output
	
	public void srt_out(String clust_name, String port, String rc_mode1, String trc1, String trc2) throws Exception {
		srt_out.click();
		cluster_name.sendKeys(clust_name);
		
		
		Actions act = new Actions(driver);
		act.moveToElement(srt_server).click().build().perform();  
		Thread.sleep(1000);
		//srt_ip.clear();
		//srt_ip.sendKeys(add);
		srt_port.sendKeys(port);
		new Select(rate_control1).selectByVisibleText(rc_mode1);
		addtrack1.click();
		track1.sendKeys(trc1);
		addtrack1.click();
		track1.sendKeys(trc2);
	}
	/////////////////////*****************************Raw OUtput
	
	public void rawOutput(String clust_name, String videoSorce, String AudioSource)
	{
		raw_out.click();
		cluster_name.sendKeys(clust_name);
		new Select(RawVideo_source).selectByVisibleText(videoSorce);
		new Select(RawAudio_source).selectByVisibleText(AudioSource);
		
	}
	
	

	// * * * * * * * single profile MP4 output Creation * * * * * * * * * *

	public void file_out(String clus_name, String file_path) {
		file_out.click();
		cluster_name.sendKeys(clus_name);
		file_path1.clear();
		file_path1.sendKeys(file_path);

	}

	public void slicing_type(String slice_type) {
		new Select(type_of_slicing).selectByVisibleText(slice_type);
	}

	// * * * * * * *Muxer output Creation * * * * * * * * * *
	public void fileMuxerType(String muxer) {
		new Select(muxer_type).selectByVisibleText(muxer);
	}

	// ************************** Ts muxer ****************

	public void TsMuxer(String muxer, String rc_mode, String trc1, String trc2) {
		new Select(muxer_type).selectByVisibleText(muxer);
		new Select(rate_control1).selectByVisibleText(rc_mode);
		addtrack1.click();
		track1.sendKeys(trc1);
		addtrack1.click();
		track1.sendKeys(trc2);
	}

	public void mp4_multi_pro(String clus_name, String file_path, String file_pa2, String file_pa3) {
		file_out.click();
		cluster_name.sendKeys(clus_name);
		file_path1.clear();
		file_path1.sendKeys(file_path);
		file_path2.clear();
		file_path2.sendKeys(file_pa2);
		file_path3.clear();
		file_path3.sendKeys(file_pa3);

	}

	///////////////////////////// streamer out

	public void streamer_out() {
		hlsDashMssHds.click();
	}

	public void rtmp_streamer() {
		rtmp_streamer.click();
	}

	public void rtsp_streamer() {
		rtsp_streamer.click();
	}

	public void streamer_name(String stream_name) {
		streamer_name.sendKeys(stream_name);
	}

	public void streamer_protocol(String streamer_protocal) {
		protol_sel.click();
		new Select(protocol_type).selectByVisibleText(streamer_protocal);
	}

	public void streamer_CueToneManifest() {
		Actions act = new Actions(driver);
		act.moveToElement(HlsCuetoneManifest).click().build().perform();

	}

	public void streamer_CueToneSplice() {
		Actions act = new Actions(driver);
		act.moveToElement(HlsCuetoneSplice).click().build().perform();
		// HlsCuetoneSplice.click();

	}

	public void streamer_CueToneMeta() {
		Actions act = new Actions(driver);
		act.moveToElement(hlsCueTimesMeta).click().build().perform();
		// hlsCueTimesMeta.click();

	}

	public void streamer_muxOverhead() {
		Actions act = new Actions(driver);
		act.moveToElement(HlsMuxOverHead).click().build().perform();
		// hlsCueTimesMeta.click();

	}

	public void addstreamer() {
		create_streamer.click();
	}

	public void next_output() {
		next_out.click();
	}

	public void rtp_pactizer(String pacti) {
		new Select(pacatizer).selectByVisibleText(pacti);
	}

	public void create_out() {
		create_out.click();
	}

	public void add_job() {
		add_job.click();
	}

}
