package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUse {
	@Test
	public void myMethod()
	{
	String a=null;
	String b="abc";
	// Assert.assertNull(b, "value is not null TC is failed");
	// Reporter.log("value is null TC is passed",true);
	Assert.assertNotNull(b, "value is null TC is failed");
	Reporter.log("value is not null TC is passed",true);
	Assert.fail();
	}
}
