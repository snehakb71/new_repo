package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex3BRtpUnicastRtmpOutput extends FlexBaseClass{
	
	@Test
	public void RtpUnicastRtmpOutput() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex3BRtpUnicastRtmpOutput");
	    FlexInput RtpInput = PageFactory.initElements(driver,FlexInput.class);
	    RtpInput.Flex_RtpInputUnicast("10.0.0.4","7800");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_HD_480());
	    FlexOutput RtmpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    RtmpOutput.Flex_RtmpOutput("RTMP",Info.OutputRtmpURL(),"rtprtmp3b");
	    RtmpOutput.AddFlexJob();
		
	}


}
