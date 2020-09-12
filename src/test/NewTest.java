package test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import setup.SuperClass;

public class NewTest extends SuperClass{
	ReadData rd = new ReadData();
	
  @Test
  public void openBrowser() throws FileNotFoundException, IOException   
  {
	  System.out.println(rd.getData("test"));
	  System.out.println(rd.getData("baseURL"));
	  getdriver().get(rd.getData("baseURL"));
	  System.out.println(rd.getExcelData(0, 0));
  }
}
