package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class XportProfile {
	
	WebDriver driver;

	public XportProfile(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* ****************** XPORT PROFILE **************************** */

	@FindBy(id="show_profile")
	@CacheLookup
	WebElement addProfile;

	@FindBy(id = "pfmt_profile_preset")
	@CacheLookup
	WebElement selectPreset;
	
	/* ****************** edit PROFILE **************************** */

	@FindBy(xpath = "//div[@onclick=\"edit_pfmt_profile(1)\"]")
	@CacheLookup
	WebElement editProfile;

	@FindBy(id = "profile_preview_status")
	@CacheLookup
	WebElement streamPreview;

	@FindBy(id = "profile_update")
	@CacheLookup
	WebElement updateProfile;
	
	/* ****************** advance video parameters **************************** */
	
	@FindBy(id = "show_advanced_parameter_1")
	@CacheLookup
	WebElement advanceParamVideo;
	
	@FindBy(id = "video_codec_type_1")
	@CacheLookup
	WebElement compliance;

	/*********************************************************************************************************************************/

	public void addProfile(String Preset) throws InterruptedException	{
		
		addProfile.click();
		Thread.sleep(500);
		selectPreset.click();
		new Select(selectPreset).selectByVisibleText(Preset);
	}
	
	public void editProfile() throws Exception {
			
		editProfile.click();
		Thread.sleep(500);
	}
		
	public void updateProfile() throws Exception {
			
		updateProfile.click();
		Thread.sleep(500);
	}

	public void enableProfilePreview() throws Exception	{
				
		streamPreview.click();
		//Thread.sleep(500);
	}
		
	public void selectCompliance() throws Exception {
				
		advanceParamVideo.click();
		Thread.sleep(500);
		new Select(compliance).selectByVisibleText("Quality Optimized");
		//Thread.sleep(500);		
	}

}
