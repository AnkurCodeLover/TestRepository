package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import driverManager.BaseClass;
import driverManager.DriverManager;

public class Hooks {

	public static WebDriver driver ;
	
	@Before
	public void setup() {
		driver = DriverManager.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		//driver.quit();
		//driver.close();
		
	}
}
