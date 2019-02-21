package utilitySmoke;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProviderSmoke {
	
XSSFWorkbook wb;
	
	public ExcelDataProviderSmoke() throws Exception
	{
		File src = new File("./DataProvider/newdata.xlsx");
		FileInputStream fis =new FileInputStream(src);
	    wb = new XSSFWorkbook(fis);
		
		
	}
	
	public String getStringValue(int sheetindex, int rown, int colnum)
	{
		return wb.getSheetAt(sheetindex).getRow(rown).getCell(colnum).getStringCellValue();
	}
	
	public int getNumiricValue(int sheetindex , int rown, int colnum)
	{
		return (int) wb.getSheetAt(sheetindex).getRow(rown).getCell(colnum).getNumericCellValue();
	}

}
