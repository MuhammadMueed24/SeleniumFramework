package com.project.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.project.testCases.Base;

public class LoginPage extends Base {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	By LoginPageLink = By.xpath("//a[contains(text(),\"Sign In\")]");

	public WebElement LoginPageLink() {
		return driver.findElement(LoginPageLink);
	}

	By LoginPageBanner = By.xpath("//span[text()='Customer Login']");

	public WebElement LoginBanner() {
		return driver.findElement(LoginPageBanner);
	}

	By LoginEmail = By.id("email");

	public WebElement LoginEmail() {
		return driver.findElement(LoginEmail);
	}

	By LoginPassword = By.id("pass");

	public WebElement LoginPassword() {
		return driver.findElement(LoginPassword);
	}

	By SignInBtn = By.id("send2");

	public WebElement SignInBtn() {
		return driver.findElement(SignInBtn);
	}
	

}
