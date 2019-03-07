package testCasesSmoke.RawInputSmoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class SmkVrs25SwtrRawTestInHlsDashOut extends RawInputBase {
	
	@Test
	
	public void smkVrs25SwtrRawTestInHlsDAshOut() throws Exception
	{
		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();
		
		InputVersa inp= PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("smkVrs25SwtrRawTestInHlsDashOut");
		
		inp.rawMagWellInput(config.rawVideoDevice(), config.rawVideoInterfaceSdi(), config.rawAudiodevice());
		inp.addInput();
		inp.secondaryInput();
		inp.testPattern();
		inp.addInput();
		inp.inp_next();
		inp.process_next();
		
		ProfileVersa pro= PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_hd_640());
		
		
		pro.profile_select(profile.profile_ntsc_224());
		
		pro.profile_next();
		Thread.sleep(500);
		
		OutputVersa out2 = PageFactory.initElements(driver, OutputVersa.class);
		out2.streamer_out();
		out2.streamer_name("rawHls_switcher2");
		out2.streamer_protocol(output.hls_streamer_pro());
		out2.addstreamer();
		
		out2.next_output();
		out2.streamer_out();
		out2.streamer_name("rawDAsh_switcher2");
		out2.streamer_protocol(output.dash_streamer_pro());
		out2.addstreamer();
		out2.add_job();
	}

}
