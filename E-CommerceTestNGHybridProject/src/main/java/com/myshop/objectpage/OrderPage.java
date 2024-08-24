package com.myshop.objectpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myshop.base.BaseClass;

public class OrderPage extends BaseClass {
	
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
	private WebElement orderPageCheckout;
	public LogInPage clickOrderPageCheckout() {
		 orderPageCheckout.click();
		 return new LogInPage();
	}

}
