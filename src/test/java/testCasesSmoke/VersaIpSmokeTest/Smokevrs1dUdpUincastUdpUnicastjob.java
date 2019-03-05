package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class Smokevrs1dUdpUincastUdpUnicastjob extends BaseClassSmokeTest {

	@Test(priority=4, groups = {"1"} )
	public void smokevrs1dUdpUincastUdpUnicastjob() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		
		InputVersa inp = PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("Smokevrs1dUdpUincastUdpUnicast");
		inp.udp_in1_unicast(config.udp1_input_ip2_unicast(), config.udp1_input_unicast_port3());
		
		
		inp.addInput();
		inp.inp_next();
		inp.process_next();
		
		ProfileVersa pro = PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_P2P_NTSC());
		pro.profile_next();
		
		Thread.sleep(1000);
		
		OutputVersa out = PageFactory.initElements(driver, OutputVersa.class);
		out.udp_1_profile(output.cluster_name(), output.udp_out_ip(), output.udp_out_profile3_port(), output.Cbr_mode(), output.track_1_out(), output.track_2_out());
		
		out.CbrBitarteValue();
		out.create_out();
		out.add_job();
	}
}
