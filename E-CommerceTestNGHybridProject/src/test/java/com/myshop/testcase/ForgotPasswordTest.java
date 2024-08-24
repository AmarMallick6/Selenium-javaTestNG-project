package com.myshop.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myshop.base.BaseClass;
import com.myshop.objectpage.ForgotPasswordPage;
import com.myshop.objectpage.IndexPage;
import com.myshop.objectpage.LogInPage;

public class ForgotPasswordTest extends BaseClass {
	IndexPage indexPage;
	LogInPage logInPage;
	ForgotPasswordPage forgotPasswordPage;

	@BeforeMethod
	public void setUp() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyForgotPasswordWithEnteringValidEmail() {
		indexPage = new IndexPage();
		logInPage = indexPage.clickSignInLink();
		forgotPasswordPage = logInPage.clickForgotPasswrddWithEmail("mallick@gmail.com");
		forgotPasswordPage.clickRetrivePassword("mallick@gmail.com");
		Assert.assertTrue(forgotPasswordPage.isDisplayedSendConfirmationMessage());
	}

	@Test(priority = 2)
	public void verifyForgotPasswordWithOutEnteringEmail() {
		indexPage = new IndexPage();
		logInPage = indexPage.clickSignInLink();
		forgotPasswordPage = logInPage.clickForgotPassword();
		Assert.assertTrue(forgotPasswordPage.isDisplayedEMailAdressRequired());
	}

}
