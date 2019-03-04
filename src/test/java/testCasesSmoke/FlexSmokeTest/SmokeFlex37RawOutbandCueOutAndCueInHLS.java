package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex37RawOutbandCueOutAndCueInHLS extends FlexBaseClass 
{
	@Test

	public void RawOutbandCueOutAndCueInHLS () throws Exception {

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();
		FlexJobData JobData = PageFactory.initElements(driver, FlexJobData.class);
		JobData.FlexJobDataInfo("SmokeFlex37RawOutbandCueOutAndCueInHLS");
		FlexInput RawIn = PageFactory.initElements(driver, FlexInput.class);
		RawIn.Flex_RawInput("Video_device_5", "Audio_device_5");
		RawIn.EnableMetaData();
		FlexInput APIcoci = PageFactory.initElements(driver, FlexInput.class);
		APIcoci.ApiCueOutAndCueIn("CUE TONE");
		FlexProfile ProfileMeta = PageFactory.initElements(driver, FlexProfile.class);
		ProfileMeta.FlexProfileMetaData(Profile.PROFILE_HD_360());
		FlexOutput hls = PageFactory.initElements(driver, FlexOutput.class);
		hls.Flex_Streamer("rawhlscoci", "HLS");
		hls.EnableAddMuxOverhead();
		hls.EnableCuetoneInManifest();
		hls.EnableCuetoneSpliceInfo();
		hls.EnableCuetoneTimedMeta();
		hls.AddStreamer();
		hls.AddFlexJob();

	}
}
