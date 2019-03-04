package testCasesSmoke.FlexSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.FlexInput;
import pagesSmoke.FlexJobData;
import pagesSmoke.FlexOutput;
import pagesSmoke.FlexProfile;

public class SmokeFlex5AUdpMulticastMP4Output extends FlexBaseClass{
	

	@Test
	public void UdpMulticastMP4Output() throws Exception
	{

		FlexJobData JobInfo = PageFactory.initElements(driver, FlexJobData.class);
		JobInfo.NavigateToNew();	
	    FlexJobData JobData = PageFactory.initElements(driver,FlexJobData.class);
	    JobData.FlexJobDataInfo("SmokeFlex5AUdpMulticastMP4Output");
	    FlexInput UdpInput = PageFactory.initElements(driver,FlexInput.class);
	    UdpInput.Flex_UdpInput("224.0.1.2","6000","eno2");
	    FlexProfile Preset_1 = PageFactory.initElements(driver,FlexProfile.class);
	    Preset_1.FlexProfilePreview(Profile.PROFILE_HD_720());
	    FlexOutput FileOutput = PageFactory.initElements(driver,FlexOutput.class);
	    FileOutput.Flex_FileStreamOutput("FileStream","/storage/device/File_Output/UdpInputMP4Output.mp4");
	    FileOutput.AddFlexJob();
		
	}

}
