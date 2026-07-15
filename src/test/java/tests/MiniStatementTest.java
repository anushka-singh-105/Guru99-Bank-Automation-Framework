package tests;

import org.testng.Assert;

import org.testng.annotations.Test;

import utils.XMLReader;

import base.BaseTest;
import pages.HomePage;
import pages.MiniStatementPage;
import utils.ScreenshotUtil;

public class MiniStatementTest extends BaseTest {

	@Test
	public void viewMiniStatement() throws InterruptedException {

		login();

		HomePage hp = new HomePage(driver);

		hp.clickMiniStatement();

		XMLReader reader = new XMLReader();

		MiniStatementPage mp = new MiniStatementPage(driver);

		mp.enterAccountNo(reader.getData("miniStatement", "accountNo"));

		mp.clickSubmit();

		Thread.sleep(5000);

		boolean miniStatementDisplayed =
				driver.getPageSource().contains("Transaction ID");

		if (!miniStatementDisplayed) {

			ScreenshotUtil.takeScreenshot(
					driver,
					"MiniStatement_NoResponse");
		}

		Assert.assertTrue(
				miniStatementDisplayed,
				"Mini Statement response not displayed");
	}
}