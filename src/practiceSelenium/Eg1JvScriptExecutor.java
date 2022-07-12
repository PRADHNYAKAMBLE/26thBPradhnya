package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1JvScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
  
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
//        driver.findElement(By.name("username")).sendKeys("random@gmail.com");
//	    Thread.sleep(3000);
//		driver.findElement(By.xpath("//label[@for='persistent']")).click();
  
	   JavascriptExecutor JSE=(JavascriptExecutor)driver;
	   WebElement email = driver.findElement(By.name("username"));
		//JSE.executeScript("arguments[0].value='kuldip@yahoo.com'",email);
	   JSE.executeScript("arguments[0].value='randommail@yahoo.com'", email);
	   
		Thread.sleep(2000);
		
		WebElement checkbox = driver.findElement(By.xpath("//label[@for='persistent']"));
	  JSE.executeScript("arguments[0].click()", checkbox);
		
		
		
	}

}
