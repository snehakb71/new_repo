package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex2CUdpUnicastRtmpOutput extends FlexBaseClass{
	
	@Test
	public void UdpUnicastRtmpOutput() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex2CUdpUnicastRtmpOutput");
	    FlexInput UdpInput = PageFactory.initElements(driver,FlexInput.class);
	    UdpInput.Flex_UdpInputUnicast("10.0.0.4","7700");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_NTSC_360());
	    FlexOutput RtmpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    RtmpOutput.Flex_RtmpOutput("RTMP",Info.OutputRtmpURL(),"udprtmp2c");
	    RtmpOutput.AddFlexJob();
		
	}

}
