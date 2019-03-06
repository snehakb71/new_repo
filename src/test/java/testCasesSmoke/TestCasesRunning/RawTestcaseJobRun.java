package testCasesSmoke.TestCasesRunning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVWriter;

import testCasesSmoke.RawInputSmoke.RawInputBase;

public class RawTestcaseJobRun extends RawInputBase {
	
	public int rows;

	public int columns;

	@Test(dataProvider = "testdata")

	public void jobStartAndStatitics(String JobName, String DataType) throws Exception {

		job_versa();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@data-job_name='" + JobName + "' and @data-type='" + DataType + "']")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//a[@data-job_name='" + JobName + "' and @data-type='stat']")).click();
		Thread.sleep(3000);

		driver.navigate().refresh();

		Thread.sleep(2000);
		writecsvFile();

	}

	public void job_versa() throws Exception {

		boolean ver = driver.findElement(By.xpath("//a[contains(text(), 'PIXFIX Versa')]")).isDisplayed();
		if (ver == true) {
			driver.findElement(By.xpath("//a[contains(text(), 'PIXFIX Versa')]")).click();
			Thread.sleep(1000);
		}

		else {
			driver.findElement(By.xpath("//span[@id='pixflex-menu-arrow']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(), 'PIXFIX Versa')]")).click();
			Thread.sleep(1000);
		}
		new Select(driver.findElement(By.id("query_limit"))).selectByVisibleText("200");
		Thread.sleep(1000);

	}

	public void writecsvFile() throws Exception {

		String jobName = driver.findElement(By.xpath("//div[@class='col-lg-7']")).getText();

		System.out.println("jobstatitc:" + jobName);
		// String status = driver.findElement(By.xpath("//span[contains(text(),
		// 'Active')]")).getText();

		new Select(driver.findElement(By.id("notification_type"))).selectByVisibleText("Error + Info");
		Thread.sleep(1000);
		String notification = driver.findElement(By.id("stat_notification")).getText();

		File log = new File(".\\CSV_files\\sneha.csv");

		try {
			if (!log.exists()) {
				System.out.println("We had to make a new file.");
				log.createNewFile();
			}

			FileWriter fileWriter = new FileWriter(log, true);

			CSVWriter bufferedWriter = new CSVWriter(fileWriter);

			String[] data = { jobName, notification };

			bufferedWriter.writeNext(data);

			bufferedWriter.close();

			System.out.println("Done");
		} catch (IOException e) {
			System.out.println("COULD NOT LOG!!");
		}

		// writeCsvFile();

	}

	// @DataProvider(name="testdata")
	// public Object[][] passData(String filepath, String Sheat_num) throws
	// Exception

	@DataProvider(name = "testdata")

	public Object[][] passData() throws Exception
	// public Object[][] passData(String filepath, String Sheat_num) throws
	// Exception
	{

		int i, j;
		// File excel = new File(filepath);

		File excel = new File(".\\ExcelSheets\\SmokeTestRunning.xlsx");

		FileInputStream fis = new FileInputStream(excel);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet ws = wb.getSheet("Sheet3");

		int rows = ws.getLastRowNum();

		int columns = ws.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows][columns];

		for (i = 1; i <= rows; i++)

		{

			XSSFRow row = ws.getRow(i);

			for (j = 0; j < columns; j++)

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
