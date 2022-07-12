package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);

		
		//Find Element
		WebElement textBox = driver.findElement(By.id("autocomplete"));
		//textBox.sendKeys("Good Morning"); using WebElement method
		//How to send keys using Actions Class
		//Create object of Actions class and pass driver object
		
		Actions act = new Actions(driver);
		// using sendKeys method of actions class perform SendKeys task
		
		act.sendKeys(textBox, "Good Morning").perform();
		//How to handle drop down using Actions Class
		WebElement dropDown = driver.findElement(By.name("dropdown-class-example"));
		//using actions class method Handle drop down
		 
		act.click(dropDown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}

}
