package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex29UdpInbandHLSOutput extends FlexBaseClass{
	

	@Test
	public void UdpInbandHLSOutput () throws Exception {

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();
		FlexJobData JobData = PageFactory.initElements(driver, FlexJobData.class);
		JobData.FlexJobDataInfo("SmokeFlex29UdpInbandHLSOutput");
		FlexInput UdpInput = PageFactory.initElements(driver, FlexInput.class);
		UdpInput.Flex_UdpInput(Info.UdpInputIP(), "6000", "eno2");
		UdpInput.EnableMetaData();
		FlexInput inband = PageFactory.initElements(driver, FlexInput.class);
		inband.Inband("CUE TONE");
		FlexProfile ProfileMeta = PageFactory.initElements(driver, FlexProfile.class);
		ProfileMeta.FlexProfileMetaData(Profile.PROFILE_HD_1080());
		FlexOutput hls = PageFactory.initElements(driver, FlexOutput.class);
		hls.Flex_Streamer("hlsinband", "HLS");
		hls.EnableAddMuxOverhead();
		hls.EnableCuetoneInManifest();
		hls.EnableCuetoneSpliceInfo();
		hls.EnableCuetoneTimedMeta();
		hls.AddStreamer();
		hls.AddFlexJob();

	}

}
