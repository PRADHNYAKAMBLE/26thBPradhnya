package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeEg4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//step1.switch to main frame
				String text = driver.findElement(By.xpath("//h1[@class='breadcrumb-item']")).getText();
				System.out.println(text);
				
				//step2.switch to frame1
				//driver.switchTo().frame("frame1");
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("(//input)[1]")).sendKeys("Pradhnya");
				Thread.sleep(1000);
				
				//step3.switch to nested frame
				driver.switchTo().frame(0);
				Thread.sleep(1000);
				driver.findElement(By.id("a")).click();
				
				//Again switch to main page
				driver.switchTo().defaultContent();
				String text1 = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
				System.out.println(text1);
				
				//switch frome main page to frame2
				driver.switchTo().frame(1);
				 WebElement dropdown = driver.findElement(By.id("animals"));
				dropdown.click();
				Thread.sleep(3000);
				 Select sd = new Select(dropdown);
				sd.selectByIndex(3);
				


	}

}
