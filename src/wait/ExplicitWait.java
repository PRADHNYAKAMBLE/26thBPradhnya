package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(10000);//
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofMillis(2000));
		WebElement AboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		wait.until(ExpectedConditions.visibilityOf(AboutUs));
		AboutUs.click();
		
	}

}
