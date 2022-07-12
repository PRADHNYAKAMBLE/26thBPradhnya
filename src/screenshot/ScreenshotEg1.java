package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEg1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
//		driver.get("https://vctcpune.com/selenium/practice.html");
//		driver.manage().window().maximize();
		
		//driver.get("https://paytm.com/");
		//driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(1000);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File destination= new File("D:\\screenshot of selenium\\myScreenshot1.png");
		//File destination= new File("D:\\screenshot of selenium\\myScreenshot2.png");
		File destination= new File("D:\\screenshot of selenium\\myScreenshot3.png");
		
		
		FileHandler.copy(source, destination);

	}

}
