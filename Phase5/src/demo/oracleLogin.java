package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class oracleLogin {
	public static void main(String[] args) throws InterruptedException {

        String path = "C:\\Selenium\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);

        String url = "https://profile.oracle.com/myprofile/account/create-account.jspx";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.name("sView1:r1:0:email"));
        email.sendKeys("ruthless007s@gmail.com");
        
        Thread.sleep(5000);
        
        WebElement pass=driver.findElement(By.id("sView1:r1:0:password::content"));
        pass.sendKeys("123456789@Oracle");
        
        Thread.sleep(5000);
        
        WebElement repass=driver.findElement(By.id("sView1:r1:0:retypePassword::content"));
        repass.sendKeys("123456789@Oracle");
        
        Thread.sleep(5000);
        
        WebElement country=driver.findElement(By.id("sView1:r1:0:country::content"));
        new Select(country).selectByIndex(100);

        
        Thread.sleep(5000);
        
        WebElement name=driver.findElement(By.id("sView1:r1:0:firstName::content"));
        name.sendKeys("sai");
        
        Thread.sleep(5000);
        
        WebElement lastname=driver.findElement(By.id("sView1:r1:0:lastName::content"));
        lastname.sendKeys("icon");
        
        Thread.sleep(5000);
        
        WebElement tittle=driver.findElement(By.id("sView1:r1:0:jobTitle::content"));
        tittle.sendKeys("intern");
        
        Thread.sleep(5000);
        
        WebElement phone=driver.findElement(By.id("sView1:r1:0:workPhone::content"));
        phone.sendKeys("6302171037");
        
        Thread.sleep(5000);
        
        WebElement company=driver.findElement(By.id("sView1:r1:0:companyName::content"));
        company.sendKeys("mphasis");
        
        Thread.sleep(5000);
        
        WebElement address=driver.findElement(By.id("sView1:r1:0:address1::content"));
        address.sendKeys("kodapagani palli,ktc,sss,ap,515144");
        
        Thread.sleep(5000);
        
        WebElement state=driver.findElement(By.id("sView1:r1:0:state::content"));
        new Select(state).selectByIndex(2);
        
        Thread.sleep(5000);

        
        WebElement city=driver.findElement(By.id("sView1:r1:0:city::content"));
        city.sendKeys("puttaparthi");
        
        Thread.sleep(5000);
        
        WebElement zip=driver.findElement(By.id("sView1:r1:0:postalCode::content"));
        zip.sendKeys("515144");
        
        Thread.sleep(5000);
        
        WebElement button=driver.findElement(By.id("sView1:r1:0:b1"));
        button.click();
        
        
        
	}

}