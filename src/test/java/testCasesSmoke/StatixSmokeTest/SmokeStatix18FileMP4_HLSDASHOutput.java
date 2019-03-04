package testCasesSmoke.StatixSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.StatixJobType;

public class SmokeStatix18FileMP4_HLSDASHOutput extends StatixBaseClass {

	@Test
	public void FileMP4_HLSDASHOutput() throws InterruptedException {

		StatixJobType navigate = PageFactory.initElements(driver, StatixJobType.class);
		navigate.NavigateToNewStatix();
		StatixJobType jobdata = PageFactory.initElements(driver, StatixJobType.class);
		jobdata.StatixJobDataInfo("SmokeStatix18FileMP4_HLSDASHOutput");
		StatixJobType fileinput = PageFactory.initElements(driver, StatixJobType.class);
		fileinput.StatixInputFile("/storage/device/Test_vectors/MaranaMass.mp4");
		StatixJobType profile = PageFactory.initElements(driver, StatixJobType.class);
		profile.StatixAddProfile(Profile.PROFILE_HD_720());
		StatixJobType hlsvod = PageFactory.initElements(driver, StatixJobType.class);
		hlsvod.StatixAddStreamer("hlsvodfile","/storage/device/HLS_VOD", "HLS");
		hlsvod.AddOutput();
		StatixJobType dashvod = PageFactory.initElements(driver, StatixJobType.class);
		dashvod.StatixAddStreamer("dashvodfile","/storage/device/DASH_VOD", "DASH");
		hlsvod.AddStatixJobType();

	}

}
