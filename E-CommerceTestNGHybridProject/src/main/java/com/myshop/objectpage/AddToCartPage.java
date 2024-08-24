/**
 * 
 */
package com.myshop.objectpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.myshop.base.BaseClass;

/**
 * 
 */

public class AddToCartPage extends BaseClass {

	public AddToCartPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement sizeElement;
	@FindBy(xpath = "//span[normalize-space()='Add to cart']")
	private WebElement addtocartlink;

	public void changeProductSize(String size) {

		Select sc1 = new Select(sizeElement);
		sc1.selectByVisibleText(size);
	}


	public  void clickAddToCart() throws Throwable {
		addtocartlink.click();
		Thread.sleep(3000);
	}	
	@FindBy(xpath="//h2[normalize-space()='Product successfully added to your shopping cart']")
    private WebElement alertsucessfullyaddtocart;
	public boolean isDisplayedAddProductSucessfully() {
		return  alertsucessfullyaddtocart.isDisplayed();
	}
	@FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
	private WebElement chckoutlink;

public OrderPage clickProceedToCheckout () {
	 chckoutlink.click();
	 return new OrderPage();
}

}
