package testCasesSmoke.RawInputSmoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.Job_type;
import pagesSmoke.XportInput;
import pagesSmoke.XportJobData;
import pagesSmoke.XportOutput;
import pagesSmoke.XportProfile;
import testCasesSmoke.XportSmokeTest.BaseClassXportSmokeTest;

public class SmokeXport4aBMD_UDP extends RawInputBase {
	
	@Test
	public void smokeXport4aBMD_UDP() throws Exception {
		
		Job_type jobType= PageFactory.initElements(driver, Job_type.class);
		jobType.xportJob();
		jobType.newJob();
		//
		XportJobData job= PageFactory.initElements(driver, XportJobData.class);
		job.jobData("SmokeXport4aBMD_UDP", "xport");
		
		XportInput in= PageFactory.initElements(driver, XportInput.class);
		in.RAWinput(data.bmdVideoDevice(), data.bmdAudioDevice(), data.bmdVideoInterface());
		
		XportProfile pro= PageFactory.initElements(driver, XportProfile.class);
		pro.addProfile(profile.profile_pal_360());
		
		XportOutput out= PageFactory.initElements(driver, XportOutput.class);
		out.udpOutput(data.systemIP(), "1032");
		
		job.saveJob();
		
	}

}
