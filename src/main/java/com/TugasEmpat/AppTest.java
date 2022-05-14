package com.TugasEmpat;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TugasEmpat.DashboardYopmailPage;

public class AppTest extends BaseWebTest {
	DashboardYopmailPage dashboardPage = new DashboardYopmailPage(driver, explicitWait);
	YopmailPage mailpage = new YopmailPage(driver, explicitWait);
	
	@Test
	public void GetMailText() {
		String intext = "automationtest";
		dashboardPage.inputtext(intext);
		dashboardPage.clickArrowButton();
		mailpage.switchiframe();
		String mail = mailpage.gettext();
		System.out.println(mail);
		
	}
	
	
}