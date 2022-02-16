package Testofmavenproject.google;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class extends Elements {
	
	
	
	public static String url = "http://automationpractice.com/index.php";
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
	
		public static void max() {
			driver.manage().window().maximize();
		}
		
		public static void implicitlywait(WebElement proceed) {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		public static void click(WebElement element) {
			element.click();
		}
		public static void sendkeys(WebElement element, String val) {
			element.sendKeys(val);
		}
		
		
		public static void jscript(WebElement element1) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,480)", element1);
		}
		
	public static void ss(WebElement conf_order) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ARUN\\eclipse-workspace\\google\\screenshot","\\finalpage3.png");
		FileUtils.copyFile(screenshotAs, destination);
	}
	
	
	
	
	
	
	
}
