package frameworkPomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import KiteAppPOM.KiteHomePage;
import KiteAppPOM.KiteLoginPage;
import KiteAppPOM.KitePinPage;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		KiteLoginPage Login= new KiteLoginPage(driver);//created object for login page
		Login.sendUserName();
        Login.sendPassword();
        Login.clickOnLoginButton();
        
        Thread.sleep(1000);
       
        KitePinPage pin=new KitePinPage(driver);
        pin.sendPin();
        pin.clickOnContinueButton();
        
        Thread.sleep(1000);
       
        KiteHomePage home=new KiteHomePage(driver);
        home.validateUserName();
        home.logOut();
        //driver.close();
        


	}

}
