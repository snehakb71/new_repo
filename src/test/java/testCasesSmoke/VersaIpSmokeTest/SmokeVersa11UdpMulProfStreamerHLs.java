package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmokeVersa11UdpMulProfStreamerHLs extends BaseClassSmokeTest {
	
	
	@Test
	public void smokeVersa11UdpMulProfStreamerHLs() throws Exception
	{
		
			Job_type type = PageFactory.initElements(driver, Job_type.class);
			type.versa_job();
			
			InputVersa input =PageFactory.initElements(driver, InputVersa.class);
			input.job_name("smokeVersa11UdpMulProfStreamerHLs");
		
			input.udp_in1_multicast(config.rtp_multicast_input(), config.udp_port(), config.udp_interface());
			input.addInput();
			input.inp_next();
			input.process_next();
			ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
			prof.profile_select(profile.profile_NTSC_360());
			prof.profile_select(profile.profile_hd_640());
			
			prof.profile_select(profile.profile_pal_720());
			
			prof.profile_next();
			Thread.sleep(1000);
			OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
			out.streamer_out();
			out.streamer_name("multistreamer");
			out.streamer_protocol(output.hls_streamer_pro());
			out.streamer_protocol(output.mss_streamer_pro());
			out.streamer_protocol(output.dash_streamer_pro());
			out.addstreamer();
			Thread.sleep(1000);
			out.next_output();
			out.streamer_out();
			
			out.streamer_name("dash_hds");
			out.streamer_protocol(output.dash_streamer_pro());
			out.addstreamer();
			
			
			out.add_job();
			
			
		}
	}


