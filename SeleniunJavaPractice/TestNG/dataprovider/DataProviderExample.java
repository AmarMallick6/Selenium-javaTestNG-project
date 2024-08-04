/**
 * 
 */
package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author AMAR (Topic :- DataProvider in TestNG)
 * DataProvider used to create  the data and return the data in define Test Methods.
 * It is used in Data driven Testing.
 * We create @DataProvider Annotation before to create Test data Method,need to specify name of the DataProvider(Name should be Unique)
 * Most of the time it Return object type Array[][] .
 * Need to mention dataProvider parameters in Test Methods.
 * If you want to run some specific data you can use indices Parameters in DataProvider Annotations.(Indices works like Specific index number not the range of index)
 * Do n't need to create Looping Statements to read multiple data ,Internally it works like Enhance For-Loop Concepts.
 * NOTE ::--In the below   Example  is  Hard coding Data inside the class(where the data number is less we can use this without creating Excel File For DataProvider)
 */
public class DataProviderExample {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

	@Test(dataProvider = "LogData")
	public void LogInTest(String username, String pwd) {
		driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("  //input[@placeholder='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		boolean output = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).isDisplayed();
		if (output == true) {
			driver.findElement(By.xpath(" //span[@class='oxd-userdropdown-tab']")).click();
			driver.findElement(By.xpath(" //a[normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		} else {
			Assert.fail("Error in Code");
		}

	}

	@DataProvider(name = "LogData", indices = { 0, 2 })
	public Object[][] LogInData() {
		Object data[][] = { { "Ashok", "Ashok132" },
				{ "Anil", "Anil232" },
				{ "Admin", "admin123" },	
				{ "Abhaya", "abhaya143" } };
			
		return data;
	}

}
