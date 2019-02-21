package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmokeRTMPInUdpUbnicastjob extends BaseClassSmokeTest{
	
	@Test
	public void smokeRTMPInUdpUbnicastjob() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		InputVersa input =PageFactory.initElements(driver, InputVersa.class);
		input.job_name(config.SmokeVersaRTMPInUdpUbnicast());
	
		input.rtmpInput(config.rtmp_url(), config.rtmp_stream_name());
		input.addInput();
		input.inp_next();
		input.process_next();
		ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_NTSC_544());
		
		prof.profile_next();
		Thread.sleep(1000);
		OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
		out.udp_1_profile("udp_uni", output.udp_outUnicast_serverIp(), "9000", output.rate_control(), output.track_1_out(), output.track_2_out());
		out.create_out();
		
		out.add_job();
		
	}
	}


