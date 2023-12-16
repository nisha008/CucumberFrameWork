package StepDefinitions;

import org.testng.Assert;

import PageObjects.CheckoutPage;
import PageObjects.LandingPage;
import Utils.TestContextSetUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutPageStepDefinition {
	public TestContextSetUp testContextSetUp;
	public CheckoutPage checkoutPage;
	public LandingPage landingPage;
	public String productNameOnLandingPage;
	public String CheckoutpageProduct; 
	
	public CheckoutPageStepDefinition(TestContextSetUp testContextSetUp) {
		this.testContextSetUp=testContextSetUp;
		this.checkoutPage = testContextSetUp.pageObjectManager.getCheckoutPage();

	}

	
	@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	
	public void user_proceeds_to_checkout_and_validate_the_tom_items_in_checkout_page(String shortname) {
		
		String CheckoutpageProductName=checkoutPage.CheckoutItemsAndVerifyProductName();
		Assert.assertEquals(CheckoutpageProductName,testContextSetUp.productNameonlandingpage );
		System.out.println("Both home page and checkoutpage names are same and test is passed");
		
		
	}
	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
	   
		checkoutPage.VerifyPlaceOrder();
		checkoutPage.VerifyPromoBtn();
		
		System.out.println("Both VerifyPlaceOrder and VerifyPromoBtn is true and test is passed");

	}

	
}
