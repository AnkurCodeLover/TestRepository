package jApplicationStepDefnition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginToGmailApplication {
	WebDriver driver;

	public LoginToGmailApplication(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@name='identifier']") 
	private WebElement emailIDField;
	
	
}
