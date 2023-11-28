package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class FbSignup {
	public static void main(String[] args) throws InterruptedException {
		
		String path="C:\\Selenium\\chromedriver-win64\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

	
		String url="https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569678%7Cb%7Cface%20book%20com%7C&placement=&creative=589460569678&keyword=face%20book%20com&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221352%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-923911541%26loc_physical_ms%3D9183323%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAmZGrBhAnEiwAo9qHiRxnjBn37jdroo_MnMI9JEYlyReTGLZHU0TqRwg3pVcMoi-RpfQhlRoC83YQAvD_BwE";

		WebDriver driver=new ChromeDriver();
		

		driver.get(url);
		//locating web elements
        
        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("sallappa");
        
        Thread.sleep(2000);
        
        WebElement surName=driver.findElement(By.name("lastname"));
        surName.sendKeys("kumar");
        Thread.sleep(2000);
        WebElement mobile=driver.findElement(By.name("reg_email__"));
        mobile.sendKeys("6302171037");
        
        Thread.sleep(2000);
        
        
        WebElement pass=driver.findElement(By.name("reg_passwd__"));
        pass.sendKeys("sallappa@007");
        
        Thread.sleep(2000);
        
        WebElement day=driver.findElement(By.name("birthday_day"));
        new Select(day).selectByIndex(0);
        
        Thread.sleep(2000);
        
        WebElement month=driver.findElement(By.name("birthday_month"));
        new Select(month).selectByIndex(3);
        
        Thread.sleep(2000);
        
        
        WebElement year=driver.findElement(By.name("birthday_year"));
        new Select(year).selectByValue("2000");
        
        Thread.sleep(2000);
        
        WebElement sex=driver.findElement(By.className("_8esa"));
        sex.click();
        
        Thread.sleep(2000);
        
        WebElement login=driver.findElement(By.name("websubmit"));
		
		login.click();
		
		Thread.sleep(2000);
		
	}

}
