package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmkVrs54srtClientRTmpout extends BaseClassSmokeTest {

	@Test

	public void smkVrs54srtClientRTmpout() throws Exception {

		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();

		InputVersa inp = PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("SmkVrs54srtClientRTmpout");

		inp.srtInput(config.udp1_input_ip2_unicast(), "6500");

		inp.addInput();
		inp.inp_next();
		inp.process_next();

		ProfileVersa pro = PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_pal_360());

		pro.profile_next();
		Thread.sleep(500);

		OutputVersa out2 = PageFactory.initElements(driver, OutputVersa.class);
		out2.rtmp_1_profile(output.rtmp_cluster_name(), "srtrtmp", output.rtmp_server_url());
		out2.create_out();
		out2.add_job();
	}

}
