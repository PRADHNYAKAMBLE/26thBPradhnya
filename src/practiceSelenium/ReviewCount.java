package practiceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReviewCount {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vivo t1 5g");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//to find nos of reviews
	
         Thread.sleep(10000);
		 driver.findElement(By.xpath("(//div[@class='gUuXy-'])[1]")).click();//to click that particular review and ratings
	     List<WebElement> review = driver.findElements(By.xpath("((//div[@class='col col-7-12'])[2]//span)[6]"));
	     //System.out.println(review.size());
	   
	   for(WebElement ov:review)
       {
		   System.out.println(ov.getText());
	   }
      // WebElement review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
        // System.out.println(review.getText());
	   driver.close();
	}
	

}
