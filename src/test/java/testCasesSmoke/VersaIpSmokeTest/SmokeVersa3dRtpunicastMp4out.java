package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmokeVersa3dRtpunicastMp4out extends BaseClassSmokeTest{
	
	@Test
	public void smokeVersa3dRtpunicastMp4out() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		InputVersa input =PageFactory.initElements(driver, InputVersa.class);
		input.job_name("smokeVersa3dRtpunicastMp4out");
	
		input.udp_in1(config.udp1_input_ip2_unicast(), "7100");
		input.decapt_Rtp(config.depacketizer());
		input.addInput();
		input.inp_next();
		input.process_next();
		ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_hd_640());
		
		prof.profile_next();
		Thread.sleep(1000);
		OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
		out.mp4_1_pro(output.mp4_cluster_name(), "/storage/device/sneha/testcase3d.mp4");
		out.create_out();
		
		out.add_job();
	}

}
