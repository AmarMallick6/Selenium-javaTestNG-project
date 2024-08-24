package com.myshop.objectpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myshop.base.BaseClass;

public class ShippingPage extends BaseClass {
	public ShippingPage() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id = "cgv")
private WebElement checkboxElement;
public void clickTermOfServiceCheckBox() {
	 checkboxElement.click();
}

@FindBy(xpath = "//button[@name='processCarrier']")
private WebElement proceedtocheckElement;

public PaymentPage clickProceedToCheckOut() {
	proceedtocheckElement.click();
	return new PaymentPage();
}

}
