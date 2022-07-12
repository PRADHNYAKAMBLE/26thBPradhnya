package TestNGKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClassFailxml {
	@Test
	  public void a() 
	  {
		Assert.fail();
		  Reporter.log("a is running", true);;
	  }
	  
	  @Test(groups = {"regression"})
	  public void b() 
	  {
		  Reporter.log("b is running, regression ", true);;
	  }
}
