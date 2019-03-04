package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex13TestPattern_UdpOutput extends FlexBaseClass{
	
	@Test
	public void TestPattern_UdpOutput() throws Exception {

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();
		FlexJobData JobData = PageFactory.initElements(driver, FlexJobData.class);
		JobData.FlexJobDataInfo("SmokeFlex13TestPattern_UdpOutput");
		FlexInput TestPattern = PageFactory.initElements(driver, FlexInput.class);
		TestPattern.Flex_TestPattern();
		FlexProfile Preset_1 = PageFactory.initElements(driver, FlexProfile.class);
		Preset_1.FlexProfilePreview(Profile.PROFILE_HD_360());
		FlexOutput UdpOutput = PageFactory.initElements(driver, FlexOutput.class);
		UdpOutput.Flex_UdpOutput("UDP", "10.0.104.2", "6605", Profile.BITRATE_HD_360());
		UdpOutput.AddFlexJob();

	}

}
