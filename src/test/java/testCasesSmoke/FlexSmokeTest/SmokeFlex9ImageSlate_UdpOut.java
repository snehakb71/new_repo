package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex9ImageSlate_UdpOut extends FlexBaseClass {

	@Test
	public void ImageSlate_UdpOut() throws Exception {

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();
		FlexJobData JobData = PageFactory.initElements(driver, FlexJobData.class);
		JobData.FlexJobDataInfo("SmokeFlex9ImageSlate_UdpOut");
		FlexInput ImageSlate = PageFactory.initElements(driver, FlexInput.class);
		ImageSlate.Flex_ImageSlate("/storage/device/Images/logo1.png");
		FlexProfile Preset_1 = PageFactory.initElements(driver, FlexProfile.class);
		Preset_1.FlexProfilePreview(Profile.PROFILE_HD_480());
		FlexOutput UdpOutput = PageFactory.initElements(driver, FlexOutput.class);
		UdpOutput.Flex_UdpOutput("UDP", "10.0.104.2", "6604", Profile.BITRATE_HD_480());
		UdpOutput.AddFlexJob();

	}

}
