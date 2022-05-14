package qaautomation.march2022;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.march2022.pages.TugasTigaYopmail;

public class AppTestTugasTiga extends TugasTigaBaseWebTest{
	
	TugasTigaYopmail yopmail = new TugasTigaYopmail(driver,explicitWait);
	
	@Test
	public void inputEmail() {
		
		String email = "automationtest";
		yopmail.inputEmail(email);
		yopmail.inputButton();

		yopmail.switchIframe();
		String actualText = yopmail.getAutomationText();
//		System.out.println(actualText);
		String expectedText = "The subscription for\n" + 
				"your Toyota Yaris\n" + 
				"is confirmed, Invygo_Automation"; 
		
		Assert.assertEquals(expectedText,actualText);
	}

}
