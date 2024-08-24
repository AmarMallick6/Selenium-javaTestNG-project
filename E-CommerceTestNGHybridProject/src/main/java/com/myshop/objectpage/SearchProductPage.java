package com.myshop.objectpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.myshop.base.BaseClass;

public class SearchProductPage extends BaseClass {
	public SearchProductPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='lighter']")
	private WebElement productText;

	public boolean isProductDisplayed() {
		return productText.isDisplayed();

	}

	@FindBy(xpath = "//p[@class='alert alert-warning']")
	private WebElement warningAlert;

	public String alertMessageOfProduct() {
		return warningAlert.getText();

	}
	@FindBy(xpath = "//select[@id='selectProductSort']")
	private WebElement selectproduct;
	public void sortProductList(String value) {
		selectproduct.click();
		Select sc= new Select(selectproduct);
		sc.deselectByVisibleText(value);
	}
@FindBy(linkText = "Printed Summer Dress")
	private WebElement productname ;
	public  AddToCartPage clickOnProduct () {
		productname.click();
		 return new AddToCartPage();
		
	}

}
