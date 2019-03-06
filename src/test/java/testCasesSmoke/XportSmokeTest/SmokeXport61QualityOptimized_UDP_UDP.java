package testCasesSmoke.XportSmokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagesSmoke.Job_type;
import pagesSmoke.XportInput;
import pagesSmoke.XportJobData;
import pagesSmoke.XportOutput;
import pagesSmoke.XportProfile;

public class SmokeXport61QualityOptimized_UDP_UDP extends BaseClassXportSmokeTest {
	
	@Test
	public void smokeXport61qualityOptimized_UDP_UDP() throws Exception {
		
		Job_type jobType= PageFactory.initElements(driver, Job_type.class);
		jobType.xportJob();
		jobType.newJob();
		
		XportJobData job= PageFactory.initElements(driver, XportJobData.class);
		job.jobData("SmkXpt61QualityOptiUDP_UDP", "xport");
		
		XportInput in= PageFactory.initElements(driver, XportInput.class);
		in.udpInput(data.udpInputIPaddress(), data.udpPort(), data.networkInterfaceStatic());
		
		XportProfile pro= PageFactory.initElements(driver, XportProfile.class);
		pro.addProfile(profile.profile_pal_544());
		pro.editProfile();
		pro.selectCompliance();
		pro.updateProfile();
		
		XportOutput out= PageFactory.initElements(driver, XportOutput.class);
		out.udpOutput(data.systemIP(), "1027");
		
		job.saveJob();
		
	}

}
