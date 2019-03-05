package testCasesSmoke.running_testcases;

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

import testCasesSmoke.VersaIpSmokeTest.BaseClassSmokeTest;

public class Datadriver extends BaseClassSmokeTest {
	

	
	public int rows;
	
	public int columns;
	
	
	
	
	@Test(dataProvider = "testdata")
	
	
	public void sneha(String JobName, String DataType ) throws Exception
	{
	
		Thread.sleep(1000);
		job_versa();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@data-job_name='"+JobName+"' and @data-type='"+DataType+"']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-job_name='"+JobName+"' and @data-type='stat']")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		writecsvFile();
		
	}
	
	

	public void job_versa() throws Exception
	{
		
		boolean ver= driver.findElement(By.xpath("//a[contains(text(), 'PIXFIX Versa')]")).isDisplayed();
		if(ver==true)
		{
			driver.findElement(By.xpath("//a[contains(text(), 'PIXFIX Versa')]")).click();
			Thread.sleep(1000);
		}
		else{
		driver.findElement(By.xpath("//span[@id='pixflex-menu-arrow']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(), 'PIXFIX Versa')]")).click();
		Thread.sleep(1000);
		}
		new Select(driver.findElement(By.id("query_limit"))).selectByVisibleText("200");
		Thread.sleep(1000);
		
	}
	
	
	
	public void writecsvFile() throws Exception{
		
		String jobName= driver.findElement(By.xpath("//span[contains(text(), 'Statistics ')]")).getText();
		
		String status = driver.findElement(By.xpath("//span[contains(text(), 'Active')]")).getText();
		
		new Select(driver.findElement(By.id("notification_type"))).selectByVisibleText("Error + Info");
		Thread.sleep(1000);
		String notification = driver.findElement(By.id("stat_notification")).getText();
		
		
		File log = new File("C:\\Users\\sr39\\git\\smoketest\\CSV_files\\sneha.csv");

				try{
				    if(!log.exists()){
				        System.out.println("We had to make a new file.");
				        log.createNewFile();
				    }

				    FileWriter fileWriter = new FileWriter(log, true);

				    CSVWriter bufferedWriter = new CSVWriter(fileWriter);
				    
				   String[] header = { "JobName", "Job Status", "Notification"}; 
				   bufferedWriter.writeNext(header);
				    
				    
					String[] data ={jobName, status, notification};
				    
				    bufferedWriter.writeNext(data);
				    
				    
				   
				    bufferedWriter.close();

				    System.out.println("Done");
				} catch(IOException e) {
				    System.out.println("COULD NOT LOG!!");
				}
		
		
		//writeCsvFile();
	   
		
	}
	
	
	
	
	
	
	
	@DataProvider(name = "testdata")

	public Object[][] passData() throws Exception
	
	{
	
	 int i,j;

		

		File excel = new File("C:\\testing\\Automation\\DataDriven\\SmokeTestRunningIpVersa.xlsx");

		FileInputStream fis = new FileInputStream(excel);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet ws = wb.getSheet("Sheet1");
		
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






