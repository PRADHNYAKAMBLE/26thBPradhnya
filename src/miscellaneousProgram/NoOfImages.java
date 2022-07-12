package miscellaneousProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfImages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("pune university");
        Thread.sleep(300);
        driver.findElement(By.xpath("//div[@class='sbic vYOkbe']")).click();
        Thread.sleep(300);
        driver.findElement(By.linkText("Images")).click();
       List<WebElement> countOfImg = driver.findElements(By.tagName("img"));//tagname for images is img
       System.out.println(countOfImg.size());
     
	}

}
