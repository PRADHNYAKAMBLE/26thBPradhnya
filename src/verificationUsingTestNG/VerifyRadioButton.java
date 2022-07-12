package verificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyRadioButton {
  @Test
  public void myMethod() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
//		if(radioButton1.isSelected())
//		 {
//		 Reporter.log("TC pass Radio Button is selected",true);
//		 }
//		 else {
//		 Reporter.log("TC failed Radio Button is not selected",true);
//		 }
		Assert.assertTrue(radioButton1.isSelected(),"Radio button is not selected TC is failed");
		}
		
  }

