package qaautomation.march2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TugasTigaYopmail extends TugasTigaBasePages{
	
	By email = By.xpath("//input[@id='login']");
	By btn = By.xpath("//i[@class='material-icons-outlined f36']");
	By automationText = By.xpath("//span[contains(text(),'The subscription')]");
	

	public TugasTigaYopmail(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	public void inputEmail(String mail) {
		setText(email,mail);
	}
	public void inputButton() {
		clickAndWait(btn);
	}

	public void switchIframe() {
		driver.get().switchTo().frame("ifmail");
	}
	public String getAutomationText() {
		return getText(automationText);
	}

}
