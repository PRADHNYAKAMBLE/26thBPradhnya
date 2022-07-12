package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//1.get()---to enter url in browser or to open an application
		
		driver.get("https://vctcpune.com/");
		//2.close()--to close the current tab of the browser open by the selenium tool
		//driver.close();
		//3.quit()--to close all of tab of the browser open by the selenium tool
		//driver.quit();right now we dont knw how to open multiple tab sir sangayache ahet

		//driver.manage().window().minimize();//4.
		driver.manage().window().maximize();//
		
		//5.navigate:this method is use to open an application, move forward,backward and refresh the web page.
		
//		driver.navigate().to("https://www.google.co.uk/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		
		
		//6.getTitle:this method is used to get the title of the web page.Return type of get title is string
		
		System.out.println(driver.getTitle());
		
//		String title= driver.getTitle();
//		System.out.println(title);
		
		//7.getCurrentURL:this method is used to get Url of a webpage.return type of this method is string
		
		//System.out.println(driver.getCurrentUrl()); 
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
	
	}

}
