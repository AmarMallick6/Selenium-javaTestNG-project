/**
 * 
 */
package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 */
public class ExplicityWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
    //Declaration of Explicitly Wait>>>>>>>>>>>>>>>>>>>>>>>>>>
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	// Initialization >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	  WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Admin");

	}

}
