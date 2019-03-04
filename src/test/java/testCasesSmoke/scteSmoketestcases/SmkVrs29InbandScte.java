package testCasesSmoke.scteSmoketestcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class SmkVrs29InbandScte extends BaseClassSmokeTest {

	@Test
	public void smkVrs29InbandScte() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		InputVersa input =PageFactory.initElements(driver, InputVersa.class);
		input.job_name("smkVrs29InbandScte");
	
		input.udp_in1_multicast(config.udp1_input_ip1_multicast(), config.udp_port(), config.udp_interface());
		input.cuetone(config.Metadata(), config.cuetone());
		input.cuetoneSource(config.scteInband());
		
		input.addInput();
		input.inp_next();
		input.process_next();
		ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_NTSC_720());
		prof.MetaTrcakScte(profile.metaTrack());
		
		prof.profile_next();
		Thread.sleep(500);
		OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
		out.streamer_out();
		out.streamer_name("inbandscte");
		out.streamer_protocol(output.hls_streamer_pro());
		Thread.sleep(200);
		out.streamer_muxOverhead();
		out.streamer_CueToneManifest();
		out.streamer_CueToneSplice();
		Thread.sleep(200);
		out.streamer_CueToneMeta();
		
		out.addstreamer();
		
		out.add_job();
	}
	

}
