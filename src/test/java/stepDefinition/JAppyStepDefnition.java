package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JAppyStepDefnition {
	public static WebDriver driver = Hooks.driver;
	
	@Given("^Login to gmail application with valid username and password$")
	public void login_to_gmail_application_with_valid_username_and_password() throws Throwable {
		driver.get("https://mail.google.com/");
	}

	@When("^Verify the on the gmail home page$")
	public void verify_the_on_the_gmail_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Search the email of Japplication emails$")
	public void search_the_email_of_Japplication_emails() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Select the email one by one$")
	public void select_the_email_one_by_one() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
