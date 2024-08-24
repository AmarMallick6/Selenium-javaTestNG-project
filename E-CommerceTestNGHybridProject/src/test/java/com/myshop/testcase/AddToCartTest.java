package com.myshop.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myshop.base.BaseClass;
import com.myshop.objectpage.AddToCartPage;
import com.myshop.objectpage.IndexPage;
import com.myshop.objectpage.SearchProductPage;

public class AddToCartTest  extends BaseClass{
	IndexPage indexPage;
	SearchProductPage searchProductPage;
	AddToCartPage addToCartPage;
	

	@BeforeMethod
	public void setUp() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
@Test
public void validProductAddToCartTest() throws Throwable  {
    	indexPage=new IndexPage();
     searchProductPage   = 	indexPage.searchProduct("Dresses");
     addToCartPage  = searchProductPage.clickOnProduct();
     addToCartPage.changeProductSize("M");
     addToCartPage.clickAddToCart();
     Assert.assertTrue(addToCartPage.isDisplayedAddProductSucessfully());
     
}

}
