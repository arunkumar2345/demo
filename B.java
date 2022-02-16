package Testofmavenproject.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.support.FindBy;

public class B {
	@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span")
	public static WebElement signIn;
	
	@FindBy(name = "email")
	public static WebElement emailId;
	
	@FindBy(id = "continue")
	public static WebElement contin;
	
	@FindBy(name = "password")
	public static WebElement pass;
	
	@FindBy(id = "signInSubmit")
	public static WebElement sigIn;
	public static WebDriver driver;
	public static void getdriver(String a) {
		if(a.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ARUN\\\\eclipse-workspace\\\\Selenium1\\\\driver\\\\chromedriver\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			System.out.println("no driver found");
		}
	}
	public static void getURL(String val) {
		driver.get(val);
	}
	
	
}
