package testCasesSmoke.StatixSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.StatixJobType;

public class SmokeStatix19Folder_FileOutput_HLSDASH extends StatixBaseClass{
	
	@Test
	public void Folder_FileOutput_HLSDASH() throws InterruptedException {
		
		StatixJobType navigate = PageFactory.initElements(driver, StatixJobType.class);
		navigate.NavigateToNewStatix();
		StatixJobType jobdata = PageFactory.initElements(driver, StatixJobType.class);
		jobdata.StatixJobDataInfo("SmokeStatix19Folder_FileOutput_HLSDASH");
		StatixJobType folderinput = PageFactory.initElements(driver, StatixJobType.class);
		folderinput.StatixInputFolder("/storage/device/Offline");
		StatixJobType profile = PageFactory.initElements(driver, StatixJobType.class);
		profile.StatixAddProfile(Profile.PROFILE_HD_360());
		StatixJobType mp4 = PageFactory.initElements(driver, StatixJobType.class);
		mp4.StatixAddFileOut("MP4","/storage/device/Statix_Folder", "MP4");
		mp4.AddOutput();
		StatixJobType mkv = PageFactory.initElements(driver, StatixJobType.class);
		mkv.StatixAddFileOut("MKV","/storage/device/Statix_Folder", "MKV");
		mkv.AddOutput();
		StatixJobType mov = PageFactory.initElements(driver, StatixJobType.class);
		mov.StatixAddFileOut("MOV","/storage/device/Statix_Folder", "MOV");
		mov.AddOutput();
		StatixJobType flv = PageFactory.initElements(driver, StatixJobType.class);
		flv.StatixAddFileOut("FLV","/storage/device/Statix_Folder", "FLV");
		flv.AddOutput();
		StatixJobType hlsvod = PageFactory.initElements(driver, StatixJobType.class);
		hlsvod.StatixAddStreamer("hlsvodfolder","/storage/device/HLS_VOD", "HLS");
		hlsvod.AddOutput();
		StatixJobType dashvod = PageFactory.initElements(driver, StatixJobType.class);
		dashvod.StatixAddStreamer("dashvodfolder","/storage/device/DASH_VOD", "DASH");
		hlsvod.AddStatixJobType();
	
		
		
	}

}
