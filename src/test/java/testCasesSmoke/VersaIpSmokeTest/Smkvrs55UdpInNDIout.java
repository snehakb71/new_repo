package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class Smkvrs55UdpInNDIout extends BaseClassSmokeTest {

	@Test

	public void smkvrs55UdpInNDIout() throws Exception {

		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();

		InputVersa inp = PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("smkvrs55UdpInNDIout");

		inp.udp_in1_multicast(config.udp1_input_ip1_multicast(), config.udp_port(), config.udp_interface());

		inp.addInput();
		inp.inp_next();
		inp.process_next();

		ProfileVersa pro = PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.uncompressed_profile());

		pro.profile_next();
		Thread.sleep(500);

		OutputVersa out2 = PageFactory.initElements(driver, OutputVersa.class);
		out2.ndiOut("ndiClust", output.ndivideoSource1(), output.ndiAudioSource1());
		out2.create_out();
		
		out2.next_output();
		OutputVersa out3 = PageFactory.initElements(driver, OutputVersa.class);
		out3.ndiOut("multinDi", output.ndivideoSource2(), output.ndiAudioSource2());
		out3.create_out();
		out3.add_job();
	}

}
