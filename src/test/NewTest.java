package test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import setup.ReadData;
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
	  System.out.println(rd.getData("id"));
	  System.out.println(rd.getData("enterText"));
	  getdriver().findElement(By.linkText("Gmail")).click();
  }
  
  @AfterTest
  void closeBrowser()
  {
	  getdriver().quit();
  }
}
