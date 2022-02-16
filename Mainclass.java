package Testofmavenproject.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Mainclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUN\\eclipse-workspace\\Selenium1\\driver\\chromedriver\\chromedriver.exe");
		//upCasting
		WebDriver driver = new ChromeDriver();
		//Parent_Class ref_name = new Child_Class  

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		PageFactory.initElements(driver, WebElementClass.class);
		
		WebElementClass.signIn.click();
		WebElementClass.emailId.sendKeys("arun.kumar525995@gmail.com");
		WebElementClass.contin.click();
		WebElementClass.pass.sendKeys("123456789");
		WebElementClass.sigIn.click();
		
	}

}
