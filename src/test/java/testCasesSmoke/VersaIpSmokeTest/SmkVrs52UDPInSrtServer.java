package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmkVrs52UDPInSrtServer extends BaseClassSmokeTest{
	
	@Test(groups = "ip_job")

	public void smkVrs52UDPInSrtServer() throws Exception {

		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();

		InputVersa inp = PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("SmkVrs52UDPInSrtServer");

		inp.udp_in1_multicast(config.udp1_input_ip1_multicast(), config.udp_port(), config.udp_interface());

		inp.addInput();
		inp.inp_next();
		inp.process_next();

		ProfileVersa pro = PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_pal_360());

		pro.profile_next();
		Thread.sleep(500);

		OutputVersa out2 = PageFactory.initElements(driver, OutputVersa.class);
		out2.srt_out("srt_out", "6500", output.Cbr_mode(), output.track_1_out(), output.track_2_out());

		out2.CbrBitarteValue();
		out2.create_out();
		out2.add_job();
	}

}
