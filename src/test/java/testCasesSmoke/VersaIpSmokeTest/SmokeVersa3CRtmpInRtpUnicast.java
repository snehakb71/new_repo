package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmokeVersa3CRtmpInRtpUnicast extends BaseClassSmokeTest {
	
	@Test
	public void smokeVersa3CRtmpInRtpUnicast() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		InputVersa input =PageFactory.initElements(driver, InputVersa.class);
		input.job_name("smokeVersa3CRtmpInRtpUnicast");
	
		input.rtmpInput(config.rtmp_url(), "rtmp_testcase3b");
		input.addInput();
		input.inp_next();
		input.process_next();
		ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_ntsc_224());
		
		prof.profile_next();
		Thread.sleep(1000);
		OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
		out.udp_1_profile(output.cluster_name(), output.udp_outUnicast_serverIp(), "7100", output.rate_control(), output.track_1_out(), output.track_2_out());
		out.rtp_pactizer(output.pactizer());
		out.create_out();
		
		out.add_job();
	}

}
