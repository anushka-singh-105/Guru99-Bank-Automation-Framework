package tests;

import org.testng.Assert;

import org.testng.annotations.Test;

import utils.XMLReader;

import base.BaseTest;
import pages.BalanceEnquiryPage;
import pages.HomePage;
import utils.ScreenshotUtil;

public class BalanceEnquiryTest extends BaseTest {

	@Test
	public void checkBalance() throws InterruptedException {

		login();

		HomePage hp = new HomePage(driver);

		hp.clickBalanceEnquiry();

		Thread.sleep(3000);

	//	ScreenshotUtil.takeScreenshot(driver, "BalancePage");

		XMLReader reader = new XMLReader();

		BalanceEnquiryPage bp = new BalanceEnquiryPage(driver);

		bp.enterAccountNo(reader.getData("balanceEnquiry", "accountNo"));

		bp.clickSubmit();

		Thread.sleep(3000);
		
		ScreenshotUtil.takeScreenshot(driver, "BalanceEnquiry_HTTP500");

		Assert.assertFalse(
				driver.getPageSource().contains("HTTP ERROR 500"));
	}
}