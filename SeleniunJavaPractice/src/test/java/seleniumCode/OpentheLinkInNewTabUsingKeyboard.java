package seleniumCode;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpentheLinkInNewTabUsingKeyboard {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Actions act =new Actions(driver);
		WebElement Forget_pwd = driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']"));
		//CONTROL+ click
		act.keyDown(Keys.CONTROL).click(Forget_pwd).keyUp(Keys.CONTROL).perform();
		
		//Handle Window
		String cw = driver.getWindowHandle();
		System.out.println("Current Window ID :"+ cw  );
		System.out.println("Current page url :" + driver.getCurrentUrl());
		 Set<String> id = driver.getWindowHandles();
		 ArrayList<String> ids = new ArrayList<String>(id);
		 String Loginpage = ids.get(0);
		 String Forgtpwdpage = ids.get(1);
		 driver.switchTo().window(Forgtpwdpage);
		 driver.findElement(By.xpath("//input[@value='Reset Password']")).click();
		 driver.switchTo().window(Loginpage);  //Switch to home page 
		 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		 driver.quit();

	}

}
