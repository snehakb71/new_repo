package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex26UdpOutbandCueOutAndCueInHLSOutput extends FlexBaseClass {

	@Test
	public void UdpOutbandCueOutAndCueInHLSOutput() throws Exception {

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();
		FlexJobData JobData = PageFactory.initElements(driver, FlexJobData.class);
		JobData.FlexJobDataInfo("SmokeFlex26UdpOutbandCueOutAndCueInHLSOutput");
		FlexInput UdpInput = PageFactory.initElements(driver, FlexInput.class);
		UdpInput.Flex_UdpInput(Info.UdpInputIP(), "6000", "eno2");
		UdpInput.EnableMetaData();
		FlexInput APIcoci = PageFactory.initElements(driver, FlexInput.class);
		APIcoci.ApiCueOutAndCueIn("CUE TONE");
		FlexProfile ProfileMeta = PageFactory.initElements(driver, FlexProfile.class);
		ProfileMeta.FlexProfileMetaData(Profile.PROFILE_HD_720());
		FlexOutput hls = PageFactory.initElements(driver, FlexOutput.class);
		hls.Flex_Streamer("hlscoci", "HLS");
		hls.EnableAddMuxOverhead();
		hls.EnableCuetoneInManifest();
		hls.EnableCuetoneSpliceInfo();
		hls.EnableCuetoneTimedMeta();
		hls.AddStreamer();
		hls.AddFlexJob();

	}

}