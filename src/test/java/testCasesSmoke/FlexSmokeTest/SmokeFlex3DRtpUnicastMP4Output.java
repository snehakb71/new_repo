package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex3DRtpUnicastMP4Output extends FlexBaseClass{
	

	@Test
	public void RtpUnicastMP4Output() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex3DRtpUnicastMP4Output");
	    FlexInput RtpInput = PageFactory.initElements(driver,FlexInput.class);
	    RtpInput.Flex_RtpInputUnicast("10.0.0.4","6100");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_HD_480());
	    FlexOutput FileOutput = PageFactory.initElements(driver,FlexOutput.class);
	    FileOutput.Flex_FileStreamOutput("FileStream","/storage/device/File_Output/RTPInputMP4Output.mp4");
	    FileOutput.AddFlexJob();
		
	}

}
