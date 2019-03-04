package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex38RawOutbandCueOutAndDurationHLS extends FlexBaseClass{
	
	@Test

	public void RawOutbandCueOutAndDurationHLS () throws Exception {

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();
		FlexJobData JobData = PageFactory.initElements(driver, FlexJobData.class);
		JobData.FlexJobDataInfo("SmokeFlex38RawOutbandCueOutAndDurationHLS");
		FlexInput RawIn = PageFactory.initElements(driver, FlexInput.class);
		RawIn.Flex_RawInput("Video_device_5", "Audio_device_5");
		RawIn.EnableMetaData();
		FlexInput APIcod = PageFactory.initElements(driver, FlexInput.class);
		APIcod.ApiCueOutAndDuration("CUE TONE");
		FlexProfile ProfileMeta = PageFactory.initElements(driver, FlexProfile.class);
		ProfileMeta.FlexProfileMetaData(Profile.PROFILE_HD_480());
		FlexOutput hls = PageFactory.initElements(driver, FlexOutput.class);
		hls.Flex_Streamer("rawhlscod", "HLS");
		hls.EnableAddMuxOverhead();
		hls.EnableCuetoneInManifest();
		hls.EnableCuetoneSpliceInfo();
		hls.EnableCuetoneTimedMeta();
		hls.AddStreamer();
		hls.AddFlexJob();

	}


}
