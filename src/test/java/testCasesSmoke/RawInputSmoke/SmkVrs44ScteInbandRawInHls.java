package testCasesSmoke.RawInputSmoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class SmkVrs44ScteInbandRawInHls extends RawInputBase{
	
	@Test

	public void smkVrs44ScteInbandRawOutHls() throws Exception {
		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();

		InputVersa inp = PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("SmkVrs44ScteInbandRawOutHls");

		inp.rawMagWellInput(config.rawVideoDevice_2(), config.rawVideoInterfaceSdi(), config.rawAudiodevice_2());
		inp.addTrack();
		
		inp.cuetoneSource(config.scteInband());
		inp.scteLineNum(config.scteNum());
		inp.addInput();
		inp.inp_next();
		inp.process_next();

		ProfileVersa pro = PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_pal_360());
		pro.MetaTrcakScte(profile.metaTrack());

		pro.profile_next();
		Thread.sleep(500);

		OutputVersa out2 = PageFactory.initElements(driver, OutputVersa.class);
		out2.streamer_out();
		out2.streamer_name("scteInRwHLS23");
		out2.streamer_protocol(output.hls_streamer_pro());
		out2.streamer_muxOverhead();
		
		out2.streamer_CueToneMeta();
		out2.streamer_CueToneManifest();
		out2.streamer_CueToneSplice();
		out2.addstreamer();
		out2.add_job();
	}

}
