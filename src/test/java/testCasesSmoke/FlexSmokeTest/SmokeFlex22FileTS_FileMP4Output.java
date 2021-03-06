package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex22FileTS_FileMP4Output extends FlexBaseClass{
	
	@Test
	public void FileTS_FileMP4Output() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex22FileTS_FileMP4Output");
	    FlexInput FileInput = PageFactory.initElements(driver,FlexInput.class);
	    FileInput.Flex_FileStreamInput("/storage/device/Test_vectors/Dtph.ts");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_HD_720());
	    FlexOutput FileOutput = PageFactory.initElements(driver,FlexOutput.class);
	    FileOutput.Flex_FileStreamOutput("FileStream","/storage/device/File_Output/FileTS_FileMP4.mp4");
	    FileOutput.AddFlexJob();
		
	}

}
