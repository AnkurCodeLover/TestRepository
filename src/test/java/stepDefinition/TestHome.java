package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.ProductCategory;

public class TestHome {
	WebDriver driver;

	@Given("^User launch the URL of the test app$")
	public void user_launch_the_URL_of_the_test_app() throws Throwable {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}

	@When("^User select the TShirt from the menu$")
	public void user_select_the_TShirt_from_the_menu() throws Throwable {
		HomePage home = new HomePage(driver);
		home.selectTshirt();
	}

	@Then("^User select the Tshirt and add to the cart$")
	public void user_select_the_Tshirt_and_add_to_the_cart() throws Throwable {
		ProductCategory productCat = new ProductCategory(driver);
		productCat.addToCart();
	}

	@Then("^User proceed to checkout$")
	public void user_proceed_to_checkout() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Confirm the orderder$")
	public void confirm_the_orderder() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^User create an account and insert the details$")
	public void user_create_an_account_and_insert_the_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Checkout with product$")
	public void checkout_with_product() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Confirm the histry at last$")
	public void confirm_the_histry_at_last() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
