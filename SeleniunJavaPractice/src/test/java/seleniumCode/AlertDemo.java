package seleniumCode;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	    //  wait.until(ExpectedConditions.alertIsPresent());
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		     Alert al = driver.switchTo().alert();
		      String s = al.getText();
		      System.out.println(s);
		      al.sendKeys("Welcome Amar");
		      al.accept();
	}

}
