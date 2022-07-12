package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUsingSelenium {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		JavascriptExecutor e=(JavascriptExecutor)driver;
		e.executeScript("window.scrollBy(90,900)");
	}

}
