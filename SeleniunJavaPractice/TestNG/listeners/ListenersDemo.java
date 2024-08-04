/**
 * 
 */
package listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author AMAR (Topic :-- Listeners)
 *  Listeners:- when we executed test some methods maybe Fail/pass/skipped to capture that status ,we use it.
 *  Using implements ITestListeners Interface or extends TestListenerAdapter we can implement it in Project.
 *  create XML File and add this Syntax before Test tag and after Suite tag to run the code from TestNG.Xml File to get Listeners Results
 *  <listeners>
    <listener class-name="packagename.classname"></listener>
    </listeners>
 *  We can directly used @Listeners Annotation in the class to execute it w/o using XML file,But it's not recommended
 *   because we need one  Reports for Project level.so Suite level create is best Approach.
 * 
 */
// @Listeners(listeners.ListenerClass.class)
public class ListenersDemo {

	WebDriver driver;

	@BeforeClass
	public void setUp() throws Throwable {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

	@Test(priority = 0)
	public void testCompanyLogo() {

		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed());
	}

	@Test(priority = 2)
	public void testCompanyTitle() {

		Assert.assertEquals(driver.getTitle(), "rangeHRM");
	}

	@Test(priority = 3, dependsOnMethods = { "testCompanyTitle"})
	public void testCompanyUrl() {
		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Assert.assertEquals(driver.getCurrentUrl(), expurl);
	}

	@Test(priority = 5)
	public void checkForgotPasswordLink() {
		Assert.assertTrue(
				driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"))
						.isDisplayed());
	}

}
