package testCasesSmoke.VersaIpSmokeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pagesSmoke.InputVersa;
import pagesSmoke.Job_type;
import pagesSmoke.OutputVersa;
import pagesSmoke.ProfileVersa;

public class TestCase extends BaseClassSmokeTest {
	
	public WebDriver driver;

	public int rows;

	public int columns;

	@Test(dataProvider = "testdata")

	public void udp_all_flex(String baseUrl, String j_name, String ip_address, String inter_face, String vid_res,
			String output_1, String udp_address, String udp_port, String udp_bitrate) throws InterruptedException

	{

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(baseUrl);

		Thread.sleep(1000);

		driver.findElement(By.name("username")).clear();

		driver.findElement(By.name("username")).sendKeys("admin");

		driver.findElement(By.name("password")).clear();

		driver.findElement(By.name("password")).sendKeys("pixfix@123");

		driver.findElement(By.id("submitbutton")).click();

		Thread.sleep(1000);

		driver.findElement(By.linkText("Jobs")).click();

		Thread.sleep(1000);

		driver.findElement(By.linkText("PIXFIX Flex")).click();

		Thread.sleep(1000);

		driver.findElement(By.linkText("Add Job")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("job_name")).clear();

		driver.findElement(By.id("job_name")).sendKeys(j_name + '_' + vid_res);

		driver.findElement(By.id("job_description")).sendKeys("Flex");

		driver.findElement(By.id("udp_src_btn")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("udp_ip")).clear();

		driver.findElement(By.id("udp_ip")).sendKeys(ip_address);

		driver.findElement(By.id("udp_port")).clear();

		driver.findElement(By.id("udp_port")).sendKeys("6000");

		new Select(driver.findElement(By.id("udp_interface"))).selectByVisibleText(inter_face);

		driver.findElement(By.id("show_preset")).click();

		Thread.sleep(1000);

		new Select(driver.findElement(By.name("video_resolution"))).selectByVisibleText(vid_res);

		driver.findElement(By.id("output_block")).click();

		Thread.sleep(1000);

		new Select(driver.findElement(By.id("sink_type"))).selectByVisibleText(output_1);

		driver.findElement(By.id("udp_o_sink_multi_addr")).clear();

		driver.findElement(By.id("udp_o_sink_multi_addr")).sendKeys(udp_address);

		driver.findElement(By.id("udp_o_sink_port")).clear();

		driver.findElement(By.id("udp_o_sink_port")).sendKeys(udp_port);

		driver.findElement(By.id("muxer_bitrate")).clear();

		driver.findElement(By.id("muxer_bitrate")).sendKeys(udp_bitrate);

		driver.findElement(By.id("add_output")).click();

		Thread.sleep(1000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("scroll(0, 250)");

		driver.findElement(By.id("save_job")).click();

		Thread.sleep(1000);

		try

		{

			boolean b1 = driver
					.findElement(
							By.xpath("//a[@data-type='start' and @data-job_name='" + j_name + '_' + vid_res + "']"))
					.isDisplayed();

			if (b1 == true)

			{

				driver.findElement(
						By.xpath("//a[@data-type='start' and @data-job_name='" + j_name + '_' + vid_res + "']"))
						.click();

			}

		}

		catch (Exception e)

		{

			driver.close();

		}

		try

		{

			Thread.sleep(3000);

			driver.navigate().refresh();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//a[@data-type='stat' and @data-job_name='" + j_name + '_' + vid_res + "']")).click();
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();

			Thread.sleep(10000);

			 String s1 = driver.findElement(By.xpath(".//*[@id='job_stat_block']/div[1]/div/div/div/span[2]")).getText();

			 String s2 = driver.findElement(By.xpath(".//*[@id='job_stat_block']/div[1]/div/div/div/span[1]")).getText();

			String s3 = driver.findElement(By.id("job_stat_cpu_load")).getText();

			String s4 = driver.findElement(By.id("job_stat_cpu_load_avg")).getText();

			String s5 = driver.findElement(By.id("job_stat_memory_load")).getText();

			String s7 = driver.findElement(By.id("job_stat_avg_memory_load")).getText();

			String s8 = driver.findElement(By.id("job_stat_buffered_data")).getText();

			String s9 = driver.findElement(By.id("job_stat_latency")).getText();

			Actions ToolTip1 = new Actions(driver);

			WebElement googleLogo = driver.findElement(By.id("input_list_0_0"));

			Thread.sleep(1000);

			ToolTip1.clickAndHold(googleLogo).perform();

			String s10 = driver.findElement(By.id("input_list_0_0")).getText();

			String s11 = driver.findElement(By.id("input_stream_stat_bitrate_0_0")).getText();

			String s12 = driver.findElement(By.id("input_stream_stat_avg_bitrate_0_0")).getText();

			String s13 = driver.findElement(By.id("input_stream_stat_bytes_total_0_0")).getText();

			String s14 = driver.findElement(By.id("input_stream_stat_uptime_0_0")).getText();

			JavascriptExecutor jse1 = (JavascriptExecutor) driver;

			jse1.executeScript("scroll(0, 250)");

			String s15 = driver.findElement(By.id("pfmt_video_stat_bitrate_0_0")).getText();

			String s16 = driver.findElement(By.id("pfmt_video_stat_bitrate_avg_0_0")).getText();

			String s17 = driver.findElement(By.id("pfmt_video_stat_fps_0_0")).getText();

			String s18 = driver.findElement(By.id("pfmt_audio_stat_bitrate_0_0")).getText();

			String s19 = driver.findElement(By.id("pfmt_audio_stat_bitrate_avg_0_0")).getText();
			

			JavascriptExecutor jse2 = (JavascriptExecutor) driver;

			jse2.executeScript("scroll(0, 250)");

			Actions ToolTip2 = new Actions(driver);

			WebElement googleLogo1 = driver.findElement(By.id("output_stream_status_(0_0_0)"));

			ToolTip2.clickAndHold(googleLogo1).perform();

			String s20 = driver.findElement(By.id("output_stream_status_(0_0_0)")).getText();

			String s21 = driver.findElement(By.id("output_stream_stat_bitrate_0_0_0")).getText();

			String s22 = driver.findElement(By.id("output_stream_stat_bitrate_avg_0_0_0")).getText();

			String s23 = driver.findElement(By.id("output_stream_stat_bytes_total_0_0_0")).getText();

			String s24 = driver.findElement(By.id("output_stream_stat_uptime_0_0_0")).getText();

			String k = "Created Successfuly";

			Thread.sleep(3000);

			String c = ""+j_name+ '_'+vid_res+"  "+k+"  "+s1+"  "+s2+"  "+s3+"  "+s4+"  "+s5+"  "+s7+"  "
					+s8+"  "+s9+"  "+s10+"  "+s11+"  "+s12+"  "+s13+"  "+s14+"  "+s15+
					"  "+s16+"  "+s17+"  "+s18+"  "+s19+"  "+s20+"  "+s21+"  "+s22+"  "
					+s23+"  "+s24+"";

			String d = c.replaceAll("  ", ",");

			System.out.println(d);

			driver.findElement(By.linkText("PIXFIX Flex")).click();

			Thread.sleep(1000);

			new Select(driver.findElement(By.id("query_limit"))).selectByVisibleText("200");

			Thread.sleep(1000);

		}

		catch (Exception e)

		{

			driver.findElement(By.linkText("PIXFIX Flex")).click();

			Thread.sleep(1000);

			new Select(driver.findElement(By.id("query_limit"))).selectByVisibleText("200");

			Thread.sleep(1000);

		}

		try

		{

			boolean b3 = driver
					.findElement(By.xpath("//a[@data-type='stop' and @data-job_name='" + j_name + '_' + vid_res + "']"))
					.isDisplayed();

			if (b3 == true)

			{

				driver.findElement(
						By.xpath("//a[@data-type='stop' and @data-job_name='" + j_name + '_' + vid_res + "']")).click();

				Thread.sleep(1000);

				driver.close();

			}

		}

		catch (Exception e)

		{

			driver.close();

		}

	}

	@DataProvider(name = "testdata")

	public Object[][] passData() throws Exception

	{

		System.setOut(new PrintStream(
				new FileOutputStream("C:\\Testing3.3\\Automation\\Datadriven\\Output\\Udp_Udp_Flex.csv")));

		String a = "Job Name  Creation Status  Job Status  Job Type  CPU Usage  Average CPU Usage  Memory Usage  Average Memory Usage  Buffered Data  Latency"
				+ "  I/P Strem Status  I/P Bitrate  I/P Avg Bitrate  Recieved Data  Uptime"
				+ "  Vid Bitrate  Vid Avg Bitrate  Framerate  Avg Framerate  Audio Bitrate  Audio Avg Bitrate"
				+ "  O/P Status  O/P Bitrate  O/P Avg Bitrate  O/P Sent Data  O/P Uptime";

		String b = a.replaceAll("  ", ",");

		System.out.println(b);

		File excel = new File("C:\\Testing3.3\\Automation\\Datadriven\\flextype.xlsx");

		FileInputStream fis = new FileInputStream(excel);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet ws = wb.getSheet("flexjob");

		int rows = ws.getLastRowNum();

		int columns = ws.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows][columns];

		for (int i = 1; i <= rows; i++)

		{

			XSSFRow row = ws.getRow(i);

			for (int j = 0; j < columns; j++)

			{

				XSSFCell cell = row.getCell(j);

				Object value = cellToObject(cell);

				data[i - 1][j] = value;

			}

		}

		return data;

	}

	public static Object cellToObject(XSSFCell cell)

	{

		Object result;

		if (cell.getCellType() == cell.CELL_TYPE_NUMERIC)

		{
			int i = (int) cell.getNumericCellValue();

			result = i;

		} else {
			result = cell.toString();

		}

		return result.toString();

	}
}