package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex27UdpOutbandCueOutAndDurationHLSOutput extends FlexBaseClass{
	
	@Test
	public void UdpOutbandCueOutAndDurationHLSOutput() throws Exception {

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();
		FlexJobData JobData = PageFactory.initElements(driver, FlexJobData.class);
		JobData.FlexJobDataInfo("SmokeFlex27UdpOutbandCueOutAndDurationHLSOutput");
		FlexInput UdpInput = PageFactory.initElements(driver, FlexInput.class);
		UdpInput.Flex_UdpInput(Info.UdpInputIP(), "6000", "eno2");
		UdpInput.EnableMetaData();
		FlexInput APIcod = PageFactory.initElements(driver, FlexInput.class);
		APIcod.ApiCueOutAndDuration("CUE TONE");
		FlexProfile ProfileMeta = PageFactory.initElements(driver, FlexProfile.class);
		ProfileMeta.FlexProfileMetaData(Profile.PROFILE_HD_480());
		FlexOutput hls = PageFactory.initElements(driver, FlexOutput.class);
		hls.Flex_Streamer("hlscod", "HLS");
		hls.EnableAddMuxOverhead();
		hls.EnableCuetoneInManifest();
		hls.EnableCuetoneSpliceInfo();
		hls.EnableCuetoneTimedMeta();
		hls.AddStreamer();
		hls.AddFlexJob();

	}

}
