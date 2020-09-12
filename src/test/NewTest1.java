package test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import setup.SuperClass;

public class NewTest1 extends SuperClass {
	ReadData rd = new ReadData();
	
  @Test
  public void openFB() throws FileNotFoundException, IOException 
  {
	    getdriver().get(rd.getData("baseURLFB"));
	    getdriver().findElement(By.id(rd.getData("Fb_username_id"))).sendKeys(rd.getExcelData(0, 0));
	    getdriver().findElement(By.id(rd.getData("FBpass_id"))).sendKeys(rd.getExcelData(0, 1));
	    getdriver().findElement(By.linkText(rd.getData("FB_submit_linktext"))).click();
  }
  @AfterTest
  void closeBrowser()
  {
	  getdriver().quit();
  }
}
