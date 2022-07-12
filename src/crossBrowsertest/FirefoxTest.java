package crossBrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
  @Test
  public void myMethod()
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\\\selenium\\\\geckodriver.exe");
		
		//WebDriver driver= new ChromeDriver();
	    WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		//Thread.sleep(1000);
  }
}
