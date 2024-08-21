/**
 * 
 */
package seleniumCode;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author MAK
 * Alert is not a WebElement
 * Alert Handle Syntax=driver.switchTo().alert();
 * Alert 3 types such as normal Alert ,  Confirm Alert  and Prompt Alert
 * Auntheticate pop-up/Alert we can not handle using Switch To().alert()
 * 
 */
public class AlertHandles {

	
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
		Thread.sleep(3000);   // used for see the action it is not mandatory for real code...
		//Syntax of Move driver from browser to Alert and accept Alert>>>>>>>>>>>>>>>>
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click();
		Thread.sleep(3000); 
		//Syntax of Move driver from browser to Alert and Cancel Alert>>>>>>>>>>>>>>>>
		driver.switchTo().alert().dismiss();
		 driver.findElement(By.xpath("//button[normalize-space()='Prompt']")).click();
		  Alert  promptAlert = driver.switchTo().alert();
		  Thread.sleep(3000); 
		  // Get the message text displayed in the alert
		   String   Alerttxt = promptAlert.getText();
		   System.out.println(Alerttxt);
		   // Sent the message text  in the alert
		  promptAlert.sendKeys("Mallick");
		// Accept the alert (click OK)
		   promptAlert.accept();
		   
		     
		     
	}

}
