package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex5BMP4InputMP4Output extends FlexBaseClass{
	

	@Test
	public void MP4InputMP4Output() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex5BMP4InputMP4Output");
	    FlexInput FileInput = PageFactory.initElements(driver,FlexInput.class);
	    FileInput.Flex_FileStreamInput("/storage/device/File_Output/UdpInputMP4Output.mp4");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_HD_720());
	    FlexOutput FileOutput = PageFactory.initElements(driver,FlexOutput.class);
	    FileOutput.Flex_FileStreamOutput("FileStream","/storage/device/File_Output/MP4Input_MP4Output.mp4");
	    FileOutput.AddFlexJob();
		
	}

}
