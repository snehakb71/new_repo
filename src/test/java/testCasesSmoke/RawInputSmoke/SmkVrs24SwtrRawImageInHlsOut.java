package testCasesSmoke.RawInputSmoke;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;
import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class SmkVrs24SwtrRawImageInHlsOut extends RawInputBase {
	
	@Test
	
	public void smkVrs24SwtrRawImageInHlsOut() throws Exception
	{
		Job_type job = PageFactory.initElements(driver, Job_type.class);
		job.versa_job();
		
		InputVersa inp= PageFactory.initElements(driver, InputVersa.class);
		inp.job_name("smkVrs24SwtrRawImageInHlsOut");
		Thread.sleep(500);
		//driver.findElement(By.id("versa_src_raw_multi")).click();
		//Thread.sleep(500);
		//new Select(driver.findElement(By.id("gstaf_src_raw_video_device_id"))).selectByVisibleText("Video_device_1");
		//new Select(driver.findElement(By.id("gstaf_src_raw_audio_device_id"))).selectByVisibleText("Audio_device_1");
		
		inp.rawMagWellInput(config.rawVideoDevice_2(), config.rawVideoInterfaceSdi(), config.rawAudiodevice_2());
		inp.addInput();
		inp.secondaryInput();
		inp.ImageSlate(config.ImageFilePath());
		inp.addInput();
		inp.inp_next();
		inp.process_next();
		
		ProfileVersa pro= PageFactory.initElements(driver, ProfileVersa.class);
		pro.profile_select(profile.profile_hd_640());
		
		pro.profile_next();
		Thread.sleep(500);
		
		OutputVersa out2 = PageFactory.initElements(driver, OutputVersa.class);
		out2.streamer_out();
		out2.streamer_name("rawHls_switcher");
		out2.streamer_protocol(output.hls_streamer_pro());
		out2.addstreamer();
		
		out2.add_job();
		System.out.println("job add successful"+driver.getClass());
	}

}
