package practiceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfImages {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pune university");
		//driver.findElement(By.xpath("(//div[@role='option'])[1]")).click();
		driver.findElement(By.name("q")).click();
		
//		//to find number of images searched
//				List<WebElement> links = driver.findElements(By.tagName("a"));//multiple links hence findelements()
//				System.out.println(links.size());
//				//using iterator to get those links name--that is text in that field


	}

}
