/**
 * 
 */
package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;


public class FiuentWait {

	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2))
			       .ignoring(NoSuchElementException.class);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    WebElement usernametxt = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//input[@placeholder='Username']"));
		  }
		      });
	    usernametxt.sendKeys("Admin");
	   driver.close();
	}
}
