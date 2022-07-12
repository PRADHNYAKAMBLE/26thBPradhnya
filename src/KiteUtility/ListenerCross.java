package KiteUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteBase.BaseCROSSListener;
import KiteBase.BaseNewListener;

public class ListenerCross extends BaseCROSSListener implements ITestListener
{
	BaseNewListener bl=new BaseNewListener();
	 public WebDriver driver;
   @Override
public void onTestSuccess(ITestResult result) {
	Reporter.log("Congratulations your TC is PASSED,Passed TC name is"+result.getName(),true);
}
   
   @Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Sorry TC is failed,Failed TC name is"+result.getName(),true);
		String TCname = result.getName();
		try {
			bl.captureScreenshot( TCname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
