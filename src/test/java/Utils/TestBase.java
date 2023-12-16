package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public WebDriver driver;
	public WebDriver WebdriverManager() throws IOException {
		FileInputStream fis=new FileInputStream("/Users/nishahashmi/Documents/RevisionCucumber/CucumberFramebook/src/test/resources/global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		String browser = prop.getProperty("browser");
//		String browser_maven=System.getProperty("browser");	
		
		
		if(driver==null) {
			if(browser.equalsIgnoreCase("chrome")) {
				System.getProperty("webdriver.chrome.driver","/Users/nishahashmi/Downloads/chromedriver-mac-arm64/chromedriver");
				driver=new ChromeDriver();
					

			}
			if(browser.equalsIgnoreCase("Firefox")) {
				driver=new FirefoxDriver();
				System.setProperty("webdriver.firefox.driver","Users/nishahashmi/Documents/Webdrivers/geckodriver");

					

			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
		}
		return driver;
		
	} 
	

}
