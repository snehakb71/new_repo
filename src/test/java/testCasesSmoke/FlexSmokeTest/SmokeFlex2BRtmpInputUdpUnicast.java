package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex2BRtmpInputUdpUnicast extends FlexBaseClass {
	
	@Test
	public void RtmpInputUdpUnicast() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex2BRtmpInputUdpUnicast");
	    FlexInput RtmpInput = PageFactory.initElements(driver,FlexInput.class);
	    RtmpInput.Flex_RtmpInput(Info.InputRtmpurl(),"udprtmp2a");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_NTSC_544());
	    FlexOutput UdpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    UdpOutput.Flex_UdpOutput("UDP","10.0.0.4","7700",Profile.BITRATE_NTSC_544());
	    UdpOutput.AddFlexJob();
		
	}

}
