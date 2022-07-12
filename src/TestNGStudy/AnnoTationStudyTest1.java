package TestNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnoTationStudyTest1 {
  @Test
  public void rechargePhone() 
  {
	  Reporter.log("recharge done", true);
  }
  @BeforeMethod
  public void loginToRechargePortal()
  {
	  Reporter.log("Login done", true);
  }


  @AfterMethod
  public void logoutFromRechargePortal() 
  {
	  Reporter.log("logOUT done", true);
  }
  
  @BeforeClass
  public void LaunchBrowser()
  {
	  Reporter.log("BROWSER Launched", true);
  }

  @AfterClass
  public void CloseBrowser() 
  {
	  Reporter.log("BROWSER closed", true);
  }

 

}
