package Testofmavenproject.google;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {
	@FindBy(className = "login")
	public static WebElement signin;
	
	
	@FindBy(id = "email")
	public static WebElement emailId;
	
	@FindBy(id = "passwd")
	public static WebElement passwrd;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")
	public static WebElement signinbutton;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	public static WebElement tshirt;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/h5/a")
	public static WebElement select;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")
	public static WebElement addcart;
	
	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")
	public static WebElement ptc;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")
	public static WebElement ptc1;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
	public static WebElement ptc2;
	
	@FindBy(id = "cgv")
	public static WebElement checkbox;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")
	public static WebElement ptc3;
	
	@FindBy(className = "bankwire")
	public static WebElement pay;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
	public static WebElement conf_order;
	
	@FindBy(xpath = "/html/body/div/div[2]")
	public static WebElement lastpage;
	
	}


