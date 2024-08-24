package com.myshop.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myshop.base.BaseClass;
import com.myshop.objectpage.AccountCreationPage;
import com.myshop.objectpage.HomePage;
import com.myshop.objectpage.IndexPage;
import com.myshop.objectpage.LogInPage;


public class AccountCreationTest  extends BaseClass{
	IndexPage indexPage;
	LogInPage logInPage;
	AccountCreationPage accountcreatePage;
	HomePage homePage;

	@BeforeMethod
	public void setUp() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test 
	  public void verifyRegisterAccountWithMandatoryField() { 

			indexPage = new IndexPage();
			logInPage = indexPage.clickSignInLink();
			accountcreatePage = logInPage.clickCreateAnAccount("madhu@gmail.com");
			homePage = accountcreatePage.registerAccountWithMandatoryFields("Madhu", "Das", "Das123");
			Assert.assertTrue(homePage.isDisplayedAcSucessfullyCreated());

	  }
	  

}
