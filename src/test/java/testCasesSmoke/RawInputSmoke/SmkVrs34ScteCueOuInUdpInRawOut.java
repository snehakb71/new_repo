package testCasesSmoke.RawInputSmoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class SmkVrs34ScteCueOuInUdpInRawOut extends RawInputBase{
	
	@Test

	public void smkVrs34ScteCueOuInUdpInRawOut() throws Exception {
		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();

		InputVersa inp = PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("SmkVrs34ScteCueOuInUdpInRawOut");

		inp.udp_in1_multicast(config.udp1_input_ip1_multicast(), config.udp_port(), config.rawServerUdp_interface());
		
		inp.cuetone(config.Metadata(), config.cuetone());
		inp.cuetoneSource(config.scteApi());
		inp.cuetoneSourceAPI(config.scteApiCueInCueOut());
		inp.addInput();
		inp.inp_next();
		inp.process_next();

		ProfileVersa pro = PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.uncompressed_profile());
		pro.MetaTrcakScte(profile.metaTrack());

		pro.profile_next();
		Thread.sleep(500);

		OutputVersa out2 = PageFactory.initElements(driver, OutputVersa.class);
		out2.rawOutput("rawScte", output.rawVideoDevice(), output.rawAudioDevice());
		out2.scteLine(output.ScteLineNum());
		out2.create_out();
		out2.add_job();
	}

}
