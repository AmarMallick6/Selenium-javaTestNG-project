/**
 * 
 */
package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class ImplicityWait {

	
	public static void main(String[] args) {
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	}

}
