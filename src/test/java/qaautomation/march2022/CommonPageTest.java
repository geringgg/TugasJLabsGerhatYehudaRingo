package qaautomation.march2022;

import org.testng.annotations.Test;

import qaautomation.march2022.pages.CommonPage;
import qaautomation.march2022.utils.TestUtility;

public class CommonPageTest extends BaseWebTest {
	
	CommonPage commonPage = new CommonPage(driver,explicitWait);
	
	@Test
	public void testSwiching() {
		commonPage.openNewTab();
		commonPage.switchWindow(1);
		commonPage.openUrl("https://www.facebook.com");
		commonPage.openNewWindow();
		commonPage.switchWindow(2);
		commonPage.openUrl("https://www.youtube.com");
		commonPage.switchWindow(0);
	}
	@Test
	public void testScroll() {
		commonPage.openNewTab();
		commonPage.switchWindow(1);
		commonPage.openUrl("https://www.testautomasi.com");
		commonPage.runJavaScriptCommand("window.scrollBy(0,1000)");
		TestUtility.hardWait(3);
	}
}
