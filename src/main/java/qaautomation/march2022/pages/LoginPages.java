package qaautomation.march2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPages extends BasePages{
	
	By username = By.xpath("//input[@id='username']");
	By password = By.id("password");
	By loginBtn = By.xpath("//button[@type='submit']");
	By loginBnr = By.xpath("//h2[normalize-space()='Login Page']");
	By invalidPass = By.xpath("//div[@id='flash']");
	By invalidUser = By.id("flash");

	public LoginPages(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		
	}
	
	public void inputUsername(String user) {
		setText(username,user);
		
	}
	public void inputPassword(String pass) {
		setText(password,pass);
	}
	public void clickLoginBtn() {
		clickAndWait(loginBtn);
	}
	public String getLoginBanner(){
		return getText(loginBnr);
		
	}
	public String getInvalidPass() {
		return getText(invalidPass);
	}
	public String getInvalidUsername() {
		return getText(invalidUser);
	}


}
