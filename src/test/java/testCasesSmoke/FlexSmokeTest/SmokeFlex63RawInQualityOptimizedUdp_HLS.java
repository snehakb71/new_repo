package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex63RawInQualityOptimizedUdp_HLS extends FlexBaseClass{
	
	@Test
	public void RawInQualityOptimizedUdp_HLS() throws Exception {

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();
		FlexJobData JobData = PageFactory.initElements(driver, FlexJobData.class);
		JobData.FlexJobDataInfo("SmokeFlex63RawInQualityOptimizedUdp_HLS");
		FlexInput RawIn = PageFactory.initElements(driver, FlexInput.class);
		RawIn.Flex_RawInput("Video_device_5", "Audio_device_5");
		FlexProfile Preset_1 = PageFactory.initElements(driver, FlexProfile.class);
		Preset_1.FlexProfileOptimized(Profile.PROFILE_NTSC_720());
		FlexOutput UdpOutput = PageFactory.initElements(driver, FlexOutput.class);
		UdpOutput.Flex_UdpOutput("UDP", "10.0.104.2", "7724",Profile.BITRATE_NTSC_720());
		UdpOutput.AddOutput();
		FlexOutput hls = PageFactory.initElements(driver, FlexOutput.class);
		hls.Flex_Streamer("hlsquality","HLS");
		hls.AddStreamer();
		hls.AddFlexJob();

	}



}
