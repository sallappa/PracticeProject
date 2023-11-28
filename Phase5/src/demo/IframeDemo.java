package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\ssaiv\\OneDrive\\Desktop\\frame\\frame.html");
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		//find the list of webelements
		List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		
		System.out.println("Total Numbers of Iframes are :"+frame.size());
	}

}
