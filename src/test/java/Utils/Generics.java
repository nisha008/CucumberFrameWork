package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Generics {

	public WebDriver driver;
	

	public Generics(WebDriver driver) {
		this.driver=driver;
		
	}


	public void SwitchWindow() {
		Set <String> windowHandles=driver.getWindowHandles();
		   Iterator <String> iterator=windowHandles.iterator();
		   String parentWindow=iterator.next();
		   String childwindow=iterator.next();
		   driver.switchTo().window(childwindow);
		
	}

}
