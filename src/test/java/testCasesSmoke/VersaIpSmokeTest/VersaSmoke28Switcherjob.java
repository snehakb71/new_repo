package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class VersaSmoke28Switcherjob extends BaseClassSmokeTest{
	
	@Test
	public void versaSmoke28Switcherjob() throws Exception
	{
		
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		InputVersa input =PageFactory.initElements(driver, InputVersa.class);
		input.job_name("versaSmoke28Switcherjob");
	
		input.udp_in1_multicast(config.udp1_input_ip1_multicast(), config.udp_port(), config.udp_interface());
		input.addInput();
		input.secondaryInput();
		
		input.file_input(config.mp4_file_path());
		input.addInput();
		input.secondaryInput();
		
		input.rtmpInput(config.rtmp_url(), config.rtmp_stream_name());
		input.addInput();
		
		input.inp_next();
		input.process_next();
		ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_NTSC_720());
		
		prof.profile_next();
		Thread.sleep(1000);
		OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
		out.udp_1_profile(output.cluster_name(), output.udp_out_ip(), "8250", output.Cbr_mode(), output.track_1_out(), output.track_2_out());
		out.CbrBitarteValue();
		out.create_out();
		out.next_output();
		OutputVersa out1= PageFactory.initElements(driver, OutputVersa.class);
		out1.rtmp_1_profile(output.rtmp_cluster_name(), "switcher_rtmp", output.rtmp_server_url());
		out1.create_out();
		
		out1.add_job();
	}

}
