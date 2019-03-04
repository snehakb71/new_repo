package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex3AUdpMulticastRtpUnicast extends FlexBaseClass{
	
	@Test
	public void UdpMulticastRtpUnicast() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex3AUdpMulticastRtpUnicast");
	    FlexInput UdpInput = PageFactory.initElements(driver,FlexInput.class);
	    UdpInput.Flex_UdpInput("224.0.3.1","6000","eno2");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_HD_720());
	    FlexOutput RtpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    RtpOutput.Flex_RtpOutput("RTP","10.0.0.4","7800",Profile.BITRATE_HD_720());
	    RtpOutput.AddFlexJob();
		
	}
	

}
