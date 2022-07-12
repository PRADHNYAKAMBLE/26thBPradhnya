package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");//present in another frame 
		//driver.findElement(By.xpath("//button[@type='button']")).click();//thats y exection nosuchelement
		
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(1000);
		
	    driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);//by index switching frame
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
	}

}
