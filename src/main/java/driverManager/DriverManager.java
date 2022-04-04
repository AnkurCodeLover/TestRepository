package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager extends BaseClass {

	public static WebDriver driver ;
	
	public static WebDriver getDriver() {
		
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Drivers\\chromedriver.exe"); 
			driver = new ChromeDriver();			
		}
		return driver;
		
	}
}
