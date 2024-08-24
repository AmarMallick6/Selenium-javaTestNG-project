package com.myshop.objectpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myshop.base.BaseClass;

public class OrderConfirmationPage extends BaseClass {
	
	public  OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
 @FindBy (xpath = "//p[contains(@class,'alert-success')]")
 private WebElement ordercompletemsg;
 public boolean isDisplayedOrderCompleteMessage() {
	  return    ordercompletemsg.isDisplayed();
}
}
