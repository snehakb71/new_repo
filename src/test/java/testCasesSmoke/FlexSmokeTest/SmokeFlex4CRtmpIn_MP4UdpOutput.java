package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex4CRtmpIn_MP4UdpOutput extends FlexBaseClass {

	@Test
	public void RtmpIn_MP4UdpOutput() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex4CRtmpIn_MP4UdpOutput");
	    FlexInput RtmpInput = PageFactory.initElements(driver,FlexInput.class);
	    RtmpInput.Flex_RtmpInput(Info.InputRtmpurl(),"bmdrtmp");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_PAL_544());
	    FlexOutput FileOutput = PageFactory.initElements(driver,FlexOutput.class);
	    FileOutput.Flex_FileStreamOutput("FileStream","/storage/device/File_Output/RtmpIn_Mp4Out.mp4");
	    FileOutput.AddOutput();
	    FlexOutput UdpOutput = PageFactory.initElements(driver,FlexOutput.class);
	    UdpOutput.Flex_UdpOutput("UDP","10.0.104.2","6501",Profile.BITRATE_PAL_544());
	    UdpOutput.AddOutput();
	    UdpOutput.AddFlexJob();

}
}