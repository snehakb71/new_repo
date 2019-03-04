package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex11UdpMultiProfile_HLS_DASH_MSS_HDS extends FlexBaseClass {

	@Test
	public void UdpMultiProfile_HLS_DASH_MSS_HDS() throws Exception 
	
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();
		FlexJobData JobData = PageFactory.initElements(driver, FlexJobData.class);
		JobData.FlexJobDataInfo("SmokeFlex11UdpMultiProfile_HLS_DASH_MSS_HDS");
		FlexInput UdpInput = PageFactory.initElements(driver, FlexInput.class);
		UdpInput.Flex_UdpInput("224.0.3.1", "6000", "eno2");
		FlexProfile Preset_1 = PageFactory.initElements(driver, FlexProfile.class);
		Preset_1.FlexProfilePreview(Profile.PROFILE_HD_480());
		FlexProfile Preset_2 = PageFactory.initElements(driver, FlexProfile.class);
		Preset_2.FlexProfilePreview(Profile.PROFILE_HD_720());
		FlexOutput Hls = PageFactory.initElements(driver,FlexOutput.class);
		Hls.Flex_Streamer("hls_01", "HLS");
		Hls.AddStreamer();
		Hls.AddOutput();
		FlexOutput Dash = PageFactory.initElements(driver,FlexOutput.class);
		Dash.Flex_Streamer("dash_01", "DASH");
		Dash.AddStreamer();
		Dash.AddOutput();
		FlexOutput Mss = PageFactory.initElements(driver,FlexOutput.class);
		Mss.Flex_Streamer("mss_01", "MSS");
		Mss.AddStreamer();
		Mss.AddOutput();
		FlexOutput Hds = PageFactory.initElements(driver,FlexOutput.class);
		Hds.Flex_Streamer("hds_01", "HDS");
		Hds.AddStreamer();
		Hds.AddFlexJob();

	}

}
