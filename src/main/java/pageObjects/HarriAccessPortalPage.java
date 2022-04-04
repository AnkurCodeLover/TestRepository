package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HarriAccessPortalPage {
	WebDriver driver;

	public HarriAccessPortalPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = "//*[text()='Go to Dash']") 
	private WebElement popUp1;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Got it!']") 
	private WebElement popUp2;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Test GP-1')]") 
	private WebElement linkTestgGp;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'ABS + DF')]") 
	private WebElement linkABSDf;
	
	//@FindBy(how = How.XPATH, using = "//*[text()='Got it!']")
	//private WebElement ;
	
	public void SelectLink() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(popUp2)).click();
		linkTestgGp.click();			
	}
	
	public void SelectNextLink() throws InterruptedException {
		Thread.sleep(2000);
		linkABSDf.click();
	}

}