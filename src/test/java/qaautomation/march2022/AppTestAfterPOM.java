package qaautomation.march2022;
import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.march2022.pages.LoginPages;
import qaautomation.march2022.pages.ProfilePages;

/**
 * Unit test for simple App.
 */
public class AppTestAfterPOM extends BaseWebTest {
	LoginPages loginPage = new LoginPages(driver, explicitWait);
	ProfilePages profilePage = new ProfilePages(driver,explicitWait);


	@Test
	public void LoginToWebAndSuccess() {
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
