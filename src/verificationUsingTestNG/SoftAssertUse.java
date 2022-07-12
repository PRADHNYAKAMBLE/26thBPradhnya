package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
	@Test
	public void myMethod()
	{
	String a="abc";
	String b="abc";
	//to use soft assert we need to create object of SoftAssert class
	SoftAssert soft= new SoftAssert();// created object of soft assert
	soft.assertNotEquals(a, b," Both are equal TC is Failed");
	soft.assertNull(b,"Value is not null, TC is failed");
	soft.assertAll();
	}
	
	
	
	@Test
	public void testing()
	{
	boolean a=true;
	boolean b=false;
	SoftAssert s= new SoftAssert();
	s.assertTrue(b,"Value is False TC is failed");
	s.assertFalse(a,"Value is True TC is failed");
	s.assertAll();
	
	}
}
