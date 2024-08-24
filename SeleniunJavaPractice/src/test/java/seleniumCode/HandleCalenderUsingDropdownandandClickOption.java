package seleniumCode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleCalenderUsingDropdownandandClickOption {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");

//		Select se= new Select(driver.findElement(By.xpath("//select[@aWria-label='Select year']")));
//		se.selectByVisibleText("2027");
		String cur_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println(cur_month);
		while (cur_month.equals("June")) {
			break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

	}

}
