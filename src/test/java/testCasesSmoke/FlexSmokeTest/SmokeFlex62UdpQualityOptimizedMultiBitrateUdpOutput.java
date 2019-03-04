package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex62UdpQualityOptimizedMultiBitrateUdpOutput extends FlexBaseClass{
	

	@Test
	public void UdpQualityOptimizedMultiBitrateUdpOutput() throws Exception {

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();
		FlexJobData JobData = PageFactory.initElements(driver, FlexJobData.class);
		JobData.FlexJobDataInfo("SmokeFlex62UdpQualityOptimizedMultiBitrateUdpOutput");
		FlexInput UdpInput = PageFactory.initElements(driver, FlexInput.class);
		UdpInput.Flex_UdpInput(Info.UdpInputIP(), "6000", "eno2");
		FlexProfile Preset_1 = PageFactory.initElements(driver, FlexProfile.class);
		Preset_1.FlexProfileOptimized(Profile.PROFILE_PAL_720());
		Preset_1.AddProfile();
		FlexProfile Preset_2 = PageFactory.initElements(driver, FlexProfile.class);
		Preset_2.FlexProfileOptimized(Profile.PROFILE_PAL_544());
		FlexOutput UdpOutput = PageFactory.initElements(driver, FlexOutput.class);
		UdpOutput.Flex_UdpOutput("UDP", "10.0.104.2", "7721", Profile.BITRATE_PAL_720());
		UdpOutput.AddOutput();
		FlexOutput UdpOutput1 = PageFactory.initElements(driver, FlexOutput.class);
		UdpOutput1.Flex_UdpOutput("UDP", "10.0.104.2", "7722", Profile.BITRATE_PAL_544());
		UdpOutput.AddFlexJob();

	}


}
