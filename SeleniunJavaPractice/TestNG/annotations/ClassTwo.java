/**
 * 
 */
package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassTwo {

	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("BeforeClassMethod run Sucessfully :" + "Browser Open & App Login Pass ");
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

	@AfterClass
	public void afterClassMethod() {
		System.out.println("AfterClassMethod run Sucessfully :" + "App LogOut Pass  & Browser Close");
	}

}
