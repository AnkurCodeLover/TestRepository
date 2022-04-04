package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HarriDashboard {
	WebDriver driver;

	public HarriDashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[text()='Got it!']")
	private WebElement popUp;

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'My Team')])[1]")
	private WebElement myTeamsLink;


	public void ClickOnMyTeamslink() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(popUp)).click();
		myTeamsLink.click();

	}
}