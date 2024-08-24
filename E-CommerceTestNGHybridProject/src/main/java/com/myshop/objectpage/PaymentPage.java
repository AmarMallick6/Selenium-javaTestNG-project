package com.myshop.objectpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myshop.base.BaseClass;

public class PaymentPage extends BaseClass {
	public PaymentPage () {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy (xpath = "//a[@class='bankwire']")
	private WebElement bankwirElement;
	public void clickPayByBank() {
		bankwirElement.click();
		
	}
	@FindBy(xpath = "//span[text()='I confirm my order']")
	private WebElement confirmorder;
	public OrderConfirmationPage clickConfirmOrder() {
		 confirmorder.click();
		 return new OrderConfirmationPage();
		
	}
}
