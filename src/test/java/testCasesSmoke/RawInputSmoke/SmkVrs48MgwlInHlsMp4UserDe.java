package testCasesSmoke.RawInputSmoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class SmkVrs48MgwlInHlsMp4UserDe extends RawInputBase {

	@Test

	public void smkVrs48MgwlInHlsMp4UserDe() throws Exception {

		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();

		InputVersa inp = PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("smkVrs48MgwlInHlsMp4UserDe");

		inp.rawInput(config.rawMagewellVideoDevice(), config.rawVideoInterfaceSdi(), config.rawMagewellAudioDevice());

		inp.addInput();
		inp.inp_next();
		inp.process_next();

		ProfileVersa pro = PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_hd_854());

		pro.profile_next();
		Thread.sleep(500);

		OutputVersa out2 = PageFactory.initElements(driver, OutputVersa.class);
		out2.streamer_out();
		out2.streamer_name("rawHlsMagmp4");
		out2.streamer_protocol(output.hls_streamer_pro());
		out2.addstreamer();

		out2.next_output();
		out2.file_out(output.mp4_cluster_name(), "/storage/device/sneha/output/rawInput_TeCA48_mp4.mp4");

		out2.slicing_type(output.UserDefinedSlicing());
		out2.create_out();
		out2.add_job();
	}

}
