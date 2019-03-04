package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex1CRtpUnicastUdpUnicast extends FlexBaseClass {

	@Test
	public void RtpUnicastUdpUnicast() throws Exception {

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();
		FlexJobData JobData = PageFactory.initElements(driver, FlexJobData.class);
		JobData.FlexJobDataInfo("SmokeFlex1CRtpUnicastUdpUnicast");
		FlexInput RtpInput = PageFactory.initElements(driver, FlexInput.class);
		RtpInput.Flex_RtpInputUnicast("10.0.0.4", "8441");
		FlexProfile Preset_1 = PageFactory.initElements(driver, FlexProfile.class);
		Preset_1.FlexProfilePreview(Profile.PROFILE_PAL_360());
		FlexOutput UdpOutput = PageFactory.initElements(driver, FlexOutput.class);
		UdpOutput.Flex_UdpOutput("UDP", "10.0.0.4", "8442", Profile.BITRATE_PAL_360());
		UdpOutput.AddFlexJob();

	}

}
