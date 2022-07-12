package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/alerts");
			Thread.sleep(2000);
			driver.findElement(By.id("alertButton")).click();
			
//1. to handle alert popup we need to switch selenium focus from main page to alert popup by using syntax
			
			Alert alt=driver.switchTo().alert();
			  
			
			//2.Alert is an interface which contains abstract methods like
			 //1.accept()=use to click on ok button
			//2.dismiss()=use to click on cancle button
			//3.gettext()=use to get text present in alert popup'
			
			System.out.println(alt.getText());
			Thread.sleep(1000);
			alt.accept();
			//alt.dismiss();
	}

}
