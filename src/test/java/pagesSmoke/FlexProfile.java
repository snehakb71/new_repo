package pagesSmoke;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

	@FindBy(id = "show_profile")
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

	@FindBy(id = "metatrack_track_text")
	@CacheLookup
	WebElement SelectMetadata;

	@FindBy(id = "show_meta_track")
	@CacheLookup
	WebElement AddMetaTrack;

	@FindBy(id = "meta_track_name")
	@CacheLookup
	WebElement SelectMetaTrack;

	@FindBy(id = "add_meta_track")
	@CacheLookup
	WebElement Addmetatdata;

	@FindBy(id = "show_advanced_parameter_1")
	@CacheLookup
	WebElement AdvancedParameter;

	@FindBy(id = "video_codec_type_1")
	@CacheLookup
	WebElement SelectQualityOptimized;

	/* ****************** FLEX PROFILE IMAGE OVERLAY**************************** */

	@FindBy(id = "image_overlay_status_1_1")
	@CacheLookup
	WebElement EnableImageOverlay;

	@FindBy(id = "overlay_image_position_1_1_1")
	@CacheLookup
	WebElement ImageSelectPosition;

	@FindBy(xpath = "overlay_image_width_height_1_1_1")
	@CacheLookup
	WebElement ImageEnableScalarID;

	@FindBy(id = "overlay_image_width_1_1_1")
	@CacheLookup
	WebElement ImageWidth;

	@FindBy(id = "overlay_image_height_1_1_1")
	@CacheLookup
	WebElement ImageHeight;

	@FindBy(id = "overlay_image_offset_x_1_1_1")
	@CacheLookup
	WebElement ImageOffsetX;

	@FindBy(id = "overlay_image_offset_y_1_1_1")
	@CacheLookup
	WebElement ImageOffsetY;

	@FindBy(xpath = "//a[@data-url='/storage/device/Images']")
	@CacheLookup
	WebElement ClickImagesFolder;

	/* ****************** FLEX PROFILE TEXT OVERLAY**************************** */

	@FindBy(id = "text_overlay_status_1_1")
	@CacheLookup
	WebElement EnableTextOverlay;

	@FindBy(id = "overlay_text_position_1_1_1")
	@CacheLookup
	WebElement TextSelectPosition;

	@FindBy(xpath = "overlay_text_scroll_1_1_1")
	@CacheLookup
	WebElement TextScrollType;

	@FindBy(id = "overlay_text_1_1_1")
	@CacheLookup
	WebElement TextBox;

	@FindBy(id = "overlay_text_scroll_time_1_1_1")
	@CacheLookup
	WebElement TextScrollTime;

	@FindBy(id = "overlay_text_offset_x_1_1_1")
	@CacheLookup
	WebElement TextOffsetX;

	@FindBy(id = "overlay_text_offset_y_1_1_1")
	@CacheLookup
	WebElement TextOffsetY;

	@FindBy(id = "overlay_overlay_font_style_1_1_1")
	@CacheLookup
	WebElement TextFontStyle;

	@FindBy(id = "overlay_text_font_size_1_1_1")
	@CacheLookup
	WebElement TextFontSize;

	@FindBy(id = "overlay_text_enable_shadow_1_1_1")
	@CacheLookup
	WebElement TextEnableShadow;

	@FindBy(id = "overlay_text_enable_outline_box_1_1_1")
	@CacheLookup
	WebElement TextEnableOutlineBox;

	@FindBy(id = "overlay_text_enable_outline_1_1_1")
	@CacheLookup
	WebElement TextEnableOutlineColorBox;

	@FindBy(id = "overlay_text_outline_color_1_1_1")
	@CacheLookup
	WebElement TextOutlineColor;

	@FindBy(id = "overlay_text_color_1_1_1")
	@CacheLookup
	WebElement TextFontColor;

	@FindBy(id = "overlay_text_scroll_start_1_1_1")
	@CacheLookup
	WebElement TextScrollStart;

	/* ****************** FLEX PROFILE TIME OVERLAY**************************** */

	@FindBy(id = "time_overlay_status_1_1")
	@CacheLookup
	WebElement EnableTimeOverlay;

	@FindBy(id = "overlay_time_overlay_position_1_1_1")
	@CacheLookup
	WebElement TimeSelectPosition;

	@FindBy(id = "overlay_time_text_1_1_1")
	@CacheLookup
	WebElement TimeTextBox;

	@FindBy(id = "overlay_time_offset_x_1_1_1")
	@CacheLookup
	WebElement TimeOffsetX;

	@FindBy(id = "overlay_time_offset_y_1_1_1")
	@CacheLookup
	WebElement TimeOffsetY;

	@FindBy(id = "overlay_time_font_name_1_1_1")
	@CacheLookup
	WebElement TimeFontStyle;

	@FindBy(id = "overlay_time_font_size_1_1_1")
	@CacheLookup
	WebElement TimeFontSize;

	@FindBy(id = "overlay_time_enable_shadow_1_1_1")
	@CacheLookup
	WebElement TimeEnableShadow;

	@FindBy(id = "overlay_time_enable_outline_box_1_1_1")
	@CacheLookup
	WebElement TimeEnableOutlineBox;

	@FindBy(id = "overlay_time_enable_outline_1_1_1")
	@CacheLookup
	WebElement TimeEnableOutlineColorBox;

	@FindBy(id = "overlay_time_outline_color_1_1_1")
	@CacheLookup
	WebElement TimeOutlineColor;

	@FindBy(id = "overlay_time_color_1_1_1")
	@CacheLookup
	WebElement TimeFontColor;

	@FindBy(id = "overlay_time_frame_index_1_1_1")
	@CacheLookup
	WebElement EnableTimeFrameIndex;

	@FindBy(id = "overlay_time_enable_countdown_1_1_1")
	@CacheLookup
	WebElement EnableCountdownTimer;

	@FindBy(id = "overlay_time_countdown_timer_1_1_1")
	@CacheLookup
	WebElement CountdownTimerInSeconds;

	/* ****************** FLEX PROFILE CLOCK OVERLAY**************************** */

	@FindBy(id = "clock_overlay_status_1_1")
	@CacheLookup
	WebElement EnableClockOverlay;

	@FindBy(id = "overlay_clock_overlay_position_1_1_1")
	@CacheLookup
	WebElement ClockSelectPosition;

	@FindBy(id = "overlay_clock_offset_x_1_1_1")
	@CacheLookup
	WebElement ClockTextBox;

	@FindBy(id = "overlay_clock_offset_x_1_1_1")
	@CacheLookup
	WebElement ClockOffsetX;

	@FindBy(id = "overlay_clock_offset_y_1_1_1")
	@CacheLookup
	WebElement ClockOffsetY;

	@FindBy(id = "overlay_clock_font_name_1_1_1")
	@CacheLookup
	WebElement ClockFontStyle;

	@FindBy(id = "overlay_clock_font_size_1_1_1")
	@CacheLookup
	WebElement ClockFontSize;

	@FindBy(id = "overlay_clock_enable_shadow_1_1_1")
	@CacheLookup
	WebElement ClockEnableShadow;

	@FindBy(id = "overlay_clock_enable_outline_box_1_1_1")
	@CacheLookup
	WebElement ClockEnableOutlineBox;

	@FindBy(id = "overlay_clock_enable_outline_1_1_1")
	@CacheLookup
	WebElement ClockEnableOutlineColorBox;

	@FindBy(id = "overlay_clock_outline_color_1_1_1")
	@CacheLookup
	WebElement ClockOutlineColor;

	@FindBy(id = "overlay_clock_color_1_1_1")
	@CacheLookup
	WebElement ClockFontColor;

	/*********************************************************************************************************************************/

	public void FlexProfileOnly(String Preset) throws InterruptedException

	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,250)");
		ClickProfile.click();
		Thread.sleep(500);
		SelectPreset.click();
		new Select(SelectPreset).selectByVisibleText(Preset);

	}

	public void FlexProfilePreview(String Preset) throws InterruptedException

	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,250)");
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

	public void FlexProfileMetaData(String Preset) throws InterruptedException

	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,250)");
		ClickProfile.click();
		Thread.sleep(500);
		SelectPreset.click();
		new Select(SelectPreset).selectByVisibleText(Preset);
		EnableStreamPreview.click();
		Thread.sleep(500);
		SelectMetadata.click();
		Thread.sleep(500);
		AddMetaTrack.click();
		Thread.sleep(500);
		SelectMetaTrack.click();
		new Select(SelectMetaTrack).selectByVisibleText("1_CUE");
		Addmetatdata.click();
		Thread.sleep(500);
		UpdateProfile.click();
		Thread.sleep(500);

	}

	public void AddProfile() throws InterruptedException {

		ClickProfile.click();
		Thread.sleep(500);

	}

	public void FlexProfileOptimized(String preset) throws InterruptedException

	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,250)");
		ClickProfile.click();
		Thread.sleep(500);
		SelectPreset.click();
		new Select(SelectPreset).selectByVisibleText(preset);
		EditPreset_1.click();
		Thread.sleep(500);
		EnableStreamPreview.click();
		Thread.sleep(500);
		AdvancedParameter.click();
		Thread.sleep(500);
		SelectQualityOptimized.click();
		new Select(SelectQualityOptimized).selectByVisibleText("Quality Optimized");
		Thread.sleep(500);
		UpdateProfile.click();
		Thread.sleep(500);

	}

	/* ****************** OVERLAYS **************************** */

	public void OverlayProfile(String Preset) throws InterruptedException

	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,250)");
		ClickProfile.click();
		Thread.sleep(500);
		SelectPreset.click();
		new Select(SelectPreset).selectByVisibleText(Preset);
		EditPreset_1.click();
		Thread.sleep(500);
		EnableStreamPreview.click();
		Thread.sleep(500);

	}

	public void ShowAdvanced()

	{

		Actions act = new Actions(driver);
		act.moveToElement(AdvancedParameter).click().build().perform();

	}

	public void ScrollDown() throws InterruptedException {

		WebElement snapshot_list = driver.findElement(By.id("profile_modal"));
		Actions scrolldown = new Actions(driver);
		scrolldown.moveToElement(snapshot_list).build().perform();
		snapshot_list.click();
		scrolldown.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(500);

	}

	public void TextOverlay(String Text, String Position, String ScrollType, String ScrollTime, String FontStyle,
			String FontSize, String TextColorOutline, String TextColor) throws InterruptedException

	{

		EnableTextOverlay.click();
		Thread.sleep(500);
		TextBox.clear();
		TextBox.sendKeys(Text);
		TextSelectPosition.click();
		new Select(TextSelectPosition).selectByVisibleText(Position);
		TextScrollType.click();
		new Select(TextScrollType).selectByVisibleText(ScrollType);
		TextScrollTime.clear();
		TextScrollTime.sendKeys(ScrollTime);
		TextFontStyle.click();
		new Select(TextFontStyle).selectByVisibleText(FontStyle);
		TextFontStyle.click();
		new Select(TextFontSize).selectByVisibleText(FontSize);
		TextEnableShadow.click();
		Actions act = new Actions(driver);
		act.moveToElement(TextEnableOutlineBox).click().build().perform();
		Actions act1 = new Actions(driver);
		act1.moveToElement(TextEnableOutlineColorBox).click().build().perform();
		TextOutlineColor.clear();
		TextOutlineColor.sendKeys(TextColorOutline);
		TextFontColor.clear();
		TextFontColor.sendKeys(TextColor);

	}

	public void TextOffSet(String OffsetY, String OffsetX) throws InterruptedException

	{

		TextOffsetX.clear();
		TextOffsetX.sendKeys("6");
		TextOffsetY.clear();
		TextOffsetY.sendKeys(OffsetY);
		Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.id("overlay_text_offset_y_1_1_1"));
		actions.moveToElement(mainMenu);
		WebElement subMenu = driver.findElement(By.id("overlay_text_offset_x_1_1_1"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		TextOffsetX.clear();
		TextOffsetX.sendKeys(OffsetX);

	}

	public void ProfileUpdate() throws InterruptedException

	{

		UpdateProfile.click();
		Thread.sleep(500);

	}

}
