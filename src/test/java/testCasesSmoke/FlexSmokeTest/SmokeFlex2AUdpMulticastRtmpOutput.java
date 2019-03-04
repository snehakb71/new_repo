package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex2AUdpMulticastRtmpOutput extends FlexBaseClass{
	
	@Test
	public void UdpMulticastRtmpOutput() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex2AUdpMulticastRtmpOutput");
	    FlexInput UdpInput = PageFactory.initElements(driver,FlexInput.class);
	    UdpInput.Flex_UdpInput(Info.UdpInputIP(),"6000","eno2");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_NTSC_720());
	    FlexOutput RtmpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    RtmpOutput.Flex_RtmpOutput("RTMP",Info.OutputRtmpURL(),"udprtmp2a");
	    RtmpOutput.AddFlexJob();
		
	}

}
