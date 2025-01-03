package com.project.testCases;

import org.testng.annotations.Test;
import com.project.pageObjects.checkOutData;
import com.project.pageObjects.prodOrder;
import com.project.utilities.HelpingClass;
import com.project.utilities.RandomData;

public class TC_Prod extends Base {

	HelpingClass hp = new HelpingClass();
	RandomData rd = new RandomData();
	prodOrder po = new prodOrder(driver);
	checkOutData cd = new checkOutData(driver);
	TC_LoginPage tc = new TC_LoginPage();

	@Test
	public void verifyAddProdToCart() throws InterruptedException {

		tc.verifyLogin();
		po.mainLogo().click();

		hp.waitForElementToBeVisible(driver, po.prodImg());
		hp.scrollIntoView(driver, po.prodImg());
		po.prodImg().click();

		hp.waitForElementToBeVisible(driver, po.AddToCartBtn());

		po.selectSize().click();
		po.selectColor().click();
		po.AddToCartBtn().click();

		hp.scrollToTop(driver);
	}

	@Test
	public void verifyCheckOut() throws InterruptedException {
		
		tc.verifyLogin();

		hp.waitForElementToBeVisible(driver, po.shoppingCartCounter());
		po.showCartBtn().click();

		hp.waitForElementToBeVisible(driver, po.checkoutBtn());
		po.checkoutBtn().click();

		hp.waitForElementToBeVisible(driver, cd.shippingAddressBanner());

		String address = rd.generateRandomData();
		cd.streetAddress().sendKeys(address);
		String city = rd.generateRandomData();
		cd.city().sendKeys(city);
		cd.state().click();
		hp.selectDropDown(cd.state(), 1);
		String postCode = rd.generateRandomNum();
		cd.postCode().sendKeys(postCode);
		String phoneNo = rd.generateRandomNum();
		cd.phoneNo().sendKeys(phoneNo);
		cd.shippingMethod().click();
		cd.SubmitBtn().click();

		hp.waitForElementToBeVisible(driver, cd.PlaceOrderBtn());
		cd.BillingAddressCheck().click();
		cd.PlaceOrderBtn().click();

		hp.waitForElementToBeVisible(driver, cd.OrderConfirmationMsg());
	}

}
