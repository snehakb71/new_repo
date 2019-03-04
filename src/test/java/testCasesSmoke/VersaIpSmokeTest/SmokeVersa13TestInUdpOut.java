package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmokeVersa13TestInUdpOut extends BaseClassSmokeTest{
	
	@Test
	public void smokeVersa13TestInUdpOut() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		InputVersa input =PageFactory.initElements(driver, InputVersa.class);
		input.job_name("smokeVersa13TestInUdpOut");
	
		input.testPattern();
		input.addInput();
		input.inp_next();
		input.process_next();
		ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_Bcast_PAL());
		
		prof.profile_next();
		Thread.sleep(1000);
		OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
		out.udp_1_profile("udp_clust", output.udp_out_ip(), "7150", output.Cbr_mode(), output.track_1_out(), output.track_2_out());
		out.CbrBitarteValue();
		out.create_out();
		
		out.add_job();
		
		
	}
	}


