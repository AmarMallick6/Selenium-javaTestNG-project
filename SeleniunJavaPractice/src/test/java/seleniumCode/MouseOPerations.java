package seleniumCode;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOPerations {

	public static void main(String[] args) throws Throwable {
		/*
		 * Actions :- It is a class which is used to perform mouse/keyboard operations.
		 * Action :- It is an Interface used as   store the  created actions.
		 * Actions class take driver as parameter
		 * W/o Build().Perform() method it does not  execute the code.
		 * Build() :- used to compile the code 
		 * Perform() :- used to execute the code , we can directly used perform method if you want to execute code immediately.
		 * Internally perform method execute build and perform method.
		 * 
		 */
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.meesho.com");
	    WebElement Main_Link = driver.findElement(By.xpath("//span[text()='Men']"));
	    WebElement sub_Link =driver.findElement(By.xpath("//a[@href='/accessories-men/pl/3tp']"));
	    Actions as= new Actions(driver);
	  
	   //Hover Actions>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	    as.moveToElement(Main_Link).moveToElement(sub_Link).click().perform();
	   
	    driver.navigate().to("https://testautomationpractice.blogspot.com/");
	    //Double click Actions>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            WebElement btn = driver.findElement(By.xpath(" //button[normalize-space()='Copy Text']"));
             as.doubleClick(btn).perform();
             Thread.sleep(2000);
         //Drag and Drop  click Actions>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
             WebElement src =driver.findElement(By.id("draggable"));
             WebElement target =driver.findElement(By.id("droppable"));
             as.dragAndDrop(src, target).perform();
            
           

	}

}
