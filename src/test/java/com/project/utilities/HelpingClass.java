package com.project.utilities;

import com.project.testCases.Base;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelpingClass extends Base {

	private static final Duration DEFAULT_WAIT_DURATION = Duration.ofSeconds(20);

	// Method to wait for an element to be visible using its locator
	public void waitForElementToBeVisible(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_DURATION);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	// Method to wait for an element to be visible using a WebElement
	public void waitForElementToBeVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_DURATION);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// Method to wait for an element to be clickable
	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_DURATION);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void wait_until_element_attribute_changes(WebDriver webDriver, WebElement locator) {
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.not(ExpectedConditions.attributeToBe(locator, "disabled", "true")));
	}

	// Method to check if an element is visible
	public Boolean isElementVisible(WebDriver driver, WebElement element) {
		waitForElementToBeVisible(driver, element);
		return element.isDisplayed();
	}

	// Method to scroll an element into view
	public void scrollIntoView(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	// Method to scroll to the top of the page
	public void scrollToTop(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
	}

	// Method to scroll to the end of the page
	public void scrollToPageEnd(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	public void selectDropDown(WebElement locator, int index) {
		Select s = new Select(locator);
		s.selectByIndex(index);
	}

	public void initialize_value(String key, String value) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\Configurations\\config.properties");
		prop.load(fis);
		prop.setProperty(key, value);
		prop.store(new FileOutputStream(System.getProperty("user.dir") + "\\Configurations\\config.properties"), null);
	}

}
