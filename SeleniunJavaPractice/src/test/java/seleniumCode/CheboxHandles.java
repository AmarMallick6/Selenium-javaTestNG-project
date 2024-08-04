package seleniumCode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheboxHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testautomationpractice.blogspot.com/");
	//Handle single check box Element>>>>>>>>>>>>>>>>>>>
		// driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		
	//Handle multiple  check box Element>>>>>>>>>>>>>>>>>>>
    List<WebElement> Allcheckbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
     for (WebElement checkbox:Allcheckbox) {
    	 checkbox.click();
     }
   //Handle first 2 check box Element>>>>>>>>>>>>>>>>>>> 
     for (int i = 0; i < 2; i++) {
		    Allcheckbox.get(i).click();
     }	
     
     //Handle Last  2 check box Element>>>>>>>>>>>>>>>>>>> 
     // i  Index value  is Total check box size - how much check box want to handle
     for (int i = 5; i < Allcheckbox.size(); i++) {
		    Allcheckbox.get(i).click();
  }	
	}

}
