package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OutputVersa {
WebDriver driver;
	
	public OutputVersa(WebDriver driver)
	{
		this.driver= driver;
	}
	
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * UDP OUTPUT * * * * * * * * * * *
	
	@FindBy(id="sink_udp_ip")
	@CacheLookup
	WebElement output_type;
	
	@FindBy(id="cluster_name")
	@CacheLookup
	WebElement cluster_name;
	

	@FindBy(id="gstaf_sink_udp_ip_1")
	@CacheLookup
	WebElement udp_out_add1;
	
	@FindBy(id="gstaf_sink_udp_port_1")
	@CacheLookup
	WebElement udp_out_port1;
	
	@FindBy(id="ts_rc_mode_1")
	@CacheLookup
	WebElement rate_control1;
	
	@FindBy(xpath="//a[@onclick='show_mpegts_program_track_list(1,1)']")
	@CacheLookup
	WebElement addtrack1;
	
	@FindBy(id="mpeg_ts_tracks_1_1")
	@CacheLookup
	WebElement track1;
	
	@FindBy(id="gstaf_sink_udp_ip_2")
	@CacheLookup
	WebElement udp_add2;
	
	@FindBy(id="gstaf_sink_udp_port_2")
	@CacheLookup
	WebElement udp_out_port2;
	
	@FindBy(id="ts_rc_mode_2")
	@CacheLookup
	WebElement rate_control2;
	
	@FindBy(xpath="//a[@onclick='show_mpegts_program_track_list(1,2)']")
	@CacheLookup
	WebElement addtrack2;
	
	@FindBy(id="mpeg_ts_tracks_2_1")
	@CacheLookup
	WebElement track2;
	
	@FindBy(id="gstaf_sink_udp_ip_3")
	@CacheLookup
	WebElement udp_add3;
	
	@FindBy(id="gstaf_sink_udp_port_3")
	@CacheLookup
	WebElement udp_out_port3;
	
	@FindBy(id="ts_rc_mode_3")
	@CacheLookup
	WebElement rate_control3;
	
	
	@FindBy(xpath="//a[@onclick='show_mpegts_program_track_list(1,3)']")
	@CacheLookup
	WebElement addtrack3;
	
	@FindBy(id="mpeg_ts_tracks_3_1")
	@CacheLookup
	WebElement track3;
	
	@FindBy(id="gstaf_format_packetizer")
	WebElement pacatizer;
	
	//* * * * * * * * * * *   * * * * * * * * *        rtmp Output elements * * * * * * * * * * *
	@FindBy(xpath="//a[contains(text(), ' RTMP(Push) ')]")
	@CacheLookup
	WebElement rtmp_out1;
	
	@FindBy(id="cluster_name")
	@CacheLookup
	WebElement cluster_na;
	
	@FindBy(id="gstaf_sink_rtmp_stream_name_1")
	@CacheLookup
	WebElement rtmp1;
	
	@FindBy(id="gstaf_sink_rtmp_stream_name_2")
	@CacheLookup
	WebElement rtmp2;
	
	@FindBy(id="gstaf_sink_rtmp_stream_name_3")
	@CacheLookup
	WebElement rtmp3;
	
	@FindBy(id="gstaf_sink_rtmp_server_url")
	@CacheLookup
	WebElement rtmp_serverurl;
	
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * MP4 output * * * * * * * * * * *
	
	@FindBy(id="sink_file_stream_archive")
	@CacheLookup
	WebElement file_out;
	
	@FindBy(id="gstaf_sink_file_location_1")
	@CacheLookup
	WebElement file_path1;
	
	@FindBy(id="gstaf_sink_file_location_2")
	@CacheLookup
	WebElement file_path2;
	
	@FindBy(id="gstaf_sink_file_location_3")
	@CacheLookup
	WebElement file_path3;
	
	@FindBy(id="gstaf_format_mux")
	@CacheLookup
	WebElement muxer_type;

	@FindBy(id="file_sink_slicing")
	@CacheLookup
	WebElement type_of_slicing;
	
	@FindBy(id="file_sink_max_files")
    @CacheLookup
    WebElement max_file;
	
	@FindBy(id="file_sink_slice_duration")
	@CacheLookup
	WebElement time_slice_dur;
	
	@FindBy(id="file_sink_max_slice_size")
	@CacheLookup
	WebElement slice_size;
	
	@FindBy(id="file_sink_slicing_clock")
	@CacheLookup
	WebElement slice_clock;
	
	@FindBy(id="file_sink_name_convention")
	@CacheLookup
	WebElement timestamp;
	
	
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * streamer OUTPUT * * * * * * * * * * *
	
	@FindBy(id="show_streamer")
	WebElement hlsDashMssHds;
	
	@FindBy(id="streamer_name")
	WebElement streamer_name;
	
	@FindBy(id="show_streamer_protocol")
	WebElement protol_sel;
	
	@FindBy(id="streamer_protocol_type")
	WebElement protocol_type;
	
	//* * * * * * * * * * * output cration * * * * * * * * * * *
	
	
	@FindBy(id="create_output")
	@CacheLookup
    WebElement create_out;
	
	@FindBy(id="job_create")
	@CacheLookup
	WebElement add_job;
	
	@FindBy(xpath="//a[contains(text(), 'Add Output Group')]")
	WebElement next_out;
	
	@FindBy(xpath="//a[contains(text(), 'Add Streamer')]")
	WebElement create_streamer;
	
	//* * * * * * * single profile UDP output Creation * * * * * * * * * *
	
	public void udp_1_profile(String clust_name, String add, String port, String rc_mode1, String trc1, String trc2)
	{
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
	
	
	
	//* * * * * * * Multiple(3) profile UDP output Creation * * * * * * * * * *
	public void udp1_out(String clust_name, String udpo_ad1, String udpo_port1,String rc_mode1, String tr1, String tr2)
	{
		
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
	
	public void udp2_out(String udpo_ad2, String udpo_port2, String rc_mode2, String tr1, String tr2)
	{
		udp_add2.clear();
		udp_add2.sendKeys(udpo_ad2);
		udp_out_port2.sendKeys(udpo_port2);
		new Select(rate_control2).selectByVisibleText(rc_mode2);
		addtrack2.click();
		track2.sendKeys(tr1);
		addtrack2.click();
		track2.sendKeys(tr2);
	}
	
	public void udp3_out(String udpo_add3, String udpo_port3, String rc_mode3, String tr1, String tr2)
	{
		//System.out.println("snehaa");
		udp_add3.clear();
		udp_add3.sendKeys(udpo_add3);
		udp_out_port3.sendKeys(udpo_port3);
		new Select(rate_control3).selectByVisibleText(rc_mode3);
		addtrack3.click();
		track3.sendKeys(tr1);
		addtrack3.click();
		track3.sendKeys(tr2);
	}
	
	
	//* * * * * * * single profile rtmp output Creation * * * * * * * * * *
	
	public void rtmp_1_profile(String clust_name, String streamname1, String server_url )
	{
		rtmp_out1.click();
		cluster_name.sendKeys(clust_name);
		rtmp1.sendKeys(streamname1);
		rtmp_serverurl.clear();
		rtmp_serverurl.sendKeys(server_url);
		
	}
	
	//* * * * * * * Multiple(3) profile RTMP output Creation * * * * * * * * * *
	public void rtmp_3_multiprofile(String cluster_name, String streamname1, String streamname2, String streamname3, String server_url )
	{
		rtmp_out1.click();
		cluster_na.sendKeys(cluster_name);
		rtmp1.sendKeys(streamname1);
		rtmp2.sendKeys(streamname2);
		rtmp3.sendKeys(streamname3);
		rtmp_serverurl.sendKeys(server_url);
		
	}
	
	//* * * * * * * single profile MP4 output Creation * * * * * * * * * *
	
	public void mp4_1_pro(String clus_name, String file_path)
	{
		file_out.click();
		cluster_name.sendKeys(clus_name);
		file_path1.clear();
		file_path1.sendKeys(file_path);
		
	}
	
	public void mp4_multi_pro(String clus_name, String file_path, String file_pa2, String file_pa3)
	{
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
	
	
	public void streamer_out()
	{
		hlsDashMssHds.click();
	}
	
	public void streamer_name(String stream_name)
	{
		streamer_name.sendKeys(stream_name);
	}
	
	public void streamer_protocol(String streamer_protocal)
	{
		protol_sel.click();
		new Select(protocol_type).selectByVisibleText(streamer_protocal);
	}
	
	public void addstreamer()
	{
	create_streamer.click();
	}
	
	public void next_output()
	{
		next_out.click();
	}
	
	
	public void rtp_pactizer(String pacti)
	{
		new Select(pacatizer).selectByVisibleText(pacti);
	}
	
	public void create_out()
	{
		create_out.click();
	}
	public void add_job()
	{
		add_job.click();
	}
	

}
