package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SuperClass {
	  public WebDriver driver;
	  public void Superclass(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	    driver = new ChromeDriver();
	  }
	  public WebDriver getdriver(){
	    if (driver == null){
	      driver = new ChromeDriver();
	      return driver;
	    }else{
	      return driver;
	    }
	  }}
