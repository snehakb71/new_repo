package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex49Magewell_RTMP extends FlexBaseClass {
	@Test
	public void Magewell_RTMP() throws Exception {

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();
		FlexJobData JobData = PageFactory.initElements(driver, FlexJobData.class);
		JobData.FlexJobDataInfo("SmokeFlex49Magewell_RTMP");
		FlexInput Magewell = PageFactory.initElements(driver, FlexInput.class);
		Magewell.Flex_RawInput("Video_device_5", "Audio_device_5");
		FlexProfile Preset_1 = PageFactory.initElements(driver, FlexProfile.class);
		Preset_1.FlexProfilePreview(Profile.PROFILE_HD_480());
		FlexOutput RtmpOutput = PageFactory.initElements(driver, FlexOutput.class);
		RtmpOutput.Flex_RtmpOutput("RTMP", Info.OutputRtmpURL(), "magewellrtmp");
		RtmpOutput.AddFlexJob();

	}
}