package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex3CRtmpInputRtpUnicast extends FlexBaseClass{
	
	@Test
	public void RtmpInputRtpUnicast() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex3CRtmpInputRtpUnicast");
	    FlexInput RtmpInput = PageFactory.initElements(driver,FlexInput.class);
	    RtmpInput.Flex_RtmpInput(Info.InputRtmpurl(),"rtprtmp3b");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_HD_360());
	    FlexOutput RtpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    RtpOutput.Flex_RtpOutput("RTP","10.0.0.4","6100",Profile.BITRATE_HD_360());
	    RtpOutput.AddFlexJob();
		
	}

}
