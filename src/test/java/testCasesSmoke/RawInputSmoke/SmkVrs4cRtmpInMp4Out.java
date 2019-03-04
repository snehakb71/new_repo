package testCasesSmoke.RawInputSmoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class SmkVrs4cRtmpInMp4Out extends BaseClassSmokeTest {
	
	@Test
	
	public void smkVrs4cRtmpInMp4Out() throws Exception
	{
		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();
		
		InputVersa inp= PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("smkVrs4cRtmpInMp4Out");
		
		inp.rtmpInput(config.rtmp_url(), "rtmpRaw");
		inp.addInput();
		inp.inp_next();
		inp.process_next();
		
		ProfileVersa pro= PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_NTSC_360());
		
		pro.profile_next();
		Thread.sleep(500);
		
		OutputVersa out1 = PageFactory.initElements(driver, OutputVersa.class);
		out1.file_out(output.mp4_cluster_name(), "/storage/device/sneha/output/rawRtmpFileTestCase4b_mp4.mp4");
		out1.create_out();
		out1.add_job();
	}

}
