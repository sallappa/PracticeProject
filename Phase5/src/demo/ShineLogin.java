package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShineLogin {
    public static void main(String[] args) throws InterruptedException {

        String path = "C:\\Selenium\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);

        String url = "https://www.shine.com/registration/";
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement name = driver.findElement(By.id("id_name"));
        name.sendKeys("Saiicon");

        Thread.sleep(2000);

        WebElement email = driver.findElement(By.id("id_email"));
        email.sendKeys("Saiicon@gmail.com");

        Thread.sleep(2000);

        WebElement phone = driver.findElement(By.id("id_cell_phone"));
        phone.sendKeys("9632145785");

        Thread.sleep(2000);

        WebElement pass = driver.findElement(By.id("id_password"));
        pass.sendKeys("Saiicon@007shine");

        Thread.sleep(2000);

        
        WebElement check = driver.findElement(By.id("id_privacy"));
        
        if (!check.isSelected()) {
            check.click();
        }

        Thread.sleep(2000);

        WebElement login = driver.findElement(By.id("registerButton"));
        login.click();
        
        System.out.println("registration success");
        
        driver.close();
    }
}
