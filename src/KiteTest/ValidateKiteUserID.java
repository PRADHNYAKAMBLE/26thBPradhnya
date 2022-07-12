package KiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.Base;
import KitePOMnew.KiteHomePage;
import KitePOMnew.KiteLoginPage;
import KitePOMnew.KitePinPage;
import KiteUtility.Utility;

public class ValidateKiteUserID extends  Base{
 
	
	KiteHomePage Home;
	KiteLoginPage Login;
	KitePinPage Pin;
	String TCID="1234";
	
	@BeforeClass
	public void LaunchBrowser() 
	{
		openBrowser();
		Login=new KiteLoginPage(driver);
		Pin=new KitePinPage(driver);
		Home=new KiteHomePage(driver);
	}
	@BeforeMethod
		public void LoginToKiteApp() throws EncryptedDocumentException, IOException
		{
			Login.sendUserName(Utility.readDataFromExcel(5, 0));
			Login.sendPassword(Utility.readDataFromExcel(5, 1));
			Login.clickOnLoginButton();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			Pin.sendPin(Utility.readDataFromExcel(5, 2));
			Pin.clickOnContinueButton();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			
		}
	
	@Test
  public void ValidateUserID() throws EncryptedDocumentException, IOException 
	{
		Assert.assertEquals(Home.getActualUserName(), Utility.readDataFromExcel(5, 0),"Actual and expected are not matching TC is failed");
		Utility.captureScreenshot(driver, TCID);
  }
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
		Home.logOut();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
