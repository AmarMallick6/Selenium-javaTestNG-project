package com.myshop.objectpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myshop.base.BaseClass;

public class AccountCreationPage extends BaseClass {
	public AccountCreationPage() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h1[text()='Create an account']")
	private WebElement createAccountElement;

	public boolean isAccountCreationPageDisplayed() {
		return createAccountElement.isDisplayed();
	}
	@FindBy(id = "customer_firstname")
	private WebElement firstNamElement;
	@FindBy(id = "customer_lastname")
	private WebElement laststNamElement;
	@FindBy(id = "passwd")
	private WebElement passwordElement;
	@FindBy(xpath = "//span[normalize-space()='Register']")
	private WebElement registerElement;

	public HomePage registerAccountWithMandatoryFields(String FirstName, String LastName, String Password) {
		firstNamElement.sendKeys(FirstName);
		laststNamElement.sendKeys(LastName);
		passwordElement.sendKeys(Password);
		registerElement.click();
		return new HomePage();

	}

}
