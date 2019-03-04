package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmkVrs59QualityOptMultipro extends BaseClassSmokeTest{
	
	@Test
	public void smkVrs59QualityOptMultipro() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		InputVersa input =PageFactory.initElements(driver, InputVersa.class);
		input.job_name("smkVrs59QualityOptMultipro");
	
		input.udp_in1_multicast(config.udp1_input_ip2_multicast(), config.udp_port(), config.udp_interface());
		
		input.addInput();
		input.inp_next();
		input.process_next();
		ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_hd_640());
		prof.profile_edit();
		prof.videoCodec_Type(profile.codecType_QualiOpt());
		prof.profile_Update();
		prof.profile_select(profile.profile_pal_360());
		
		
		prof.profile_next();
		Thread.sleep(1000);
		OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
		out.udp1_out(output.cluster_name(), output.udp_out_ip(), "6200", output.Cbr_mode(), output.track_1_out(), output.track_2_out());
		out.CbrBitarteValue();
		out.udp2_out(output.udp_out_ip(), "6300", output.CbrAuto_mode(), output.track_1_out(), output.track_2_out());
		
		out.create_out();
		
		out.add_job();
	}

}
