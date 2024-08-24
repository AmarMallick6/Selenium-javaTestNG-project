package com.myshop.objectpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.myshop.base.BaseClass;

public class AddressPage extends BaseClass {
	@FindBy(xpath = "//h1[normalize-space()='Your addresses']")
	private WebElement addressText;

	public boolean isDisplayedAddressPage() {
		return addressText.isDisplayed();
	}

	@FindBy(xpath = "//input[@id='address1']")
	private WebElement addressElement;
	@FindBy(xpath = "//input[@id='city']")
	private WebElement cityElement;
	@FindBy(xpath = "//select[@id='id_state']")
	private WebElement statenameElement;
	@FindBy(xpath = "//input[@id='postcode']")
	private WebElement postcodElement;

	@FindBy(xpath = "//input[@id='phone_mobile']")
	private WebElement mobile;
	@FindBy(xpath = "//input[@id='alias']")
	private WebElement addressTitleElement;
	@FindBy(xpath = "//span[normalize-space()='Save']")
	private WebElement saveButton;

	public AddressPage() {
		PageFactory.initElements(driver, this);
	}

	public void addNewAddress(String addressname, String cityname, String state, String postalcode, String mobnumber,String addressTitle) {
		addressElement.sendKeys(addressname);
		cityElement.sendKeys(cityname);
		Select sc1 = new Select( statenameElement);
		sc1.selectByVisibleText(state);
		statenameElement.sendKeys(state);
		postcodElement.sendKeys(postalcode);
		mobile.sendKeys(mobnumber);
		addressTitleElement.sendKeys(addressTitle);
		saveButton.click();

	}
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	private WebElement checkoutElement;
	public ShippingPage clickCheckOut() {
		 checkoutElement.click();
		 return new ShippingPage();
	}

}
