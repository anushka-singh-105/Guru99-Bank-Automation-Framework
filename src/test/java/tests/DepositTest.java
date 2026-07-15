package tests;

import org.testng.annotations.Test;

import org.testng.annotations.Listeners;
import utils.TestListener;

import utils.XMLReader;

import base.BaseTest;
import pages.DepositPage;
import pages.HomePage;

import org.testng.Assert;

public class DepositTest extends BaseTest{
	
	@Test
	public void despositMoney() {
		login();
		
		HomePage hp = new HomePage(driver);
		
		hp.clickDeposit();
		
		XMLReader reader = new XMLReader();

		DepositPage dp = new DepositPage(driver);

		dp.enterAccountNo(reader.getData("deposit", "accountNo"));

		dp.enterAmount(reader.getData("deposit", "amount"));

		dp.enterDescription(reader.getData("deposit", "description"));

		dp.clickSubmit();
		
		Assert.assertFalse(
				
				driver.getPageSource().contains("HTTP ERROR 500"));
		
		
		
	}

}
