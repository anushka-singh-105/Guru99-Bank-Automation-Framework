package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage {

	WebDriver driver;

	public NewCustomerPage(WebDriver driver) {

		this.driver = driver;
	}

	By customerName = By.name("name");

	By maleRadio = By.xpath("//input[@value='m']");

	By dob = By.name("dob");

	By address = By.name("addr");

	By city = By.name("city");

	By state = By.name("state");

	By pin = By.name("pinno");

	By mobile = By.name("telephoneno");

	By email = By.name("emailid");

	By password = By.name("password");

	By submitBtn = By.name("sub");

	
	public void enterCustomerName(String name) {
		driver.findElement(customerName).sendKeys(name);
	}

	public void selectMale() {
		driver.findElement(maleRadio).click();
	}

	public void enterDOB(String date) {
		driver.findElement(dob).sendKeys(date);
	}

	public void enterAddress(String addr) {
		driver.findElement(address).sendKeys(addr);
	}

	public void enterCity(String cityName) {
		driver.findElement(city).sendKeys(cityName);
	}

	public void enterState(String stateName) {
		driver.findElement(state).sendKeys(stateName);
	}

	public void enterPin(String pinNumber) {
		driver.findElement(pin).sendKeys(pinNumber);
	}

	public void enterMobile(String mobileNo) {
		driver.findElement(mobile).sendKeys(mobileNo);
	}

	public void enterEmail(String emailId) {
		driver.findElement(email).sendKeys(emailId);
	}

	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void clickSubmit() {
		driver.findElement(submitBtn).click();
	}
}