package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex67UdpInUdpPTSBasedPCR extends FlexBaseClass{
	
	@Test
	public void UdpInUdpPTSBasedPCR () throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex67UdpInUdpPTSBasedPCR");
	    FlexInput UdpInput = PageFactory.initElements(driver,FlexInput.class);
	    UdpInput.Flex_UdpInput(Info.UdpInputIP(),"6000","eno2");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_PAL_544());
	    FlexOutput UdpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    UdpOutput.Flex_UdpOutputPTSBasedPCR("UDP","10.0.104.2","7731",Profile.BITRATE_PAL_544());
	    UdpOutput.AddFlexJob();
		
	}
	
	

}
