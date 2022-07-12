package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/iframes/");
		
		Thread.sleep(2000);
    String text = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
    System.out.println(text);
   
    //without switching to frame
    //String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
   // System.out.println(text1);//exception comes
    
   // driver.switchTo().frame("Frame1");//changing focus from main frame to frame
    
    driver.switchTo().frame(0);
    String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
    System.out.println(text1);//exception comes
    
    
    //xpath by linked text
//    String text2 = driver.findElement(By.linkText("Pavilion")).getText();
//    System.out.println(text2);//exception bcoz it is on main page n selenium is focused on frame
   
    //to return the focus on main page
    driver.switchTo().parentFrame();//switch focus from frame to main page
    String text2 = driver.findElement(By.linkText("Pavilion")).getText();
    System.out.println(text2);
    
    
	}
	

}
