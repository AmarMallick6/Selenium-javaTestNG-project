/**
 * 
 */
package topic_Dependency;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * @author AMAR (use parameter of dependsOnMethods in TestNG) If Application is
 *         not Login SucessFully then no need to try to Execute Further Test
 *         ,Using dependsOnMethods we can skip it.
 */
public class DepentsOnMethod {
	WebDriver driver;
	@BeforeClass
	void setUp() {
	 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://Amazon.com");
		System.out.println("App Launched SucessFully");
	}

	@Test(priority = 1)
	void Login() {
		Assert.assertTrue(false, "App LogIn Not SucessFull");

	}

	@Test(priority = 2, dependsOnMethods = " Login")
	void SearchProduct() {
		Assert.assertTrue(true, "Search Product is  Not Available");

	}

	@Test(priority = 3)
	void AddToCart() {
		Assert.assertTrue(true, "Search Product is  Not Added");

	}

	@Test(priority = 4)
	void Payment() {
		Assert.assertTrue(true, "Payment is Not Completed");

	}

	@AfterClass
	void tearDown() {
		driver.close();
		System.out.println("Browser is Closed");
	}

}
