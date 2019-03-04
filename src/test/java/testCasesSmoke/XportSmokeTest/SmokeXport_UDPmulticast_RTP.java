package testCasesSmoke.XportSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.Job_type;
import pagesSmoke.XportInput;
import pagesSmoke.XportJobData;
import pagesSmoke.XportOutput;
import pagesSmoke.XportProfile;

public class SmokeXport_UDPmulticast_RTP extends BaseClassXportSmokeTest {
	
	@Test
	public void smokeXport_UDPmulticast_RTP() throws Exception {
		
		Job_type jobType= PageFactory.initElements(driver, Job_type.class);
		jobType.xportJob();
		jobType.newJob();
		XportJobData job= PageFactory.initElements(driver, XportJobData.class);
		job.jobData("SmokeXport_UDPmulticast_RTP", "xport");
		
		XportInput in= PageFactory.initElements(driver, XportInput.class);
		in.udpInput(data.udpInputIPaddress(), data.udpPort(), data.networkInterfaceStatic());
		
		XportProfile pro= PageFactory.initElements(driver, XportProfile.class);
		pro.addProfile(profile.profile_pal_360());
		
		XportOutput out= PageFactory.initElements(driver, XportOutput.class);
		out.rtpOutput(data.systemIP(), "1026");
		
		job.saveJob();
		
	}

}
