package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class C1SmokeVersa3aUdpMulticastRtpUnicastjob extends BaseClassSmokeTest {
	
	@Test
	public void smokeVersa3aUdpMulticastRtpUnicastjob() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		InputVersa input =PageFactory.initElements(driver, InputVersa.class);
		input.job_name("SmokeVersa3aUdpMulticastRtpUnicastjob");
	
		input.udp_in1_multicast(config.udp1_input_ip1_multicast(), config.udp_port(), config.udp_interface());
		input.addInput();
		input.inp_next();
		input.process_next();
		ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_Bcast_PAL());
		
		prof.profile_next();
		Thread.sleep(1000);
		OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
		out.udp_1_profile(output.cluster_name(), output.udp_outUnicast_serverIp(), "7000", output.Cbr_mode(), output.track_1_out(), output.track_2_out());
		out.rtp_pactizer(output.pactizer());
		out.CbrBitarteValue();
		out.create_out();
		
		out.add_job();
	}

}
