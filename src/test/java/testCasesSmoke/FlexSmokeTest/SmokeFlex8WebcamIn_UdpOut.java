package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex8WebcamIn_UdpOut extends FlexBaseClass{
	

	@Test
	public void WebcamIn_UdpOut() throws Exception {

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();
		FlexJobData JobData = PageFactory.initElements(driver, FlexJobData.class);
		JobData.FlexJobDataInfo("SmokeFlex8WebcamIn_UdpOut");
		FlexInput Webcam = PageFactory.initElements(driver, FlexInput.class);
		Webcam.Flex_Webcam("Device_1");
		FlexProfile Preset_1 = PageFactory.initElements(driver, FlexProfile.class);
		Preset_1.FlexProfilePreview(Profile.PROFILE_HD_720());
		FlexOutput UdpOutput = PageFactory.initElements(driver, FlexOutput.class);
		UdpOutput.Flex_UdpOutput("UDP", "10.0.104.2", "6603", Profile.BITRATE_HD_720());
		UdpOutput.AddFlexJob();

	}

}
