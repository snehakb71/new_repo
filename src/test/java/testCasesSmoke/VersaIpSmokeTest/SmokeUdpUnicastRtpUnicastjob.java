package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmokeUdpUnicastRtpUnicastjob extends BaseClassSmokeTest {
	
	@Test
	public void smokeUdpUnicastRtpUnicastjob() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		
		InputVersa inp = PageFactory.initElements(driver, InputVersa.class);
		inp.job_name(config.smokeUdpUnicastRtpUnicastjob());
		inp.udp_in1_unicast(config.udp1_input_ip2_unicast(), config.udp1_input_unicast_port1());
		
		inp.addInput();
		inp.inp_next();
		inp.process_next();
		
		ProfileVersa pro = PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_Bcast_PAL());
		pro.profile_next();
		
		Thread.sleep(1000);
		
		OutputVersa out = PageFactory.initElements(driver, OutputVersa.class);
		out.udp_1_profile(output.cluster_name(), output.udp_outUnicast_serverIp(), output.udp_out_profile2_port(), output.rate_control(), output.track_1_out(), output.track_2_out());
		
		out.rtp_pactizer(output.pactizer());
		out.create_out();
		out.add_job();
	}

}
