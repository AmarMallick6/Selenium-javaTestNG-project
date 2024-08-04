package seleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// (1)TagName#IDName or #IDName
		// (2)TagName.ClassName or .ClassName
		// (3)TagName[AttributeName='AttributeValue']

		// (4)TagName.ClassName[AttributeName='AttributeValue']

	}

}
