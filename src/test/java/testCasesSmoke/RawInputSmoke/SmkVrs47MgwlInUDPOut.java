package testCasesSmoke.RawInputSmoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class SmkVrs47MgwlInUDPOut extends BaseClassSmokeTest {
	
	@Test

	public void smkVrs47MgwlInUDPOut() throws Exception {
		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();

		InputVersa inp = PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("SmkVrs47MgwlInUDPOut");

		inp.rawInput(config.rawMagewellVideoDevice(), config.rawVideoInterfaceSdi(), config.rawMagewellAudioDevice());
		
		inp.addInput();
		inp.inp_next();
		inp.process_next();

		ProfileVersa pro = PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_pal_720());
		
		pro.profile_next();
		Thread.sleep(500);

		OutputVersa out2 = PageFactory.initElements(driver, OutputVersa.class);
		out2.udp_1_profile(output.cluster_name(), output.udp_out_ip(), "8255", output.Cbr_mode(), output.track_1_out(), output.track_2_out());
		out2.CbrBitarteValue();
		out2.create_out();
		out2.add_job();
	}

}
