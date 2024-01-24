package com.project.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.project.testCases.Base;

public class prodOrder extends Base {

	public prodOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	By mainLogo = By.xpath("//a[@class='logo']");

	public WebElement mainLogo() {
		return driver.findElement(mainLogo);
	}

	By prodImg = By.xpath("(//li[@class='product-item'])[3]");

	public WebElement prodImg() {
		return driver.findElement(prodImg);
	}

	By selectSize = By.id("option-label-size-143-item-169");

	public WebElement selectSize() {
		return driver.findElement(selectSize);
	}

	By selectColor = By.id("option-label-color-93-item-52");

	public WebElement selectColor() {
		return driver.findElement(selectColor);
	}

	By AddToCartBtn = By.id("product-addtocart-button");

	public WebElement AddToCartBtn() {
		return driver.findElement(AddToCartBtn);
	}

	By showCartBtn = By.xpath("//div[@class='minicart-wrapper']/a");

	public WebElement showCartBtn() {
		return driver.findElement(showCartBtn);
	}

	By checkoutBtn = By.id("top-cart-btn-checkout");

	public WebElement checkoutBtn() {
		return driver.findElement(checkoutBtn);
	}

	By shoppingCartCounter = By.cssSelector(".counter-number");

	public WebElement shoppingCartCounter() {
		return driver.findElement(shoppingCartCounter);
	}
}
