package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class Smkvrs56NDIinUDpout extends BaseClassSmokeTest {

	@Test

	public void smkvrs56NDIinUDpout() throws Exception {

		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();

		InputVersa inp = PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("Smkvrs56NDIinUDpout");

		inp.ndiInput(config.NdiDevice());

		inp.addInput();
		inp.inp_next();
		inp.process_next();

		ProfileVersa pro = PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_Bcast_PAL());

		pro.profile_next();
		Thread.sleep(500);

		OutputVersa out2 = PageFactory.initElements(driver, OutputVersa.class);
		out2.udp_1_profile(output.cluster_name(), output.udp_out_ip(), "8555", output.Cbr_mode(),
				output.track_1_out(), output.track_2_out());
		out2.CbrBitarteValue();
		out2.create_out();

		out2.add_job();
	}

}
