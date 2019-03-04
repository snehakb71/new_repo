package testCasesSmoke.RawInputSmoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class SmkVrs4aBmdInMultiOut extends BaseClassSmokeTest{
	
	@Test
	public void smkVrs4aBmdInMultiOut() throws Exception
	{
		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();
		
		InputVersa inp= PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("smkVrs4aBmdInMultiOut");
		
		inp.rawInput(config.rawVideoDevice(), config.rawVideoInterfaceSdi(), config.rawAudiodevice());
		inp.addInput();
		inp.inp_next();
		inp.process_next();
		
		ProfileVersa pro= PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_hd_640());
		
		pro.profile_next();
		Thread.sleep(500);
		OutputVersa out = PageFactory.initElements(driver, OutputVersa.class);
		out.udp_1_profile(output.cluster_name(), output.udp_outUnicast_serverIp(), "7200", output.Cbr_mode(), output.track_1_out(), output.track_2_out());
		out.CbrBitarteValue();
		out.create_out();
		out.next_output();
		
		OutputVersa out1 = PageFactory.initElements(driver, OutputVersa.class);
		out1.rtmp_1_profile(output.rtmp_cluster_name(), "rtmpRaw", output.rtmp_server_url());
		out1.create_out();
		out1.next_output();
		
		OutputVersa out2 = PageFactory.initElements(driver, OutputVersa.class);
		out2.streamer_out();
		out2.streamer_name("rawHls");
		out2.streamer_protocol(output.hls_streamer_pro());
		out2.addstreamer();
		out2.next_output();
		
		OutputVersa out3 = PageFactory.initElements(driver, OutputVersa.class);
		out3.streamer_out();
		out3.streamer_name("rawdash");
		out3.streamer_protocol(output.dash_streamer_pro());
		out3.addstreamer();
		
		out2.add_job();
		
	}

}
