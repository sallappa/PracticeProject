package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleTest {
	
	public static void main(String[] args) {
		
		String path="C:\\Selenium\\chromedriver-win64\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

	
		String url="https://www.google.com/";

		WebDriver driver=new ChromeDriver();
		

		driver.get(url);
		
//		System.out.println(driver.getCurrentUrl());
		
		driver.close();

		System.out.println("Driver Working Perfectly");


	}

}
