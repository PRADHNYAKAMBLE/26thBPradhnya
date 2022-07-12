package headlessBrowser;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import KitePOMUsingTestNG.KiteHomePage;
import KitePOMUsingTestNG.KiteLoginPage;
import KitePOMUsingTestNG.KitePinPage;

public class ChromeOptionsStudy {
 @Test
 public void HeadlessChrome()

  {
	 System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
	  ChromeOptions opt= new ChromeOptions();
	  //opt.addArguments("headless");
	  opt.addArguments("incognito");
	  opt.addArguments("start-maximized");
	  opt.addArguments("version");
	 WebDriver driver= new ChromeDriver(opt);
	 driver.get("https://kite.zerodha.com/");
	 
//	 Below are the list of available and most commonly used arguments for ChromeOptions class
//
//	 start-maximized: Opens Chrome in maximize mode
//	 incognito: Opens Chrome in incognito mode
//	 headless: Opens Chrome in headless mode
//	 disable-extensions: Disables existing extensions on Chrome browser
//	 disable-popup-blocking: Disables pop-ups displayed on Chrome browser
//	 make-default-browser: Makes Chrome default browser
//	 version: Prints chrome browser version
//	 disable-infobars: Prevents Chrome from displaying the notification ‘Chrome is being controlled by automated software
//		
  }
 }
