package testCasesSmoke.StatixSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.StatixJobType;

public class SmokeStatix17FileTSFileOutputAll extends StatixBaseClass{
	
	@Test
	public void FileTSFileOutputAll() throws InterruptedException {
		
		StatixJobType navigate = PageFactory.initElements(driver, StatixJobType.class);
		navigate.NavigateToNewStatix();
		StatixJobType jobdata = PageFactory.initElements(driver, StatixJobType.class);
		jobdata.StatixJobDataInfo("SmokeStatix17FileTSFileOutputAll");
		StatixJobType fileinput = PageFactory.initElements(driver, StatixJobType.class);
		fileinput.StatixInputFile("/storage/device/Test_vectors/Dtph.ts");
		StatixJobType profile = PageFactory.initElements(driver, StatixJobType.class);
		profile.StatixAddProfile(Profile.PROFILE_HD_480());
		StatixJobType mp4 = PageFactory.initElements(driver, StatixJobType.class);
		mp4.StatixAddFileOut("MP4","/storage/device/Statix_File", "MP4");
		mp4.AddOutput();
		StatixJobType mkv = PageFactory.initElements(driver, StatixJobType.class);
		mkv.StatixAddFileOut("MKV","/storage/device/Statix_File", "MKV");
		mkv.AddOutput();
		StatixJobType mov = PageFactory.initElements(driver, StatixJobType.class);
		mov.StatixAddFileOut("MOV","/storage/device/Statix_File", "MOV");
		mov.AddOutput();
		StatixJobType flv = PageFactory.initElements(driver, StatixJobType.class);
		flv.StatixAddFileOut("FLV","/storage/device/Statix_File", "FLV");
		flv.AddStatixJobType();
		
		
	}


}
