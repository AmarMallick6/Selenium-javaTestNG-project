package com.myshop.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myshop.base.BaseClass;
import com.myshop.objectpage.AddToCartPage;
import com.myshop.objectpage.IndexPage;
import com.myshop.objectpage.OrderPage;
import com.myshop.objectpage.SearchProductPage;

public class OrderPageTest extends BaseClass {
	
	IndexPage indexPage;
	SearchProductPage searchProductPage;
	AddToCartPage addToCartPage;
	OrderPage orderPage;

	@BeforeMethod
	public void setUp() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
@Test
public void verifyOrderPageTest() throws Throwable  {
    	indexPage=new IndexPage();
     searchProductPage   = 	indexPage.searchProduct("Dresses");
     addToCartPage  = searchProductPage.clickOnProduct();
     addToCartPage.changeProductSize("M");
     addToCartPage.clickAddToCart();
     Assert.assertTrue(addToCartPage.isDisplayedAddProductSucessfully());
        orderPage    =  addToCartPage.clickProceedToCheckout();
        Assert.assertTrue(driver.getTitle().contains("Order - My Shop"));
       orderPage.clickOrderPageCheckout();
}


}
