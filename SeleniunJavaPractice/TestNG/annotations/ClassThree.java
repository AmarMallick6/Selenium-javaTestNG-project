package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassThree {
	@BeforeMethod
	public void  logInTest() {
		System.out.println("BeforeMethod run Sucessfully ");
	}
	@Test
	public void searchProductTest() {
		System.out.println("Product Available");
		
	}
	@AfterMethod
	public void  logOutTest() {
		System.out.println("AfterMethod run Sucessfully");
	}

}
