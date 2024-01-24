package com.project.testCases;

import org.testng.annotations.Test;
import com.project.pageObjects.LoginPage;
import com.project.pageObjects.homePage;
import com.project.pageObjects.prodOrder;
import com.project.utilities.HelpingClass;
import com.project.utilities.ReadConfig;

public class TC_LoginPage extends Base{

	homePage hmpg = new homePage(driver);
	LoginPage lgpg = new LoginPage(driver);
	HelpingClass hp = new HelpingClass();
	ReadConfig rc = new ReadConfig();
	prodOrder po = new prodOrder(driver);

	@Test
	public void verifyLogin() throws InterruptedException {

		driver.get(url);
		lgpg.LoginPageLink().click();

		hp.waitForElementToBeVisible(driver, lgpg.LoginBanner());
		
		String email = rc.getEmail();
		lgpg.LoginEmail().sendKeys(email);
		
		String pass = rc.getPassword();
		lgpg.LoginPassword().sendKeys(pass);
		
		lgpg.SignInBtn().click();
		hp.waitForElementToBeVisible(driver, po.mainLogo());

	}

}
