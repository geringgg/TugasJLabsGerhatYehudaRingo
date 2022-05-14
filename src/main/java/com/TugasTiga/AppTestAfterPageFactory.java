package com.TugasTiga;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.march2022.pages.LoginPageFactory;
import qaautomation.march2022.pages.ProfilePageFactory;

/**
 * Unit test for simple App.
 */
public class AppTestAfterPageFactory extends BaseWebTest {
	@Test
	public void loginToWebAndSuccess() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
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
	public void loginToWebNotClickingLoginButton() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);

		String actualText = loginPage.getLoginBanner();
		String expectedText = "Login Page";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void loginInvalidPassword() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		String username = "tomsmith";
		String password = "SuperSecretPassword";
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginBtn();

		String actualText = profilePage.getProfileText();
		String expectedText = "Your password is invalid!";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void loginInvalidUsername() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		String username = "usernameSalah";
		String password = "SuperSecretPassword";
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginBtn();

		String actualText = profilePage.getProfileText();
		String expectedText = "Your username is invalid!";
		Assert.assertTrue(actualText.contains(expectedText));
	}
}
