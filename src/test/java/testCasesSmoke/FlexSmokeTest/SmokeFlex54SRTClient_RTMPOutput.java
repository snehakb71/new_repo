package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex54SRTClient_RTMPOutput extends FlexBaseClass{
	
	@Test
	public void SRTClient_RTMPOutput() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex54SRTClient_RTMPOutput");
	    FlexInput SRTClient = PageFactory.initElements(driver,FlexInput.class);
	    SRTClient.Flex_SRTClientInput("10.0.0.4","8003");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_PAL_544());
	    FlexOutput RtmpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    RtmpOutput.Flex_RtmpOutput("RTMP","srtrtmp","rtmp://10.0.0.201:1935/live");
	    RtmpOutput.AddFlexJob();
		
	}


}
