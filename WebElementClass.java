package Testofmavenproject.google;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebElementClass {
	
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
	

}
