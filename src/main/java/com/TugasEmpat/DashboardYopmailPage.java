package com.TugasEmpat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardYopmailPage extends BasePages {
	By fieldinbox = By.xpath("//input[@id='login']");
	By clickarrow = By.xpath("//i[@class='material-icons-outlined f36']");
	
	
	public DashboardYopmailPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public void inputtext(String inbox) {
		setText(fieldinbox, inbox);
	}
	
	public void clickArrowButton() {
		clickAndWait(clickarrow);
	}

}