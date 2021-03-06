package testCasesSmoke.VersaIpSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class SmokeVersa19TsInputMultiFileOut extends BaseClassSmokeTest{
	
	@Test
	public void smokeVersa19TsInputMultiFileOut() throws Exception
	{
		Job_type type = PageFactory.initElements(driver, Job_type.class);
		type.versa_job();
		
		InputVersa input =PageFactory.initElements(driver, InputVersa.class);
		input.job_name("smokeVersa19TsInputMultiFileOut");
	
		input.file_input(config.ts_filePath());
		input.addInput();
		input.inp_next();
		input.process_next();
		ProfileVersa prof =PageFactory.initElements(driver, ProfileVersa.class);
		prof.profile_select(profile.profile_NTSC_544());
		
		prof.profile_next();
		Thread.sleep(1000);
		OutputVersa out= PageFactory.initElements(driver, OutputVersa.class);
		out.file_out(output.cluster_name(), "/storage/device/sneha/output/testcase19_mp4.mp4");
		out.create_out();
		Thread.sleep(1000);
		out.next_output();
		
		OutputVersa out1= PageFactory.initElements(driver, OutputVersa.class);
		out1.file_out("flvOut", "/storage/device/sneha/output/testcase19_flv.flv");
		out1.fileMuxerType(output.flvMuxer());
		out1.create_out();
		Thread.sleep(1000);
		out1.next_output();
		
		OutputVersa out2= PageFactory.initElements(driver, OutputVersa.class);
		out2.file_out("mkvCluster", "/storage/device/sneha/output/testcase19_mkv.mkv");
		out2.fileMuxerType(output.mkvMuxer());
		out2.create_out();
		Thread.sleep(1000);
		out2.next_output();
		
		OutputVersa out3= PageFactory.initElements(driver, OutputVersa.class);
		out3.file_out("movCluster", "/storage/device/sneha/output/testcase19_mov.mov");
		out3.fileMuxerType(output.movmuxer());
		out3.create_out();
		Thread.sleep(1000);
		out3.next_output();
		
		OutputVersa out4= PageFactory.initElements(driver, OutputVersa.class);
		out4.file_out("TsCluster", "/storage/device/sneha/output/testcase19_ts.ts");
		out4.TsMuxer(output.Tsmuxer(), output.Cbr_mode(), output.track_1_out(), output.track_2_out());
		out4.CbrBitarteValue();
		out4.create_out();
		Thread.sleep(1000);
		out4.next_output();
		
		out4.add_job();
	}

}
