package Testofmavenproject.google;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RunClass extends Base_Class {
	public static void main(String[] args) throws IOException {
		
		FileInputStream s = new FileInputStream("C:\\Users\\ARUN\\eclipse-workspace\\google\\datas\\td.properties");
		Properties p = new Properties();
		p.load(s);
		String un = p.getProperty("email");
		String pd = p.getProperty("pass");
		
		getdriver("chrome");
		getURL(url);
		max();
		WebElement proceed = null;
		implicitlywait(proceed);
		
		PageFactory.initElements(driver, Elements.class);
		click(signin);
		sendkeys(emailId, un);
		sendkeys(passwrd, pd);
		click(signinbutton);
		click(tshirt);
		click(select);
		click(addcart);
		click(ptc);
		click(ptc1);
		click(ptc2);
		click(checkbox);
		click(ptc3);
		click(pay);
		click(conf_order);
		WebElement element1 = null;
		jscript(element1);
		ss(lastpage);
		
		
		
	}

}
