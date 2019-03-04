package testCasesSmoke.XportSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.Job_type;
import pagesSmoke.XportInput;
import pagesSmoke.XportJobData;
import pagesSmoke.XportOutput;
import pagesSmoke.XportProfile;

public class SmokeXport_Magewell_UDP extends BaseClassXportSmokeTest {
	
	@Test
	public void smokeXport_Magewell_UDP() throws Exception {
		
		Job_type jobType= PageFactory.initElements(driver, Job_type.class);
		jobType.xportJob();
		jobType.newJob();
		XportJobData job= PageFactory.initElements(driver, XportJobData.class);
		job.jobData("SmokeXport_Magewell_UDP", "xport");
		//
		XportInput in= PageFactory.initElements(driver, XportInput.class);
		in.RAWinput(data.magewellVideoDevice(), data.magewellAudioDevice(), data.magewellVideoInterface());
		
		XportProfile pro= PageFactory.initElements(driver, XportProfile.class);
		pro.addProfile(profile.profile_hd_640());
		
		XportOutput out= PageFactory.initElements(driver, XportOutput.class);
		out.udpOutput(data.systemIP(), "1030");
		
		job.saveJob();
		
	}

}
