package testCasesSmoke.RawInputSmoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class SmkVrs38ScteOubndCuOuInRawInHls extends RawInputBase {

	@Test

	public void smkVrs38ScteOubndCuOuInRawInHls() throws Exception {
		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();

		InputVersa inp = PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("SmkVrs38ScteOubndCuOuInRawInHls");

		inp.rawMagWellInput(config.rawVideoDevice(), config.rawVideoInterfaceSdi(), config.rawAudiodevice());
		inp.addTrack();
		inp.cuetoneSource(config.scteApi());
		inp.cuetoneSourceAPI(config.scteApiCueInCueOut());
		inp.addInput();
		inp.inp_next();
		inp.process_next();

		ProfileVersa pro = PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_NTSC_544());
		pro.MetaTrcakScte(profile.metaTrack());

		pro.profile_next();
		Thread.sleep(500);

		OutputVersa out2 = PageFactory.initElements(driver, OutputVersa.class);
		out2.streamer_out();
		out2.streamer_name("rawHls_cueOutcueIn");
		out2.streamer_protocol(output.hls_streamer_pro());

		out2.streamer_muxOverhead();
		out2.streamer_CueToneManifest();
		Thread.sleep(200);
		out2.streamer_CueToneMeta();
		out2.streamer_CueToneSplice();

		out2.addstreamer();
		out2.add_job();
	}

}
