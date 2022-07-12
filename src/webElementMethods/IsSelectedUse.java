package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement checkBox1 = driver.findElement(By.name("checkBoxOption1"));
		//checkboc1.click()
		if(checkBox1.isSelected())
		{
			System.out.println("checkbox is already selected");
		}
		else 
		{
			checkBox1.click();
			System.out.println("chechbox is now selected");
		}
		

	}

}
