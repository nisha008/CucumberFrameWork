package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import PageObjects.LandingPage;
import Utils.TestContextSetUp;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	public Hooks hooks;
	public TestContextSetUp testContextSetUp;
	

	public	Hooks( TestContextSetUp testContextSetUp) {
	
		this.testContextSetUp=testContextSetUp;

	}
	@After
	public void ShutDown() throws IOException {
		testContextSetUp.testBase.WebdriverManager().quit();
	}
	
	@AfterStep
	
	public void AddScreenShot(Scenario scenario) throws IOException {
		WebDriver driver =testContextSetUp.testBase.WebdriverManager();
		if(scenario.isFailed()) {
		
		File srcPath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent=FileUtils.readFileToByteArray(srcPath);
		scenario.attach(fileContent,"image/png","image");
		
		
		}
		
	}

}
