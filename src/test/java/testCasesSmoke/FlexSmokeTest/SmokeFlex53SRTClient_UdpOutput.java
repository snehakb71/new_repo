package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex53SRTClient_UdpOutput extends FlexBaseClass{
	
	@Test
	public void SRTClient_UdpOutput() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex53SRTClient_UdpOutput");
	    FlexInput SRTClient = PageFactory.initElements(driver,FlexInput.class);
	    SRTClient.Flex_SRTClientInput("10.0.0.4","8003");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_NTSC_544());
	    FlexOutput UdpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    UdpOutput.Flex_UdpOutput("UDP","10.0.104.2","8004",Profile.BITRATE_NTSC_544());
	    UdpOutput.AddFlexJob();
		
	}

}
