package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProfileVersa {
	
WebDriver driver;
	
	public ProfileVersa()
	{
		this.driver= driver;
	}
	
	@FindBy(id="show_profile")
	@CacheLookup
	WebElement show_pro;
	
	@FindBy(id="pfmt_profile_preset")
	@CacheLookup
	WebElement profile;
	
	@FindBy(id="add_audio")
	@CacheLookup
	WebElement sec_audio;
	
	@FindBy(id="add_video")
	@CacheLookup
	WebElement sec_video;
	
	@FindBy(id="resolution_2")
	@CacheLookup
	WebElement resloution2;
	
	@FindBy(id="video_track_name_1")
	@CacheLookup
	WebElement video1_tack;
	
	@FindBy(id="video_track_name_2")
	@CacheLookup
	WebElement video2_tack;
	
	@FindBy(id="profile_next")
	@CacheLookup
    WebElement pro_next;
	
	// * * * * * * * * * * * single profile locotors * * * * * * * * * * *
	
	public void profile_select(String profile1) throws Exception
	{
		Thread.sleep(1000);
		show_pro.click();
		new Select(profile).selectByVisibleText(profile1);
		
	}
	
	public void profile_next()
	{
		pro_next.click();
	}

	// * * * * * * * * * * * Multi profile locotors * * * * * * * * * * *
	
	public void profile_multiselect(String profile1, String profile2, String profile3 )
	{
		show_pro.click();
		new Select(profile).selectByVisibleText(profile1);
		show_pro.click();
		new Select(profile).selectByVisibleText(profile2);
		show_pro.click();
		new Select(profile).selectByVisibleText(profile3);
		pro_next.click();
	}
	
	// * * * * * * * * * * *mpts profile locotors * * * * * * * * * * *
	
	public void multitracks(String profile1, String reslo)
	{
		show_pro.click();
		new Select(profile).selectByVisibleText(profile1);
		new Select(resloution2).selectByVisibleText(reslo);
		new Select(video2_tack).selectByVisibleText("2_Video");
		
	}

}
