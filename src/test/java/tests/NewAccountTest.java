package tests;

import org.testng.annotations.Test;

import utils.XMLReader;

import base.BaseTest;
import pages.HomePage;
import pages.NewAccountPage;

public class NewAccountTest extends BaseTest {

	@Test
	public void createAccount() {

		login();

		HomePage hp = new HomePage(driver);

		hp.clickNewAccount();

		XMLReader reader = new XMLReader();

		NewAccountPage nap = new NewAccountPage(driver);

		nap.enterCustomerId(reader.getData("account", "customerId"));

		nap.selectAccountType(reader.getData("account", "accountType"));

		nap.enterInitialDeposit(reader.getData("account", "initialDeposit"));

		nap.clickSubmit();
		
	}
}
