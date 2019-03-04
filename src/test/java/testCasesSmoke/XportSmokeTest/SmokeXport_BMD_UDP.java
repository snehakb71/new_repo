package testCasesSmoke.XportSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.Job_type;
import pagesSmoke.XportInput;
import pagesSmoke.XportJobData;
import pagesSmoke.XportOutput;
import pagesSmoke.XportProfile;

public class SmokeXport_BMD_UDP extends BaseClassXportSmokeTest {
	
	@Test
	public void smokeXport_BMD_UDP() throws Exception {
		
		Job_type jobType= PageFactory.initElements(driver, Job_type.class);
		jobType.xportJob();
		jobType.newJob();
		//
		XportJobData job= PageFactory.initElements(driver, XportJobData.class);
		job.jobData("SmokeXport_BMD_UDP", "xport");
		
		XportInput in= PageFactory.initElements(driver, XportInput.class);
		in.RAWinput(data.bmdVideoDevice(), data.bmdAudioDevice(), data.bmdVideoInterface());
		
		XportProfile pro= PageFactory.initElements(driver, XportProfile.class);
		pro.addProfile(profile.profile_pal_360());
		
		XportOutput out= PageFactory.initElements(driver, XportOutput.class);
		out.udpOutput(data.systemIP(), "1032");
		
		job.saveJob();
		
	}

}
