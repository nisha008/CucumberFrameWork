package PageObjects;

import org.openqa.selenium.WebDriver;

import Utils.Generics;

public class PageObjectManager {
	
	public LandingPage landingPage;
	public OffersPage offersPage;
	public WebDriver driver;
	public Generics generics;
	public PageObjects.CheckoutPage checkoutPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;}
		public LandingPage getLandingPage() {
		
		 landingPage=new LandingPage(driver);
			return landingPage;
}
		
		public OffersPage getOffersPage() {
			
			offersPage=new OffersPage(driver);
			return offersPage;
}

		
public CheckoutPage getCheckoutPage() {
			
	checkoutPage=new CheckoutPage(driver);
			return checkoutPage;
}
		
	
		
}
