package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerSuccessPage {

	WebDriver driver;

	public CustomerSuccessPage(WebDriver driver) {

		this.driver = driver;

	}

	By customerId = By.xpath("//td[text()='Customer ID']/following-sibling::td");

	public String getCustomerId() {

		return driver.findElement(customerId).getText();

	}
}