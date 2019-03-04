package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex52Udp_SRTServerOutput extends FlexBaseClass{
	
	@Test
	public void Udp_SRTServerOutput() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex52Udp_SRTServerOutput");
	    FlexInput UdpInput = PageFactory.initElements(driver,FlexInput.class);
	    UdpInput.Flex_UdpInput(Info.UdpInputIP(),"6000","eno2");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_PAL_720());
	    FlexOutput SrtServer = PageFactory.initElements(driver,FlexOutput.class);
	    SrtServer.Flex_SRTServerOutput("SRTSERVER","8003",Profile.BITRATE_PAL_720());
	    SrtServer.AddFlexJob();
		
	}
	
	

}
