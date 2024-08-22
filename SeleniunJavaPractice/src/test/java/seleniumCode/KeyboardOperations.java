package seleniumCode;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOperations {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.text-compare.com");
		Actions act =new Actions(driver);
	    driver.findElement(By.id("inputText1")).sendKeys("Welcome Amar Kumar");
	    
		 //CONTROL+ A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		//CONTROL + C
	    act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		//Press Tab Key
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 //CONTROL+ V
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		//sendKeys using character small/capital letter is make same functions...................
	}

}
