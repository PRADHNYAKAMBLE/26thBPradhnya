package KiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp 
{

	//unabled for listener and copied this method in basenewlistener
	public static void captureScreenshot(WebDriver driver ,String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\screenshot of selenium\\MyScreenshot"+TCID+".png");
		FileHandler.copy(src, dest);
		
}
	
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myFile= new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\26MarchTest\\myProperties.properties");
         prop.load(myFile);
         String value= prop.getProperty(key);
         return value;
	}

	
		
	}

