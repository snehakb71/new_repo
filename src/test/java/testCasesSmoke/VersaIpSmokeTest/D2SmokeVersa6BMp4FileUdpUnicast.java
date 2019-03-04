package testCasesSmoke.VersaIpSmokeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class D2SmokeVersa6BMp4FileUdpUnicast extends BaseClassSmokeTest {
	
	@Test
	
	public void smokeVersa6BMp4FileUdpUnicast() throws Exception
	{
		
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		InputVersa input =PageFactory.initElements(driver, InputVersa.class);
		input.job_name("smokeVersa6BMp4FileUdpUnicast1");
	
		input.file_input(config.mp4_file_path());
		
		input.addInput();
		input.inp_next();
		input.process_next();
		ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_hd_640());
		
		prof.profile_next();
		Thread.sleep(1000);
		OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
		out.udp_1_profile(output.cluster_name(), output.udp_outUnicast_serverIp(), "7200", output.Cbr_mode(), output.track_1_out(), output.track_2_out());
		out.CbrBitarteValue();
		out.create_out();
		
		out.add_job();
	}
	}


