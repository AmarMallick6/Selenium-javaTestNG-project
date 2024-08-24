package com.myshop.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myshop.base.BaseClass;
import com.myshop.objectpage.IndexPage;
import com.myshop.objectpage.SearchProductPage;

public class ProductSearchTest extends BaseClass {
	IndexPage indexPage;
	SearchProductPage searchPage;

	@BeforeMethod
	public void setUp() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifySearchProductTestWithValidProduct() throws Throwable {

		indexPage = new IndexPage();
		searchPage = indexPage.searchProduct("Dresses");
		Assert.assertTrue(searchPage.isProductDisplayed());
		searchPage.sortProductList("In stock");
		Thread.sleep(7000);

	}

	@Test(priority = 2)
	public void verifySearchProductTestWithInvalidProduct() {
		indexPage = new IndexPage();
		searchPage = indexPage.searchProduct("Drones");
		Assert.assertTrue(searchPage.alertMessageOfProduct().contains("No results were found for your search"));

	}

	@Test(priority = 3)
	public void verifySearchProductTestWithoutEnterProduct() {
		indexPage = new IndexPage();
		searchPage = indexPage.searchProduct("");
		Assert.assertEquals(searchPage.alertMessageOfProduct(), "Please enter a search keyword");

	}

}
