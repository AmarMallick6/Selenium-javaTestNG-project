package com.myshop.objectpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myshop.base.BaseClass;

public class IndexPage extends BaseClass {

	public IndexPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "login")
	private WebElement SignIn;

	public LogInPage clickSignInLink() {
		SignIn.click();
		return new LogInPage();

	}

	@FindBy(id = "search_query_top")
	private WebElement searchInput;
	@FindBy(name = "submit_search")
	private WebElement searchButton;

	public SearchProductPage searchProduct(String productname) {
		searchInput.clear();
		searchInput.sendKeys(productname);
		searchButton.click();
		return new SearchProductPage();

	}

}
