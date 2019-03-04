package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex12FileMultiProfile_RTMP_RTSP extends FlexBaseClass{
	
	@Test
	public void FileMultiProfile_RTMP_RTSP() throws Exception 
	
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();
		FlexJobData JobData = PageFactory.initElements(driver, FlexJobData.class);
		JobData.FlexJobDataInfo("SmokeFlex12FileMultiProfile_RTMP_RTSP");
		FlexInput FileInput = PageFactory.initElements(driver, FlexInput.class);
		FileInput.Flex_FileStreamInput("/storage/device/Test_vectors/SidilaBharava.mp4");
		FlexProfile Preset_1 = PageFactory.initElements(driver, FlexProfile.class);
		Preset_1.FlexProfilePreview(Profile.PROFILE_HD_360());
		FlexProfile Preset_2 = PageFactory.initElements(driver, FlexProfile.class);
		Preset_2.FlexProfilePreview(Profile.PROFILE_HD_480());
		FlexOutput rtsp = PageFactory.initElements(driver,FlexOutput.class);
		rtsp.Flex_RtspStreamer("rtsp_01");
		rtsp.AddStreamer();
		rtsp.AddOutput();
		FlexOutput rtmp = PageFactory.initElements(driver,FlexOutput.class);
		rtmp.Flex_RtmpStreamer("rtmp_01");
		rtmp.AddStreamer();
		rtmp.AddFlexJob();

	}

}
