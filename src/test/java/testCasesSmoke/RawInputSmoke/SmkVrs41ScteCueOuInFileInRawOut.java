package testCasesSmoke.RawInputSmoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class SmkVrs41ScteCueOuInFileInRawOut extends RawInputBase {
	
	@Test

	public void smkVrs41ScteCueOuInFileInRawOut() throws Exception {
		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();

		InputVersa inp = PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("SmkVrs41ScteCueOuInFileInRawOut");

		inp.file_input(config.ts_filePath());
		inp.demuxer_se(config.demuxer());
		inp.cuetoneForTsFile(config.Metadata(), config.cuetone());
		inp.cuetoneSourceTSFile(config.scteApi());
		inp.cuetoneSourceAPITsFile(config.scteApiCueInCueOut());
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
