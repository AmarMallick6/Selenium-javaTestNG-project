package seleniumCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandle {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		 WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		 WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame1).findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Selenium Java");
		driver.switchTo().defaultContent();    //use to return Main Page Document
		driver.switchTo().frame(frame4).findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Selenium Java");
		 driver.switchTo().defaultContent();
		 WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	   driver.switchTo().frame(frame3);
	   driver.switchTo().frame(0);  // using   frame( Index ) concepts  handle inner Iframe of Frame3
	    driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='i19']//div[@class='uHMk6b fsHoPb']")).click();
	}

}
