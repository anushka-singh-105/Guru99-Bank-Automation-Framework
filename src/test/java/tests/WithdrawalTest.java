package tests;

import org.testng.annotations.Test;

import utils.XMLReader;


import base.BaseTest;
import pages.HomePage;
import pages.WithdrawalPage;


public class WithdrawalTest extends BaseTest {
	
	@Test
	public void withdrawMoney() {
		login();
		
		HomePage hp =new HomePage(driver);
		
		hp.clickWithdrawal();
		
		XMLReader reader = new XMLReader();

		WithdrawalPage wp = new WithdrawalPage(driver);

		wp.enterAccountNo(reader.getData("withdrawal", "accountNo"));

		wp.enterAmount(reader.getData("withdrawal", "amount"));

		wp.enterDescription(reader.getData("withdrawal", "description"));

		wp.clickSubmit();
		
	}

}
