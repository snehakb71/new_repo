package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex10RtpMulticastUDPRTPRTMPMP4Output extends FlexBaseClass {
	
	@Test
	public void RtpMulticastUDPRTPRTMPMP4Output() throws Exception
	
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex10RtpMulticastUDPRTPRTMPMP4Output");
	    FlexInput RtpInput = PageFactory.initElements(driver,FlexInput.class);
	    RtpInput.Flex_RtpInput("224.0.3.2","6000","eno2");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_HD_480());
	    FlexOutput UdpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    UdpOutput.Flex_UdpOutput("UDP","10.0.104.2","6200",Profile.BITRATE_HD_480());
	    UdpOutput.AddOutput();
	    FlexOutput RtpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    RtpOutput.Flex_RtpOutput("RTP","10.0.104.2","6201",Profile.BITRATE_HD_480());
	    RtpOutput.AddOutput();
	    FlexOutput RtmpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    RtmpOutput.Flex_RtmpOutput("RTMP","rtmp10",Info.OutputRtmpURL());
	    RtmpOutput.AddOutput();
	    FlexOutput FileOutput = PageFactory.initElements(driver,FlexOutput.class);
	    FileOutput.Flex_FileStreamOutput("FileStream","/storage/device/File_Output/RtpIn_MP4Out.mp4");
	    RtmpOutput.AddFlexJob();
	    
		
	}


}
