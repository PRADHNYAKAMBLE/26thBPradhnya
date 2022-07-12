package TestNGKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodUse {
	@Test//(enabled = false)to check error for depends on--dont do something like this
	  public void d() 
	  {
		//Assert.fail();
		  Reporter.log("d is running", true);
	  }
	  
	  @Test(dependsOnMethods = {"d"},invocationCount = 2,priority=-2)//priority will work with a and v
	  public void a() 
	  {
		  Reporter.log("a is running", true);
	  }
	  
	  @Test
	  public void v() 
	  {
		  Reporter.log("v is running", true);
	  }
}
