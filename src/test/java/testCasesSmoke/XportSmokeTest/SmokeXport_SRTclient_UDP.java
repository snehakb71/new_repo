package testCasesSmoke.XportSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.Job_type;
import pagesSmoke.XportInput;
import pagesSmoke.XportJobData;
import pagesSmoke.XportOutput;
import pagesSmoke.XportProfile;

public class SmokeXport_SRTclient_UDP extends BaseClassXportSmokeTest {
	
	@Test
	public void smokeXport_SRTclient_UDP() throws Exception {
		
		Job_type jobType= PageFactory.initElements(driver, Job_type.class);
		jobType.xportJob();
		
		XportJobData job= PageFactory.initElements(driver, XportJobData.class);
		job.jobData("SmokeXport_SRTclient_UDP", "xport");
		
		XportInput in= PageFactory.initElements(driver, XportInput.class);
		in.srtInput(data.serverIP(), "1028");
		
		XportProfile pro= PageFactory.initElements(driver, XportProfile.class);
		pro.addProfile(profile.profile_hd_424());
		
		XportOutput out= PageFactory.initElements(driver, XportOutput.class);
		out.udpOutput(data.systemIP(), "1029");
		
		job.saveJob();
	}

}
