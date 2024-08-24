package com.myshop.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myshop.base.BaseClass;
import com.myshop.objectpage.AddToCartPage;
import com.myshop.objectpage.AddressPage;
import com.myshop.objectpage.IndexPage;
import com.myshop.objectpage.LogInPage;
import com.myshop.objectpage.OrderConfirmationPage;
import com.myshop.objectpage.OrderPage;
import com.myshop.objectpage.PaymentPage;
import com.myshop.objectpage.SearchProductPage;
import com.myshop.objectpage.ShippingPage;

public class End_To_EndTest extends BaseClass {
	IndexPage indexPage;
	SearchProductPage searchProductPage;
	AddToCartPage addToCartPage;
	OrderPage orderPage;
	 LogInPage   logInPage ;
	 AddressPage addressPage;
	 ShippingPage shippingPage;
	 PaymentPage paymentPage;
	 OrderConfirmationPage orderConfirmationPage;
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
	indexPage = new IndexPage();
	searchProductPage = indexPage.searchProduct("Dresses");
	addToCartPage = searchProductPage.clickOnProduct();
	addToCartPage.changeProductSize("M");
	addToCartPage.clickAddToCart();
	Assert.assertTrue(addToCartPage.isDisplayedAddProductSucessfully());
	orderPage = addToCartPage.clickProceedToCheckout();
	Assert.assertTrue(driver.getTitle().contains("Order - My Shop"));
	logInPage = orderPage.clickOrderPageCheckout();
	logInPage.clickSignInButton("mallick@gmail.com", "Shop123");
	addressPage = new AddressPage();
	addressPage.addNewAddress("Trump Lane", "	Chitina", "Alaska", "99566", "9436545621", "Office");
	shippingPage = addressPage.clickCheckOut();
	shippingPage.clickTermOfServiceCheckBox();
	paymentPage = shippingPage.clickProceedToCheckOut();
	paymentPage.clickPayByBank();
	orderConfirmationPage    =paymentPage.clickConfirmOrder();
	Assert.assertTrue(orderConfirmationPage.isDisplayedOrderCompleteMessage());
}


}
