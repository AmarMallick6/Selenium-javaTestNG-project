package com.myshop.objectpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myshop.base.BaseClass;

public class ForgotPasswordPage extends BaseClass {
	public ForgotPasswordPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement enterEmailElement;
	@FindBy(xpath = "//span[normalize-space()='Retrieve Password']")
	private WebElement retrivePaswordElement;

	public void clickRetrivePassword(String Email) {
		enterEmailElement.sendKeys(Email);
		retrivePaswordElement.click();
	}

	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement confirmMessage;

	public boolean isDisplayedSendConfirmationMessage() {
		return confirmMessage.isDisplayed();
	}

	@FindBy(xpath = "//p[contains(text(),'Please enter the email address you used to registe')]")
	private WebElement emailrequired;

	public boolean isDisplayedEMailAdressRequired() {
		return emailrequired.isDisplayed();
		
	}

}
