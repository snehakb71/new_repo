package testCasesSmoke.RawInputSmoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class SmkVrs49MagewlInRtmpOut extends RawInputBase{

	@Test

	public void smkVrs49MagewlInRtmpOut() throws Exception {
		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();

		InputVersa inp = PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("SmkVrs49MagewlInRtmpOut");

		inp.rawMagWellInput(config.rawMagewellVideoDevice(), config.rawVideoInterfaceSdi(), config.rawMagewellAudioDevice());
		
		inp.addInput();
		inp.inp_next();
		inp.process_next();

		ProfileVersa pro = PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_HD_1280());
		
		pro.profile_next();
		Thread.sleep(500);

		OutputVersa out2 = PageFactory.initElements(driver, OutputVersa.class);
		out2.rtmp_1_profile(output.rtmp_cluster_name(), "magewellRtmp", output.rtmp_server_url());
		out2.create_out();
		out2.add_job();
	}
}
