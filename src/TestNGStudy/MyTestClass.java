package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void myMethod() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("Hi ,method is running this is printing statement");
		Reporter.log("Hi,Method is running,this is Reporter output");
		Reporter.log("Hi,Method is running,this is Reporter output with true",true);
		Thread.sleep(2000);
		
	}
  @Test
  public void myMethod1() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
	}
}
