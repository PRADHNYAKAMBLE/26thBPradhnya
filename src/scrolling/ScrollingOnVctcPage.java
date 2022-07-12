package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScrollingOnVctcPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		JavascriptExecutor je =(JavascriptExecutor)driver;
		WebElement radio2 = driver.findElement(By.xpath("(//input[@name='radio'])[2]"));
		
		je.executeScript("arguments[0].scrollIntoView(true)",radio2);
		radio2.click();
		
		WebElement cname = driver.findElement(By.id("autocomplete"));
		je.executeScript("arguments[0].scrollIntoView(true)",cname);
		cname.sendKeys("INDIA");
		
		driver.findElement(By.id("checkBoxOption1")).click();//direct perform
		Thread.sleep(500);
		//driver.close();
		

		
		WebElement listbox = driver.findElement(By.name("dropdown-class-example"));
		
		Select s=new Select(listbox);
		//s.selectByIndex(0);
		boolean showme = s.isMultiple();
		System.out.println("is multiple" + showme);
		Thread.sleep(500);
		//s.selectByVisibleText("Option3");
		s.selectByValue("option2");
		driver.close();
	}

}
