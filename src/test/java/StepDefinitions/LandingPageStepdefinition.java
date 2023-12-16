package StepDefinitions;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageObjects.LandingPage;
import Utils.TestContextSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepdefinition {
	public String productNameonlandingpage;
	public TestContextSetUp testContextSetUp;
	public LandingPage landingPage;
	
	public	LandingPageStepdefinition(TestContextSetUp testContextSetUp) {
	
		this.testContextSetUp=testContextSetUp;
		this.landingPage =testContextSetUp.pageObjectManager.getLandingPage();

	}
	
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() throws IOException {
//		testContextSetUp.testBase.WebdriverManager();
		Assert.assertTrue(landingPage.getTitileOfPage().contains("GreenKart"));

	 
	}
	@When("^user searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_tom_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
		landingPage.SearchItem(shortname);
		Thread.sleep(2000);
		testContextSetUp.productNameonlandingpage=landingPage.getProductName().split("-")[0].trim();
		 System.out.println(testContextSetUp.productNameonlandingpage + " is extracted from Home page");
	   
	}
	
	@When("Added {string} items of the selected product to cart")
	public void Added_items_product(String quantity) throws InterruptedException
	{
		
		landingPage.increment(quantity);
		Thread.sleep(3000);
//		testContextSetUp.generics.SwitchWindow();
		landingPage.AddtoCart();

		
		
	}

}
