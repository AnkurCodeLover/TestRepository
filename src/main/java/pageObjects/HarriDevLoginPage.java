package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HarriDevLoginPage {
	WebDriver driver;

	public HarriDevLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = "//input[@name='username']") 
	private WebElement userName;

	@FindBy(how = How.XPATH, using = "//input[@name='password']") 
	private WebElement enterPWD;

	@FindBy(how = How.XPATH, using = "//*[text()='Log in']") 
	private WebElement loginButton;

	public void LogintoApplication(String uname, String pwd) {
		userName.clear();
		userName.sendKeys(uname);
		enterPWD.clear();
		enterPWD.sendKeys(pwd);
		loginButton.click();
		
	}
}
