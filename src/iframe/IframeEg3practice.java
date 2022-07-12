package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg3practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.id("frame1"));
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		//driver.findElement(By.xpath("//b[@id=\"topic\"]")).sendKeys("Nested frame");
    driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
    driver.switchTo().frame("frame1");
    
    driver.findElement(By.xpath("//b[text()=\"Topic :\"]")).sendKeys(" nframe");
	}

}
