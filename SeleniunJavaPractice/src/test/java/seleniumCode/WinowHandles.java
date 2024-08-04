/**
 * 
 */
package seleniumCode;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class WinowHandles {
	public static void main(String[] arg) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.className("wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> links = driver.findElement(By.cssSelector(".wikipedia-search-results")).findElements(By.tagName("a"));
		
		for (WebElement linklist : links) {
			linklist.click();
		}
		
		//Get Window Handles & close some specific Windows >>>>>>>>>>>>>>>>>>>>>>>>>>>> 
		Set<String> Allwindow = driver.getWindowHandles();

		for (String windowid : Allwindow) {
			String wtitle = driver.switchTo().window(windowid).getTitle();
			System.out.println(wtitle);
			if (wtitle.equals("Selenium (software) - Wikipedia") || wtitle.equals("Selenium - Wikipedia")) {
				driver.close();
			}

		}

	}
}
