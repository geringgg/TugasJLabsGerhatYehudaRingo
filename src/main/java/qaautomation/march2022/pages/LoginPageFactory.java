package qaautomation.march2022.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageFactory extends BasePages{
	
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;
	@FindBy(xpath = "//h2[normalize-space()='Login Page']")
	private WebElement loginBnr;
	@FindBy(xpath = "//div[@id='flash']")
	private WebElement invalidPass;
	@FindBy(id = "flash")
	private WebElement invalidUser;
	
	

	public LoginPageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver.get(), this);
		
	}
	public void inputUsername(String user) {
		username.sendKeys(user);
		
	}
	public void inputPassword(String pass) {
		password.sendKeys(pass);;
	}
	public void clickLoginBtn() {
		loginBtn.click();
	}
	public String getLoginBanner(){
		return loginBnr.getText();
		
	}
	public String getInvalidPass() {
		return invalidPass.getText();
	}
	public String getInvalidUsername() {
		return invalidUser.getText();
	}


}
