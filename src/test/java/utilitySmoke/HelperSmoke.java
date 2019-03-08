package utilitySmoke;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class HelperSmoke {
	
	
	
WebDriver driver;
	
	public static void screenShoot(WebDriver driver, String imagename) throws Exception
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./ScreenShot/"+imagename+".png"));
	}

}
