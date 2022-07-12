package KiteTest;

import org.testng.annotations.Test;

import KiteBase.BaseNew;
import KiteBase.BaseNewListener;
import KitePOMnew.KiteHomePage;
import KitePOMnew.KiteLoginPage;
import KitePOMnew.KitePinPage;
import KiteUtility.UtilityProp;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
@Listeners(KiteUtility.Listener.class)
public class ValidateUsingPropertyListener extends BaseNewListener {
  

	KiteHomePage Home;
	KiteLoginPage Login;
	KitePinPage Pin;
	//String TCID="666";no need as mention in listener already
  
	@BeforeClass
    public void LaunchBrowser() throws IOException 
	{
		openBrowser();
		Login=new KiteLoginPage(driver);
		Pin=new KitePinPage(driver);
		Home=new KiteHomePage(driver);
     }
  
	
	@BeforeMethod
	public void LoginToKiteApp() throws IOException
	{
          Login.sendUserName(UtilityProp.getDataFromPropertyFile("UN"));
          Login.sendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
          Login.clickOnLoginButton();
          
          Pin.sendPin(UtilityProp.getDataFromPropertyFile("PIN"));
          Pin.clickOnContinueButton();
	}
	
  @Test
  public void ValidateUserID() throws IOException
  {
	  Assert.assertEquals(Home.getActualUserName(), UtilityProp.getDataFromPropertyFile("UN"));
	  Assert.fail();
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
