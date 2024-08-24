package com.myshop.objectpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myshop.base.BaseClass;

public class LogInPage extends BaseClass {
	public LogInPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement logInEmailElement;
	@FindBy(id = "passwd")
	private WebElement logInpaswordElement;
	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	private WebElement SignInElement;

	public void clickSignIn() {
		SignInElement.click();
	}

	public HomePage clickSignInButton(String username, String password) {
		logInEmailElement.sendKeys(username);
		logInpaswordElement.sendKeys(password);
		SignInElement.click();
		return new HomePage();
	}

	@FindBy(xpath = "//li[normalize-space()='Authentication failed.']")
	private WebElement AuthenticationError;

	public boolean isAuthnticationFailMessageDisplayed() {
		return AuthenticationError.isDisplayed();

	}

	@FindBy(xpath = "//li[normalize-space()='An email address required.']")
	private WebElement emailReuiredElement;

	public boolean isDisplayedEmailAdressRequired() {
		return emailReuiredElement.isDisplayed();
	}

	@FindBy(id = "email_create")
	WebElement EmailAdress;

	@FindBy(xpath = "//span[normalize-space()='Create an account']")
	private WebElement CreateAnAccount;

	public AccountCreationPage clickCreateAnAccount(String Email) {
		EmailAdress.sendKeys(Email);
		CreateAnAccount.click();
		return new AccountCreationPage();
	}

	public ForgotPasswordPage clickForgotPasswrddWithEmail(String email) {
		logInEmailElement.sendKeys(email);
		forgotPwdElement.click();
        return new ForgotPasswordPage();
        
	}

	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotPwdElement;

	public ForgotPasswordPage clickForgotPassword() {
		forgotPwdElement.click();
		return new ForgotPasswordPage();
	}

}
