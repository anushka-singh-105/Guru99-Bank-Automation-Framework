package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class NewAccountPage {

	WebDriver driver;

	public NewAccountPage(WebDriver driver) {

		this.driver = driver;

	}

	By customerId = By.name("cusid");

	By accountType = By.name("selaccount");

	By initialDeposit = By.name("inideposit");

	By submitBtn = By.name("button2");

	public void enterCustomerId(String custId) {

		driver.findElement(customerId).sendKeys(custId);

	}

	public void enterInitialDeposit(String amount) {

		driver.findElement(initialDeposit).sendKeys(amount);

	}

	public void clickSubmit() {

		driver.findElement(submitBtn).click();

	}
	
	public void selectAccountType(String type) {

		Select select = new Select(driver.findElement(accountType));

		select.selectByVisibleText(type);

	}
}