package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HarriAccessPortalPage;
import pageObjects.HarriDashboard;
import pageObjects.HarriDevLoginPage;
import pageObjects.HarriTeamPage;

public class TestStepDefnition {
	public static WebDriver driver = Hooks.driver;

	@Given("^User login to the page using username \"([^\"]*)\" and pwd \"([^\"]*)\"$")
	public void user_login_to_the_page_using_username_and_pwd(String arg1, String arg2) throws Throwable {
		driver.get("https://dev.harridev.com/user/login");		
		HarriDevLoginPage home = new HarriDevLoginPage(driver);
		home.LogintoApplication(arg1,arg2);
	}

	@When("^Click on the link Test GP_1$")
	public void click_on_the_link() throws Throwable {
		HarriAccessPortalPage accessPort = new HarriAccessPortalPage(driver);
		accessPort.SelectLink();
	}

	@Then("^Again click on the link ABS_DF$")
	public void again_click_on_the_link() throws Throwable {
		HarriAccessPortalPage accessPort = new HarriAccessPortalPage(driver);
		accessPort.SelectNextLink();
	}

	@Then("^Click on the MY TEAM menu option$")
	public void click_on_the_menu_option() throws Throwable {
		HarriDashboard selectTeam = new HarriDashboard(driver);
		selectTeam.ClickOnMyTeamslink();
	}

	@Then("^Click on the Active Team member 12_212$")
	public void click_on_the_Active_Team_member() throws Throwable {
		HarriTeamPage selectTeam = new HarriTeamPage(driver);
		selectTeam.selectTeamMember();
	}
}
