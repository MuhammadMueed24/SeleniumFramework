package com.project.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.project.testCases.Base;

public class checkOutData extends Base {

	public checkOutData(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	By shippingAddressBanner = By.xpath("//div[text()='Shipping Address']");

	public WebElement shippingAddressBanner() {
		return driver.findElement(shippingAddressBanner);
	}

	By streetAddress = By.name("street[0]");

	public WebElement streetAddress() {
		return driver.findElement(streetAddress);
	}

	By city = By.name("city");

	public WebElement city() {
		return driver.findElement(city);
	}

	By state = By.name("region_id");

	public WebElement state() {
		return driver.findElement(state);
	}

	By postCode = By.name("postcode");

	public WebElement postCode() {
		return driver.findElement(postCode);
	}

	By phoneNo = By.name("telephone");

	public WebElement phoneNo() {
		return driver.findElement(phoneNo);
	}

	By shippingMethod = By.xpath("(//input[@class='radio'])[1]");

	public WebElement shippingMethod() {
		return driver.findElement(shippingMethod);
	}

	By SubmitBtn = By.xpath("//span[text()='Next']");

	public WebElement SubmitBtn() {
		return driver.findElement(SubmitBtn);
	}

	By PlaceOrderBtn = By.xpath("//span[text()='Place Order']");

	public WebElement PlaceOrderBtn() {
		return driver.findElement(PlaceOrderBtn);
	}
	
	By BillingAddressCheck = By.name("billing-address-same-as-shipping");

	public WebElement BillingAddressCheck() {
		return driver.findElement(BillingAddressCheck);
	}

	By OrderConfirmationMsg = By.tagName("h1");

	public WebElement OrderConfirmationMsg() {
		return driver.findElement(OrderConfirmationMsg);
	}
}
