package testCasesSmoke.XportSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.Job_type;
import pagesSmoke.XportInput;
import pagesSmoke.XportJobData;
import pagesSmoke.XportOutput;
import pagesSmoke.XportProfile;

public class SmokeXport_UDP_SRTserver extends BaseClassXportSmokeTest {
	
	@Test
	public void smokeXport_UDP_SRTserver() throws Exception {
		
		Job_type jobType= PageFactory.initElements(driver, Job_type.class);
		jobType.xportJob();
		
		XportJobData job= PageFactory.initElements(driver, XportJobData.class);
		job.jobData("SmokeXport_UDP_SRTserver", "xport");
		
		XportInput in= PageFactory.initElements(driver, XportInput.class);
		in.udpInput(data.udpInputIPaddress(), data.udpPort(), data.networkInterfaceStatic());
		
		XportProfile pro= PageFactory.initElements(driver, XportProfile.class);
		pro.addProfile(profile.profile_pal_544());
		
		XportOutput out= PageFactory.initElements(driver, XportOutput.class);
		out.srtOutput("1028");
		
		job.saveJob();
	}

}
