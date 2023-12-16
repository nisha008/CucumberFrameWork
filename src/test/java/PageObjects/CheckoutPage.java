package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	WebDriver driver;
	
	By promoBtn = By.cssSelector(".promoBtn");
	By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
	By productnameOnCheckout=By.cssSelector(".product-name");
	By cartBag = By.cssSelector("[alt='Cart']");
	By checkOutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}

	
	
	public void CheckoutItems()
	{
		driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();
	}
	
	
	 public String CheckoutItemsAndVerifyProductName()
	{
		 driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();
	    WebElement productNameElement = driver.findElement(productnameOnCheckout);
	    String ProductName = productNameElement.getText().split("-")[0].trim();

//		String ProductName=driver.findElement(productnameOnCheckout).getText().split("-")[0].trim();
		System.out.println(ProductName);
		return ProductName;

	}
	
	
	 public Boolean VerifyPromoBtn()
		{
			return driver.findElement(promoBtn).isDisplayed();
		}
		
		public Boolean VerifyPlaceOrder()
		{
			return driver.findElement(placeOrder).isDisplayed();
		}
		
		public void AddingNewMethod()
		{
			System.out.println("Added for GITHUB");
		}
	}
	


