package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oneplus 10r");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
	}
}
