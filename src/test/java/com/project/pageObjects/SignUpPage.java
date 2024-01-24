package com.project.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.project.testCases.Base;

public class SignUpPage extends Base {

	// Create object of webDriver

	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// identify WebElements
	By SignUpPageBanner = By.xpath("//span[text()='Create New Customer Account']");

	public WebElement SignUpPageBanner() {
		return driver.findElement(SignUpPageBanner);
	}

	By FirstName = By.id("firstname");

	public WebElement FirstName() {
		return driver.findElement(FirstName);
	}

	By LastName = By.id("lastname");

	public WebElement LastName() {
		return driver.findElement(LastName);
	}

	By EmailAddress = By.id("email_address");

	public WebElement EmailAddress() {
		return driver.findElement(EmailAddress);
	}

	By Password = By.id("password");

	public WebElement Password() {
		return driver.findElement(Password);
	}

	By ConfirmPassword = By.id("password-confirmation");

	public WebElement ConfirmPassword() {
		return driver.findElement(ConfirmPassword);
	}

	By CreateAccountBtn = By.xpath("//span[text()='Create an Account']");

	public WebElement CreateAccountBtn() {
		return driver.findElement(CreateAccountBtn);
	}

	By AccountInformationTag = By.xpath("//strong[text()='Account Information']");

	public WebElement AccountConfirm() {
		return driver.findElement(AccountInformationTag);
	}
}
