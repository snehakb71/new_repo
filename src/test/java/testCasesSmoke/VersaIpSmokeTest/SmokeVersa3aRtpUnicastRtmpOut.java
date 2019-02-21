package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmokeVersa3aRtpUnicastRtmpOut extends BaseClassSmokeTest{
	
	@Test
	public void smokeVersa3aRtpUnicastRtmpOut() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		InputVersa input =PageFactory.initElements(driver, InputVersa.class);
		input.job_name("smokeVersa10RtpUnicastRtmpOut");
	
		input.udp_in1_unicast(config.udp1_input_ip2_unicast(), "7000");
		input.decapt_Rtp(config.depacketizer());
		input.addInput();
		input.inp_next();
		input.process_next();
		ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_hd_424());
		
		prof.profile_next();
		Thread.sleep(1000);
		OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
		out.rtmp_1_profile(output.rtmp_cluster_name(), "rtmp_testcase3a", output.rtmp_server_url());
		out.create_out();
		
		out.add_job();
	}

}
