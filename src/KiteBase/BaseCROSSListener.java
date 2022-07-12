package KiteBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import KiteUtility.UtilityProp;

public class BaseCROSSListener 
{
    static public WebDriver driver;
	
    public void openBrowserChrome() throws IOException

	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get(UtilityProp.getDataFromPropertyFile("URL"));
		Reporter.log("Launching Browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
         
	}
	
	
	public void openBrowserFirefox() throws IOException
	{
         System.setProperty("webdriver.gecko.driver", "D:\\\\selenium\\\\geckodriver.exe");
		
		//WebDriver driver= new ChromeDriver();
	     driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(UtilityProp.getDataFromPropertyFile("URL"));
		Reporter.log("Launching Browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	public  void captureScreenshot( String TCID) throws IOException
	{
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\screenshot of selenium\\MyScreenshot"+TCID+".png");
	    FileHandler.copy(src, dest);
		
	}
}
