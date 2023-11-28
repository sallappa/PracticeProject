package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookloginTest {
	public static void main(String[] args) {
		String path="C:\\Selenium\\chromedriver-win64\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

	
		String url="https://www.facebook.com/";

		WebDriver driver=new ChromeDriver();
		

		driver.get(url);
		//locating web elements
		
		WebElement email= driver.findElement(By.id("email"));
		//printing an attribute
		System.out.println(email.getAttribute("placeholder"));
		
		email.sendKeys("6302171037");
		
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("sallappa@007");
		
		//driver.close();
		
		WebElement login=driver.findElement(By.name("login"));
		
		login.click();
		
	}

}
