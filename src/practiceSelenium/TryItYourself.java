package practiceSelenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryItYourself {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		String Mainpgid = driver.getWindowHandle();
		System.out.println(Mainpgid);
		List<WebElement> refid = driver.findElements(By.linkText("Try it Yourself"));
		System.out.println(refid.size());
		driver.findElement(By.linkText("Try it Yourself")).click();
		Thread.sleep(2000);
		
		Set<String> allId = driver.getWindowHandles();
		for(String at:allId)
		{
			System.out.println(at);
	
		}
		
		Thread.sleep(9000);
		//driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		driver.findElement(By.xpath("//a[@onclick='retheme()']")).click();
		


	}

}
