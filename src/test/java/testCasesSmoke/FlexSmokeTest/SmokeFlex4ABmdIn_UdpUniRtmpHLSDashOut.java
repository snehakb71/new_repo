package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex4ABmdIn_UdpUniRtmpHLSDashOut extends FlexBaseClass{
	
	@Test
	public void BmdIn_UdpUniRtmpHLSDashOut() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex4ABmdIn_UdpUniRtmpHLSDashOut");
	    FlexInput BmdIn = PageFactory.initElements(driver,FlexInput.class);
	    BmdIn.Flex_RawInput("Video_device_5","Audio_device_5");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_NTSC_720());
	    FlexOutput UdpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    UdpOutput.Flex_UdpOutput("UDP","10.0.0.4","6500",Profile.BITRATE_NTSC_720());
	    UdpOutput.AddOutput();
	    FlexOutput RtmpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    RtmpOutput.Flex_RtmpOutput("RTMP","bmdrtmp","rtmp://10.0.0.201:1935/live");
	    RtmpOutput.AddOutput();
	    FlexOutput hls = PageFactory.initElements(driver,FlexOutput.class);
	    hls.Flex_Streamer("hls_bmd","HLS");
	    hls.AddStreamer();
	    hls.AddOutput();
	    FlexOutput dash = PageFactory.initElements(driver,FlexOutput.class);
	    dash.Flex_Streamer("dash_bmd","DASH");
	    dash.AddFlexJob();
	    
		
	}

}
