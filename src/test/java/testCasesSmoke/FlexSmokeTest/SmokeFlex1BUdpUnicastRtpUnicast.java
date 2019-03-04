package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex1BUdpUnicastRtpUnicast extends FlexBaseClass {
	
	@Test
	public void UdpUnicastRtpUnicast() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex1BUdpUnicastRtpUnicast");
	    FlexInput UdpInput = PageFactory.initElements(driver,FlexInput.class);
	    UdpInput.Flex_UdpInputUnicast("10.0.0.4","8440");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_PAL_544());
	    FlexOutput UdpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    UdpOutput.Flex_RtpOutput("RTP","10.0.0.4","8441",Profile.BITRATE_PAL_544());
	    UdpOutput.AddFlexJob();
		
	}

}
