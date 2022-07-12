package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		WebElement show = driver.findElement(By.id("show-textbox"));
		WebElement textBox = driver.findElement(By.name("show-hide"));
		
    
	if(textBox.isDisplayed())
	{
     	System.out.println("Thank you text box is displayed");
	}
		else 
	{
		
			System.out.println("Cant find textbox");
		}
	hide.click();
	
	if(textBox.isDisplayed())
	{
		System.out.println("Thank you textbox is displayed");
	
		
	}
	else
	{
		System.out.println("Cant find textbox");
	}
		

	}

}
