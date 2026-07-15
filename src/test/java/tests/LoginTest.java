package tests;

import org.testng.annotations.Test;

import utils.TestListener;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

import org.testng.annotations.Listeners;



public class LoginTest extends BaseTest{
	
	@Test
	public void openGuru99() {
		
		
		System.out.println(driver.getTitle());
		
	
	}
	
	@Test
	public void loginTest() {
	
	LoginPage lp=new LoginPage(driver);
	
	lp.enterUserId("mngr663529");
	lp.enterPassword("dAnYzyh");
	lp.clickLogin();
	
	HomePage hp = new HomePage(driver);

	System.out.println(hp.getPageTitle());

 }
}

