package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmokeUdpMulticastRtmpoutjob extends BaseClassSmokeTest{
	
	@Test
	public void smokeUdpMulticastRtmpoutjob() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		InputVersa input =PageFactory.initElements(driver, InputVersa.class);
		input.job_name(config.smokeVersaUdpMulticastRtmpoutjob());
	
		input.udp_in1_multicast(config.udp1_input_ip1_multicast(), config.udp_port(), config.udp_interface());
		input.addInput();
		input.inp_next();
		input.process_next();
		ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_hd_854());
		
		prof.profile_next();
		Thread.sleep(1000);
		OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
		out.rtmp_1_profile(output.rtmp_cluster_name(), output.rtmp_server_url(), output.rtmp_stream_name1());
		out.create_out();
		
		out.add_job();
		
	}
	}


