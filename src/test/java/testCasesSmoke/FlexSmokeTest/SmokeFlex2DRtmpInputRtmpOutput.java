package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex2DRtmpInputRtmpOutput extends FlexBaseClass{
	
	@Test
	public void RtmpInputRtmpOutput() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex2DRtmpInputRtmpOutput");
	    FlexInput RtmpInput = PageFactory.initElements(driver,FlexInput.class);
	    RtmpInput.Flex_RtmpInput(Info.InputRtmpurl(),"udprtmp2c");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_HD_360());
	    FlexOutput RtmpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    RtmpOutput.Flex_RtmpOutput("RTMP",Info.OutputRtmpURL(),"udprtmp2d");
	    RtmpOutput.AddFlexJob();
		
	}

}
