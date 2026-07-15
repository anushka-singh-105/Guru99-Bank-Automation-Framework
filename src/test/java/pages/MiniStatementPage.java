package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MiniStatementPage {

	WebDriver driver;

	public MiniStatementPage(WebDriver driver) {

		this.driver = driver;

	}

	By accountNo = By.name("accountno");

	By submitBtn = By.name("AccSubmit");

	public void enterAccountNo(String accNo) {

		driver.findElement(accountNo).sendKeys(accNo);

	}

	public void clickSubmit() {

		driver.findElement(submitBtn).click();

	}
}