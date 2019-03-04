package testCasesSmoke.RawInputSmoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class SmkVrs51VportUDpuniRawOut extends BaseClassSmokeTest {
	
	@Test
	public void smkVrs51VportUDpuniRawOut() throws Exception
	{
		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();
		
		InputVersa inp= PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("SmkVrs51VportUDpuniRawOut");
		
		inp.udp_in1_unicast(config.udp1_input_ip2_unicast(), "8700");
		inp.addInput();
		inp.inp_next();
		inp.process_next();
		
		ProfileVersa pro= PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.uncompressed_profile());
		
		pro.profile_next();
		Thread.sleep(500);
		
		OutputVersa out1 = PageFactory.initElements(driver, OutputVersa.class);
		out1.rawOutput("raw_clu", output.rawVideoDevice(), output.rawAudioDevice());
		out1.create_out();
		out1.add_job();
	}

}
