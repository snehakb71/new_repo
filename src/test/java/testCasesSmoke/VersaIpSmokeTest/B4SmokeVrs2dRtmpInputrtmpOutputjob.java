package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class B4SmokeVrs2dRtmpInputrtmpOutputjob extends BaseClassSmokeTest{
	
	@Test
	public void smokeVrs2dRtmpInputrtmpOutputjob() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		//
		InputVersa input =PageFactory.initElements(driver, InputVersa.class);
		input.job_name("SmokeVrs2dRtmpInputrtmpOutputjob");
	
		input.rtmpInput(config.rtmp_url(), "rtmp2c");
		
		input.addInput();
		input.inp_next();
		input.process_next();
		ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_NTSC_360());
		
		prof.profile_next();
		Thread.sleep(1000);
		OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
		out.rtmp_1_profile(output.rtmp_cluster_name(), "rtmp2d", output.rtmp_server_url());
		out.create_out();
		
		out.add_job();
	}

}
