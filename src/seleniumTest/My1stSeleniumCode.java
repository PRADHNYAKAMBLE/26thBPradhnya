package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stSeleniumCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Pradhnya");
		
		
        driver.findElement(By.xpath("Facebook helps you connect and share with the people in your life."));//fb page elements
		driver.findElement(By.xpath("//h2[contains(text(),' Facebook helps']"));//partial text by contains()
		driver.findElement(By.xpath("//button[contains(@type,'sub')]"));//partial part of attribute value by contains()
	}

}
