package qaautomation.march2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePages extends BasePages {
	
	By profileText = By.xpath("//div[@id='flash']");
	

	public ProfilePages(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	public String getProfileText() {
		return getText(profileText);
	}

}
