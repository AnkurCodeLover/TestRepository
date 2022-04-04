package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductCategory {

	private WebDriver driver;


	//WebDriver driver;
	//Actions action = new Actions(driver);
	public ProductCategory(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//img[@class=\"replace-2x img-responsive\"])[2]") 
	private WebElement productImage;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),\"Add to cart\")]") 
	private WebElement add_to_cart_button;


	public void addToCart() {	
		add_to_cart_button.click();
	}

}
