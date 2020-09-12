package setup;

import java.util.concurrent.TimeUnit;

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
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      return driver;
	    }else{
	      return driver;
	    }
	  }}
