package seleniumCode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajax_Dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Bharat");
		Thread.sleep(3000);
		// Capture All Suggestions
		//we can direct use findElements method with x-path or below  Syntax to capture all suggestions...........
		List<WebElement> sugestionlist = driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
		// Print Number of Suggestion Available............................................................
		System.out.println("Total Number of Suggestion Links :" + sugestionlist.size());
		// Print all suggestions.....................................
		for (WebElement list : sugestionlist) {

			System.out.println(list.getText());

		}
		Thread.sleep(4000);
		// Click a specific Link.....................................
		boolean linkpresent = false;
		for (WebElement list : sugestionlist) {

			if (list.getText().contains("janata party")) {
				list.click();
				linkpresent = true;
				break;
			}
		}
		if (!linkpresent) {
			System.out.println("Link is not Availble");
		}

	}

}
