package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmokeVersa10MulticastRTPmultiOut extends BaseClassSmokeTest {

	@Test
	public void smokeVersa10MulticastRTPmultiOut() throws Exception {
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();

		InputVersa input = PageFactory.initElements(driver, InputVersa.class);
		input.job_name("smokeVersa10MulticastRTPmultiOut");

		input.udp_in1_multicast(config.rtp_multicast_input(), config.udp_port(), config.udp_interface());
		input.decapt_Rtp(config.depacketizer());
		input.addInput();

		input.inp_next();
		input.process_next();
		ProfileVersa prof = PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_NTSC_360());

		prof.profile_next();
		Thread.sleep(1000);
		OutputVersa out = PageFactory.initElements(driver, OutputVersa.class);
		out.udp_1_profile(output.cluster_name(), output.udp_out_ip(), "7350", output.Cbr_mode(),
				output.track_1_out(), output.track_2_out());
		out.CbrBitarteValue();
		out.create_out();
		Thread.sleep(1000);
		out.next_output();

		OutputVersa out1 = PageFactory.initElements(driver, OutputVersa.class);
		out1.rtmp_1_profile(output.rtmp_cluster_name(), "multirtmp", output.rtmp_server_url());
		out1.create_out();
		Thread.sleep(1000);
		out1.next_output();

		OutputVersa out2 = PageFactory.initElements(driver, OutputVersa.class);
		out2.udp1_out("rtp_out", output.udp_out_ip(), "8100", output.Cbr_mode(), output.track_1_out(),
				output.track_2_out());
		out2.CbrBitarteValue();
		out2.rtp_pactizer(output.pactizer());
		out2.create_out();
		Thread.sleep(1000);
		out2.next_output();

		OutputVersa out3 = PageFactory.initElements(driver, OutputVersa.class);
		out3.file_out(output.mp4_cluster_name(), "/storage/device/sneha/output/file_testcase10.mp4");
		out3.create_out();
		out3.add_job();

	}

}
