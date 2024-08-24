package com.myshop.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myshop.base.BaseClass;
import com.myshop.objectpage.HomePage;
import com.myshop.objectpage.IndexPage;
import com.myshop.objectpage.LogInPage;

public class LogInTest extends BaseClass {
	IndexPage indexPage;
	LogInPage logInPage;
	HomePage homePage;

	@BeforeMethod
	public void setUp() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyLogInWithValidCredentials() {
		indexPage = new IndexPage();
		logInPage = indexPage.clickSignInLink();
		homePage = logInPage.clickSignInButton("mallick@gmail.com", "Shop123");
		boolean status = homePage.isDisplayedWelcomeToYourAccountMessage();
		if (status == true) {
			homePage.clickSignOut();
		} else {
			Assert.fail("HomePage is Not Found");
		}
	}

	@Test(priority = 2)
	public void verifyLogInWithInvalidCredentials() {
		indexPage = new IndexPage();
		logInPage = indexPage.clickSignInLink();
		logInPage.clickSignInButton("mall67ick@gmail.com", "Shop15423");
		Assert.assertTrue(logInPage.isAuthnticationFailMessageDisplayed());

	}

	@Test(priority = 3)
	public void verifyLogInwithoutAnyCredentials() {
		indexPage = new IndexPage();
		logInPage = indexPage.clickSignInLink();
		logInPage.clickSignIn();
		Assert.assertTrue(logInPage.isDisplayedEmailAdressRequired());

	}

	@Test(priority = 4)
	public void verifyLogInwithValidEmailAndInvalidPasswordCredentials() {
		indexPage = new IndexPage();
		logInPage = indexPage.clickSignInLink();
		logInPage.clickSignInButton("mallick@gmail.com", "Shop15423");
		Assert.assertTrue(logInPage.isAuthnticationFailMessageDisplayed());

	}

	@Test(priority = 5)
	public void verifyLogInwithInvalidEmailAndValidPasswordCredentials() {
		indexPage = new IndexPage();
		logInPage = indexPage.clickSignInLink();
		logInPage.clickSignInButton("mall67ick@gmail.com", "Shop123");
		Assert.assertTrue(logInPage.isAuthnticationFailMessageDisplayed());

	}

}
