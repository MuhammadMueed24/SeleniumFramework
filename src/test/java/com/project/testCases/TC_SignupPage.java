package com.project.testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.project.pageObjects.SignUpPage;
import com.project.pageObjects.homePage;
import com.project.pageObjects.prodOrder;
import com.project.utilities.HelpingClass;
import com.project.utilities.RandomData;

public class TC_SignupPage extends Base {

	RandomData rd = new RandomData();
	homePage hmpg = new homePage(driver);
	SignUpPage sppg = new SignUpPage(driver);
	prodOrder po = new prodOrder(driver);
	HelpingClass hp = new HelpingClass();

	@Test
	public void VerifySignUp() throws IOException, InterruptedException {

		driver.get(url);
		hmpg.clickSignUpLink().click();
		
		hp.waitForElementToBeVisible(driver, sppg.SignUpPageBanner());
		
		String fname = rd.generateRandomData();
		sppg.FirstName().sendKeys(fname);
		
		String lname = rd.generateRandomData();
		sppg.LastName().sendKeys(lname);
		
		String Email = rd.generateRandomEmail();
		hp.initialize_value("Email", Email);
		sppg.EmailAddress().sendKeys(Email);
		
		String pass = rd.generateRandomPassword();
		hp.initialize_value("Password", pass);
		sppg.Password().sendKeys(pass);
		sppg.ConfirmPassword().sendKeys(pass);

		sppg.CreateAccountBtn().click();
		hp.waitForElementToBeVisible(driver, sppg.AccountConfirm());
		po.mainLogo().click();
		
	}
}
