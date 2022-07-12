package KitePOMUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAppUserName {
   
	WebDriver driver;
	Sheet mySheet;
	KiteLoginPage Login;
	KitePinPage Pin;
	KiteHomePage Home;
	
	@BeforeClass
    public void LaunchBrowser() throws EncryptedDocumentException, IOException
    {
		
	    System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("headless");
		//opt.addArguments("disablenotifications");
		//opt.addArguments("incognito");
       
		
	    driver= new ChromeDriver(opt);
		 
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Launching browser",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File myfile= new File("D:\\selenium\\ExcelMyPractice.xlsx");
		 mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		 
		 Login=new KiteLoginPage(driver);
		 Pin=new KitePinPage(driver);
		 Home= new KiteHomePage(driver);
		
    }
    @BeforeMethod
	public void LoginToKiteApp()
	{
    	String UN = mySheet.getRow(5).getCell(0).getStringCellValue();//keeping the values in excel sheet and passing ther field
	     String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();//so that to keep the data secure and hidden from others----ENCAPSULATION
	     String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();//*enter to change value in string form frm numeric value
	     
	     Login.sendUserName(UN);
	     Reporter.log("sending username",true);
	     Login.sendPassword(PWD);
	     Reporter.log("sending Password",true);
	     Login.clickOnLoginButton();
	     Reporter.log("clicking on login button",true);
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	     
	     Pin.sendPin(PIN);
	     Reporter.log("sending Pin",true);
	     Pin.clickOnContinueButton();
	     Reporter.log("clicking on continue button",true);
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	     //Assert.fail();
	     
	}
	
	@Test
  public void ValidateUserName()
	{
		String expectedUN = mySheet.getRow(5).getCell(0).getStringCellValue();
		String actualUN = Home.getActualUserName();
		Reporter.log("Validating Username",true);
		Assert.assertEquals(actualUN,expectedUN,"Actual and Expected UN are not matching TC failed");
        Reporter.log("Actual and Expected UN are matching TC Passed",true);
	}
	
	@AfterMethod
	public void LogoutFromKiteApp() throws InterruptedException
	{
		Home.logOut();
		Reporter.log("Logging out...",true);
	}
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
		Reporter.log("Closing Browser",true);
	}
}
