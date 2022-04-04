package pageObjects;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HarriTeamPage {
	WebDriver driver;
	
	public HarriTeamPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'12 212')])[1]") 
	private WebElement selectTeammember;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'12 212')])[2]")
	private WebElement verifyTeamMember;

public void selectTeamMember() throws InterruptedException {
	Thread.sleep(1000);
	selectTeammember.click();
	verifyTeamMember.getText().equals("12 212");
	System.out.println("Application is working fine");
}
}
