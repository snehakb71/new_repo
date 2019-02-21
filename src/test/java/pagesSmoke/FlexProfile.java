package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlexProfile {

	WebDriver driver;

	public FlexProfile(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* ****************** FLEX PROFILE **************************** */

	@FindBy(linkText = "Add Profile")
	@CacheLookup
	WebElement ClickProfile;

	@FindBy(id = "pfmt_profile_preset")
	@CacheLookup
	WebElement SelectPreset;

	@FindBy(xpath = "//*[@id=\"pfmt_profile_row_1\"]/div[1]/div[1]")
	@CacheLookup
	WebElement EditPreset_1;

	@FindBy(id = "profile_preview_status")
	@CacheLookup
	WebElement EnableStreamPreview;

	@FindBy(id = "profile_update")
	@CacheLookup
	WebElement UpdateProfile;

	/*********************************************************************************************************************************/

	public void FlexProfileOnly(String Preset) throws InterruptedException

	{
		ClickProfile.click();
		Thread.sleep(500);
		SelectPreset.click();
		new Select(SelectPreset).selectByVisibleText(Preset);

	}

	public void FlexProfilPreview(String Preset) throws InterruptedException

	{
		ClickProfile.click();
		Thread.sleep(500);
		SelectPreset.click();
		new Select(SelectPreset).selectByVisibleText(Preset);
		EditPreset_1.click();
		Thread.sleep(500);
		EnableStreamPreview.click();
		Thread.sleep(500);
		UpdateProfile.click();
		Thread.sleep(500);

	}

}
