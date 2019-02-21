package testCasesSmoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmokeRtpUnicastUdpunicastjob extends BaseClassSmokeTest{
	
	@Test
	public void smokeRtpUnicastUdpunicastjob() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		
		InputVersa inp = PageFactory.initElements(driver, InputVersa.class);
		inp.job_name(config.smokeVersaRtpUnicastUdpunicast());
		inp.udp_in1(config.udp1_input_ip2_unicast(), config.udp1_input_unicast_port2());
		
		
		inp.addInput();
		inp.inp_next();
		inp.process_next();
		
		ProfileVersa pro = PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_NTSC_544());
		pro.profile_next();
		
		Thread.sleep(1000);
		
		OutputVersa out = PageFactory.initElements(driver, OutputVersa.class);
		out.udp_1_profile(output.cluster_name(), output.udp_outUnicast_serverIp(), output.udp_out_profile3_port(), output.rate_control(), output.track_1_out(), output.track_2_out());
		
		
		out.create_out();
		out.add_job();
	}

	}


