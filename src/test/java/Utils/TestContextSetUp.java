package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.LandingPage;
import PageObjects.PageObjectManager;

public class TestContextSetUp {
	public WebDriver driver;
	public String productNameonlandingpage;
	public LandingPage landingPage;
	public TestBase  testBase;
	public PageObjectManager pageObjectManager; 
	public Generics generics;
	public TestContextSetUp() throws IOException {
		testBase=new TestBase();
     pageObjectManager=new PageObjectManager(testBase.WebdriverManager());	
	 generics=new Generics(testBase.WebdriverManager());


	}

}
