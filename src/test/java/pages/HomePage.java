package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	By newCustomer = By.linkText("New Customer");

	public void clickNewCustomer() {

		driver.findElement(newCustomer).click();

	}

	public String getPageTitle() {

		return driver.getTitle();

	}
	
	By newAccount = By.linkText("New Account");

	public void clickNewAccount() {

		driver.findElement(newAccount).click();

	}
	
	By deposit = By.linkText("Deposit");

	public void clickDeposit() {

		driver.findElement(deposit).click();

	}
	
	By withdrawal = By.linkText("Withdrawal");

	public void clickWithdrawal() {

		driver.findElement(withdrawal).click();
		

	}
	
	By balanceEnquiry = By.linkText("Balance Enquiry");

	public void clickBalanceEnquiry() {

		driver.findElement(balanceEnquiry).click();

	}
	
	By miniStatement = By.linkText("Mini Statement");
	
	public void clickMiniStatement() {
		
		driver.findElement(miniStatement).click();
	
	}
	
}