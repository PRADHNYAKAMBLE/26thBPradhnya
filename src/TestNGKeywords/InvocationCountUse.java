package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountUse {
  @Test(invocationCount = 3)
  public void myTest()
  {
	  Reporter.log("Hello", true);
  }
  @AfterMethod
  public void test()
  {
	  Reporter.log("Hi", true);
  }
  @BeforeMethod
  public void test1()
  {
	  Reporter.log("Gm", true);
  }
}

