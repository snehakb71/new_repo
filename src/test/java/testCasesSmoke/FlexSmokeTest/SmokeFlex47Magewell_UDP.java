package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex47Magewell_UDP extends FlexBaseClass {

	@Test
	public void Magewell_UDP() throws Exception {

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();
		FlexJobData JobData = PageFactory.initElements(driver, FlexJobData.class);
		JobData.FlexJobDataInfo("SmokeFlex47Magewell_UDP");
		FlexInput Magewell = PageFactory.initElements(driver, FlexInput.class);
		Magewell.Flex_RawInput("Video_device_5", "Audio_device_5");
		FlexProfile Preset_1 = PageFactory.initElements(driver, FlexProfile.class);
		Preset_1.FlexProfilePreview(Profile.PROFILE_HD_480());
		FlexOutput udpout = PageFactory.initElements(driver, FlexOutput.class);
		udpout.Flex_UdpOutput("UDP","10.0.104.2","9440",Profile.BITRATE_HD_480());
		udpout.AddFlexJob();

	}

}
