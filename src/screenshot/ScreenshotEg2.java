package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotEg2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
      System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	    driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
//		driver.get("https://paytm.com/");
//		driver.manage().window().maximize();
		
//		driver.get("https://kite.zerodha.com/");
//		driver.manage().window().maximize();
//		
		Thread.sleep(1000);
		 

		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String str= RandomString.make(4);
		File destination= new File("D:\\screenshot of selenium\\TestScreenshot"+str+".png");
		
		FileHandler.copy(source, destination);
		
		
	}

}
