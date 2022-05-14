package qaautomation.march2022.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePagesFactory {

	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();
	
	public BasePagesFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait ) {
		this.driver = driver;
		this.explicitWait = explicitWait;
	}

}
