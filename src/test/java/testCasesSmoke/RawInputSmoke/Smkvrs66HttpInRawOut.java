package testCasesSmoke.RawInputSmoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;


// depends on SmkVrs4aBmdInMultiOut
public class Smkvrs66HttpInRawOut extends RawInputBase{
	

	@Test
	public void smkvrs66HttpInRawOut() throws Exception
	{
		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();
		
		InputVersa inp= PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("Smkvrs66HttpInRawOut");
		
		inp.httpInput(config.HLS_http_input());
		inp.addInput();
		inp.inp_next();
		inp.process_next();
		
		ProfileVersa pro= PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_hd_854());
		
		pro.profile_next();
		Thread.sleep(500);
		
		OutputVersa out1 = PageFactory.initElements(driver, OutputVersa.class);
		out1.rawOutput("httpRaw", output.rawVideoDevice(), output.rawAudioDevice());
		out1.create_out();
		out1.add_job();
	}
	
	

}
