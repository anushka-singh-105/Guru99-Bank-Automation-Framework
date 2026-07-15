package base;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utils.XMLReader;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;




public class BaseTest {
	
	public void login() {

	    XMLReader reader = new XMLReader();

	    LoginPage lp = new LoginPage(driver);

	    lp.enterUserId(reader.getData("login", "userId"));
	    lp.enterPassword(reader.getData("login", "password"));

	    lp.clickLogin();
	}
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/V4/");
		
		
	}
	
	//@AfterMethod
//	public void tearDown() {
		//driver.quit();
//	}

}
