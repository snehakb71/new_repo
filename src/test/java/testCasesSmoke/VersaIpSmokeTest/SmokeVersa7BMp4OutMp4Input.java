package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmokeVersa7BMp4OutMp4Input extends BaseClassSmokeTest
{
	
	@Test
	public void smokeVersa7BMp4OutMp4Input() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		InputVersa input =PageFactory.initElements(driver, InputVersa.class);
		input.job_name(config.smokeVersaUdpMulticastUdpUnicast());
	
		input.file_input("/storage/device/sneha/mp4TestCase_7A.mp4");
		input.addInput();
		input.inp_next();
		input.process_next();
		ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_pal_360());
		
		prof.profile_next();
		Thread.sleep(1000);
		OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
		out.mp4_1_pro(output.mp4_cluster_name(), "/storage/device/sneha/mp4TestCase_7B.mp4");
		out.create_out();
		
		out.add_job();
	}

}
