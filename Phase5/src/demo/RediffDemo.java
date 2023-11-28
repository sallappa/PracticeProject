package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffDemo {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String path = "C:\\Selenium\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
	//	driver.findElements(By.xpath("//input[@type='text']")).get(0).sendKeys("hari");
		
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("sai icon");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("admin123");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("password@123");

	}

}




