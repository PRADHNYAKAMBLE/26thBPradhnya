package SetSizeAndPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getSize());
		//to set size, need to create object of Dimension class and pass Width and Height
		Dimension d=new Dimension(1111, 110);
		// using setSize method we can set size
		driver.manage().window().setSize(d);
	}

}
