package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();

	driver.manage().window().maximize();
	
	driver.get("https://www.shine.com/registration/");

	WebElement name=driver.findElement(By.id("id_name"));
	name.sendKeys("Nikunj Soni");

	WebElement element=driver.findElement(By.id("id_file"));

	JavascriptExecutor executor=(JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click()", element);

	Thread.sleep(5000);

	Runtime.getRuntime().exec("D:\\Screenshot\\upload.exe");
	}
}
