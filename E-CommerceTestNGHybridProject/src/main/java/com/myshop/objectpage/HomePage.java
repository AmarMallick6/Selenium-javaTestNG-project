package com.myshop.objectpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myshop.base.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//p[@class='info-account']")
	private WebElement welcomeMessageElement;

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	public boolean isDisplayedWelcomeToYourAccountMessage() {
		return welcomeMessageElement.isDisplayed();

	}

	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement sucessmessage;

	public boolean isDisplayedAcSucessfullyCreated() {
		return sucessmessage.isDisplayed();
	}

	@FindBy(linkText = "Sign out")
	private WebElement signoutButton;

	public void clickSignOut() {
		signoutButton.click();
	}
}
