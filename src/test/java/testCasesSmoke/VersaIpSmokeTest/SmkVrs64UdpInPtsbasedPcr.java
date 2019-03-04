package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmkVrs64UdpInPtsbasedPcr extends BaseClassSmokeTest{
	
	@Test

	public void smkVrs64UdpInPtsbasedPcr() throws Exception {
		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();

		InputVersa inp = PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("SmkVrs64UdpInPtsbasedPcr");

		inp.udp_in1_multicast(config.udp1_input_ip1_multicast(), config.udp_port(), config.udp_interface());
		inp.addInput();
		inp.inp_next();
		inp.process_next();

		ProfileVersa pro = PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_hd_424());
		
		pro.profile_next();
		Thread.sleep(500);
		OutputVersa out = PageFactory.initElements(driver, OutputVersa.class);
		
		out.udp_1_profile(output.cluster_name(), output.udp_out_ip(), "8270", output.Cbr_mode(), output.track_1_out(), output.track_2_out());
		out.CbrBitarteValue();
		out.complience(output.compli_PtsBasePcr());
		out.create_out();
		out.add_job();
		
		
	}

}
