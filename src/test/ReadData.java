package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData 
{
	static File file;
	static FileInputStream fileInput;
	static Properties prop = new Properties();
	
	
	public String getData(String key) throws FileNotFoundException, IOException
	{ 
		prop.load(new FileInputStream("D:\\AutomationNationalPen\\TestProjest\\src\\config\\read.properties"));
		prop.load(new FileInputStream("D:\\AutomationNationalPen\\TestProjest\\src\\config\\global.properties"));
		String property  = prop.getProperty(key) ;
		return property;
		
		
	}
	
	public String getExcelData(int row1,int  row2) throws FileNotFoundException, IOException
	{ 
		File src=new File("D:\\Library\\Credentials.xlsx");
		  FileInputStream fis=new FileInputStream(src);
		   // load the workbook
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		  // get the sheet which you want to modify or create
		   XSSFSheet sh1= wb.getSheetAt(0);
		   String value = sh1.getRow(0).getCell(0).getStringCellValue();
		   
		return value;
		
	}
	
	
	public static void main(String[] args) throws IOException {
		ReadData rr = new ReadData();
		rr.readDataFromExcel();
	}
	public void readDataFromExcel() throws IOException
	{

		  
		
	}
	
	
}
