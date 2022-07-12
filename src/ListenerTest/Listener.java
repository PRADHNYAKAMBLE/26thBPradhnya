package ListenerTest;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{

	 @Override
	public void onTestFailure(ITestResult result)
	 {
		Reporter.log("Screenshot is taken please check TC",true);
		Reporter.log("Failed tc name is" + result.getName(),true);
	}
	 
	 @Override
	public void onTestSuccess(ITestResult result) 
	 {
		Reporter.log("TC is passed",true);
		Reporter.log("Success tc name is" + result.getName(),true);
	 }
	 
	 @Override
	public void onTestSkipped(ITestResult result) 
	 {
		Reporter.log("TC is skipped plz check dependant method",true);
		Reporter.log("Skipped tc name is" + result.getName(),true);
	 }
}
