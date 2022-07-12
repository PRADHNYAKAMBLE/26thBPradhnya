package ListenerTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerTest.Listener.class)
public class MyTest {
  @Test
  public void myMethod1() 
  {
	  Reporter.log("Hi I am myMethod1",true);
  }
  
  @Test
  public void myMethod2() 
  {
	  Assert.fail();
	  Reporter.log("Hi I am myMethod2",true);
  }
  
  @Test(dependsOnMethods = {"myMethod2"})
  public void myMethod3() 
  {
	  Reporter.log("Hi I am myMethod3",true);
  }
}
