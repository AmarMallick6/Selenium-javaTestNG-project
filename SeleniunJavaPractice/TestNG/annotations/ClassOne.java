/**
 * 
 */
package annotations;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author AMAR
 * Annotation used for Organizing and managing Test cases Properly.
 * It's  providing flexibility and control over the test execution flow in TestNG.
 * Multiple Annotations are available in TestNG Such as-@Test,@BeforeMethod,@AfterMethod,@BeforeClass,@AfterClass,
 *       @BeforeTest,@AfterTest,@BeforeSuite and AfterSuite  e.t.c
 * @Test :--Used for executing the code of  any methods  as a Test Method in TestNG . It's work like Java Main Methods.
 * @BeforeMethod:--It's Execute Before each  @TestMethod(It's Execution depends on how many @TestMethods Available in aClass.)
 * @AfterMethod:--It's Execute After each  @TestMethod(It's Execution depends on how many @TestMethods Available in aClass.)
 * @BeforeClass:-- Runs once before the first test method in the current class.(Used for one-time setup tasks)
 * @AfterClass:--Runs once After the last test method in the current class.(Used for one-time clean-up tasks)
 * @AfterTest:--Runs before any test method belonging to the classes inside the <test> tag is run.
 * @BeforeTest:--Runs after  all test method belonging to the classes inside the <test> tag is run.
 * @BeforeSuite:--Runs before all tests in current suite have run.
 * @AfterSuite:--Runs after all tests in current suite have run.
 * @BeforeGroups:--Runs before the first test method in any of the specified groups.(Used for group-specific setup.)
 * @AfterGroups:--Runs after the last test method in any of the specified groups.(Used for group-specific clean-up.)
 * @DataProvider:--Provides data to a test method.(useful for Data Driven Testing)
 */
public class ClassOne {
	@BeforeSuite
	public void  beforeSuiteMethod() {
		System.out.println("BeforeSuiteMethod run Sucessfully ");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTestMethod run Sucessfully ");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTestMethod run Sucessfully ");
	}
	@AfterSuite
	public void  afterSuiteMethod() {
		System.out.println("AfterSuiteMethod run Sucessfully ");
	}
	@BeforeClass
	public void  beforeClassMethod() {
		System.out.println("BeforeClassMethod run Sucessfully :"+"Browser Open");
	}
	
	@BeforeMethod
	public void  logInTest() {
		System.out.println("BeforeMethod run Sucessfully :"+"App Login Pass");
	}
	@Test
	public void searchProductTest() {
		System.out.println("Product Available");
		
	}
	@Test
	public void addToCartProductTest() {
		System.out.println("Product Add SucessFully");
		
	}
	@Test
	public void orderProductTest() {
		System.out.println("Product Order SucessFully");
		
	}
	@AfterMethod
	public void  logOutTest() {
		System.out.println("AfterMethod run Sucessfully:"+"App LogOut Pass");
	}
	@AfterClass
	public void  afterClassMethod() {
		System.out.println("AfterClassMethod run Sucessfully :"+"Browser Close");
	}

}
