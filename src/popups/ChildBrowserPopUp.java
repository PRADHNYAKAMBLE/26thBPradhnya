package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		String mainPageID = driver.getWindowHandle();//id of main page
		System.out.println(mainPageID);
		System.out.println("===============================================");
		//to open child window
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
	
		//to handle multiple windows/to get multiple ids
		
		Set<String> allPageIDs = driver.getWindowHandles();//handle multiple window
		
		Iterator<String> it = allPageIDs.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//			
//		}
		
		String mainpgId = it.next();//will return main page id 
		String childpgId = it.next();//will return child page id
		//exception comes---nosuchelementexception
		//so we need to switch focus to child window
		
		driver.switchTo().window(childpgId);//changing focus from main page to child page
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
		//driver.close();//will close only current focused tab
		//driver.quit();//will close all tabs /pages opened by selenium
		
		driver.switchTo().window(mainpgId);
		WebElement myElement = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		System.out.println(myElement.getText());
		
		
	}

}
