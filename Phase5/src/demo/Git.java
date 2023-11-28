package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Git {
	public static void main(String[] args) throws InterruptedException {
		String path="C:\\Selenium\\chromedriver-win64\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);


		String url="https://github.com/login";

		WebDriver driver=new ChromeDriver();


		driver.get(url);
		Thread.sleep(3000);		
		highlight(driver, driver.findElement(By.id("login_field")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.name("password")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.className("header-logo")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.linkText("Forgot password?")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.partialLinkText("Create an")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.tagName("h1")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.cssSelector("input[name='commit']")));	
		Thread.sleep(3000);
		
		
		WebElement txt=driver.findElement(By.id("login_field"));
		System.out.println(txt);
		System.out.println(txt.isDisplayed());
		System.out.println(txt.isEnabled());

	}
	
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}
}
