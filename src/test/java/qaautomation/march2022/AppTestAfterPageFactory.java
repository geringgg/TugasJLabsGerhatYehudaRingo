package qaautomation.march2022;
import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.march2022.pages.LoginPageFactory;
import qaautomation.march2022.pages.ProfilePageFactory;

/**
 * Unit test for simple App.
 */
public class AppTestAfterPageFactory extends BaseWebTestHeadLess {



	@Test
	public void LoginToWebAndSuccess() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver,explicitWait);
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginBtn();
		
		String actualText = profilePage.getProfileText();
		
		
		String expectedText = "You logged into a secure area!";
		Assert.assertTrue(actualText.contains(expectedText));
	}
	@Test
	public void LoginToWebWithoutClickLoginButton() {	
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		String actualText = loginPage.getLoginBanner();
		String expectedText = "Login Page";
		Assert.assertTrue(actualText.contains(expectedText));
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		

	}
	@Test
	public void LoginToWebInvalidPassword() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		String username = "tomsmith";
		String password = "ahay";
		
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginBtn();
		String actualText = loginPage.getInvalidPass();
		String expectedText = "Your password is invalid!";
		Assert.assertTrue(actualText.contains(expectedText));
		
		
	}
	@Test
	public void LoginToWebInvalidUsername() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		String username = "jardom";
		String password = "SuperSecretPassword!";
		
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginBtn();
		String actualText = loginPage.getInvalidUsername();
		String expectedText = "Your username is invalid!";
		Assert.assertTrue(actualText.contains(expectedText));
		
		
	}
	
	
	
}
