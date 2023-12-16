package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	public String titleofLandingPage;

	public	LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	By search = By.xpath("//input[@placeholder='Search for Vegetables and Fruits']");
	By productName = By.xpath("//h4[normalize-space()='Tomato - 1 Kg']");
	By TopDealsLink = By.xpath("//a[normalize-space()='Top Deals']");
	By addIcon=By.xpath("//div[@class='products']//div[1]//div[2]//a[2]");
//	By addTocartIcon=By.xpath("//body//div//button[2]");//got error trying wait
	By addToCart = By.cssSelector(".product-action button");


	public void SearchItem(String shortname) {
		driver.findElement(search).sendKeys(shortname);

	}

	public void searchText() {
		driver.findElement(search).getText();

	}

	public String getProductName() {
		String productNameonlandingpage = driver.findElement(productName).getText();
		System.out.println(productNameonlandingpage);
		return productNameonlandingpage;
	}

	public void ClickOnTopDealsPage() {
		driver.findElement(TopDealsLink).click();
	}

	public String getTitileOfPage() {
		titleofLandingPage=driver.getTitle();
	      return titleofLandingPage ;
	}
	
	
	
	public void increment(String numberOfIncrement) {
//		int operator=Integer.parseInt(numberOfIncrement);
		for(int i=0;i<=Integer.parseInt(numberOfIncrement);i++) {
			driver.findElement(addIcon).click();
			
		}	
		
		}


	public void AddtoCart()
	{
		driver.findElement(addToCart).click();
	}
	
	public void Another_Develop_Branch()
	{
		System.out.println("new changes in develop branch named as: Another_Develop_Branch ");
		System.out.println("yess it is cucumber framework of github");
		System.out.println("checking");

}
}
