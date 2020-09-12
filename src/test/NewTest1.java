package test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import setup.SuperClass;

public class NewTest1 extends SuperClass {
	ReadData rd = new ReadData();
  @Test
  public void f() throws FileNotFoundException, IOException 
  {
	getdriver().findElement(By.id(rd.getData("id"))).sendKeys(rd.getData("enterText"));
  }
}
