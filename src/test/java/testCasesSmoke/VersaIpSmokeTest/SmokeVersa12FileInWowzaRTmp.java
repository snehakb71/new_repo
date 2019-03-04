package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmokeVersa12FileInWowzaRTmp extends BaseClassSmokeTest {

	@Test
	public void smokeVersa12FileInWowzaRTmp() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		InputVersa input =PageFactory.initElements(driver, InputVersa.class);
		input.job_name("smokeVersa12FileInWowzaRTmp");
	
		input.udp_in1_multicast(config.rtp_multicast_input(), config.udp_port(), config.udp_interface());
		input.addInput();
		input.inp_next();
		input.process_next();
		ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_hd_854());
		prof.profile_select(profile.profile_ntsc_224());
		
		prof.profile_select(profile.profile_pal_360());
		
		prof.profile_next();
		Thread.sleep(1000);
		OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
		out.rtmp_streamer();
		out.streamer_name("rtmp_stre");
		out.addstreamer();
		Thread.sleep(1000);
		out.next_output();
		out.rtsp_streamer();
		out.streamer_name("rtsp_streamer");
		out.addstreamer();
	
		out.add_job();
		
		
	}
	}
	
	
	

