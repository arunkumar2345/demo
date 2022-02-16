package Testofmavenproject.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUN\\eclipse-workspace\\Selenium1\\driver\\chromedriver\\chromedriver.exe");
		//upCasting
		WebDriver driver = new ChromeDriver();
		//Parent_Class ref_name = new Child_Class  

		driver.get("https://www.google.co.in/");
	}

}

