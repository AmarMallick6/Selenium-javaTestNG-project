/**
 * 
 */
package paralleltest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author AMAR (TOPIC ::--Run Parallel Test  and Serial Test in TestNG
Step-01 :: Create Test Cases
Step-02 :: Create TestNG.xml File and Run Test cases through XML File.
Step-03 :: Parameterized  Browser Name  Using XML File and SetUp Methods.
Step-04 :: Execute   Test cases in Various browser one after another(Serial Execution)
Step-05 :: Execute   Test cases in Various browser in Single shot(Parallel Execution) 
(Note:-- Using parallel parameters in Suite level in XML File we can convert Serial Execution in to Parallel Execution)
 */
public class Parallel_TestDemo {
	WebDriver driver;
    @Parameters({"browser"})
	@BeforeClass
	public void setUp(String br) throws Throwable {
    	switch (br.toLowerCase()) {
		case "chrome": driver=new ChromeDriver();break;
		case  "edge": driver=new EdgeDriver();break;	
		case "firefox": driver=new  FirefoxDriver();break;
		default:System.out.println("Browser is not Found");
		return;
			
		}
		
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

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@Test(priority = 3)
	public void testCompanyUrl() {
		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Assert.assertEquals(driver.getCurrentUrl(), expurl);
	}
	@Test(priority = 5)
	public void checkForgotPasswordLink() {
		Assert.assertTrue(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).isDisplayed());
	}
}
