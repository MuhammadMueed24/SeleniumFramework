package com.project.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import com.project.testCases.Base;

public class homePage extends Base{

	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// identify WebElements
	By signUpLink = By.linkText("Create an Account");

	// identify Actions
	public WebElement clickSignUpLink() {
		return driver.findElement(signUpLink);
	}

}
