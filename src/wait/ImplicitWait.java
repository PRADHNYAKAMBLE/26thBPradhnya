package wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//Thread.sleep(10000);//suppose 2000-if browser needs only 100ms to launch then 1900ms vl b wasted

		//1)Implicit wait --work on total webpage till launch and release
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));//500ms release
		driver.close();
	}

}
