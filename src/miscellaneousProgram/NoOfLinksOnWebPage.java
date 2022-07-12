package miscellaneousProgram;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);

		//to find number of links present /hint/ by tagname--'a'
		List<WebElement> links = driver.findElements(By.tagName("a"));//multiple links hence findelements()
		System.out.println(links.size());
		//using iterator to get those links name--that is text in that field
		
		Iterator<WebElement> it = links.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
			
		}
	}

}
