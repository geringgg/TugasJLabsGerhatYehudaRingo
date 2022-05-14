package com.TugasEmpat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YopmailPage extends BasePages{
	By switchiframe = By.xpath("//iframe[@id='ifmail']");
	By msg = By.xpath("//div[@id='mail']");
	
	
	public YopmailPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public void switchiframe() {
		SwitchIframe(switchiframe);
	}
	
	public String gettext() {
		return getText(msg);
	}

}