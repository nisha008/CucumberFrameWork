package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OffersPage;
import Utils.TestContextSetUp;
import io.cucumber.java.en.Then;

public class OffersPageStepDefinition {
	public TestContextSetUp testContextSetUp;
	public LandingPage landingPage;
	public OffersPage offersPage;
	public WebDriver driver;
	public String productNameonOffers;


	public	OffersPageStepDefinition(TestContextSetUp testContextSetUp) {
		this.testContextSetUp=testContextSetUp;
		this.offersPage =testContextSetUp.pageObjectManager.getOffersPage();

	}
	
	@Then("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_tom_shortname_in_offers_page(String shortname) throws InterruptedException {
		testContextSetUp.pageObjectManager.landingPage.ClickOnTopDealsPage();
		switchToOffersPage();
		  Thread.sleep(3000) ;
		  offersPage.SearchItem(shortname);
		  productNameonOffers=offersPage.getProductName();
		  
		   
	}
	
	
	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		System.out.println(testContextSetUp.productNameonlandingpage);
    	Assert.assertEquals(productNameonOffers,testContextSetUp.productNameonlandingpage);

	}
	
	
	
	
	public void switchToOffersPage()
	{
		
		testContextSetUp.generics.SwitchWindow();
		
	}
}
