package tests;

import org.testng.annotations.Test;

import utils.XMLReader;
import base.BaseTest;
import pages.CustomerSuccessPage;
import pages.HomePage;
import pages.NewCustomerPage;

public class NewCustomerTest extends BaseTest {

	@Test
	public void createCustomer() {

		login();

		HomePage hp = new HomePage(driver);
		hp.clickNewCustomer();

		XMLReader reader = new XMLReader();

		NewCustomerPage ncp = new NewCustomerPage(driver);

		ncp.enterCustomerName(reader.getData("customer", "name"));

		ncp.selectMale();

		ncp.enterDOB(reader.getData("customer", "dob"));

		ncp.enterAddress(reader.getData("customer", "address"));

		ncp.enterCity(reader.getData("customer", "city"));

		ncp.enterState(reader.getData("customer", "state"));

		ncp.enterPin(reader.getData("customer", "pin"));

		ncp.enterMobile(reader.getData("customer", "mobile"));

		ncp.enterEmail(reader.getData("customer", "email"));

		ncp.enterPassword(reader.getData("customer", "password"));

		ncp.clickSubmit();
		
		CustomerSuccessPage csp=new CustomerSuccessPage(driver);
		String custId=csp.getCustomerId();
		System.out.println("Customer ID : "+custId);
		
	}
}
