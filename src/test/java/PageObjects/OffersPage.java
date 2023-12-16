package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.Generics;

public class OffersPage {
	public WebDriver driver;

	
	public	OffersPage(WebDriver driver) {
		this.driver=driver;
	}

	
	By search =By.cssSelector("#search-field");
	By productName= By.cssSelector("tbody tr td:nth-child(1)");
	
	

	
	public void SearchItem(String shortname) {
		driver.findElement(search).sendKeys(shortname);
			
	}
	public String getProductName()
	{
		String productNameonOffersPage= driver.findElement(productName).getText();
		 System.out.println(productNameonOffersPage + " is extracted from offers page");
		return driver.findElement(productName).getText();
	}
	
	
	
	
	

}
