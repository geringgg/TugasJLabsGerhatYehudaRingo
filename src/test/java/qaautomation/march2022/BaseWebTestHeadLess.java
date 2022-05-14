package qaautomation.march2022;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseWebTestHeadLess {
	
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	//Web Driver untuk Wait juga menggunakan multi thread
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--Headless","--disable-gpu","--windows-size=1920,1200");
		driver.set(new ChromeDriver(options));
		// ExplicitWait di call dengan menggunakan driver.get()
		explicitWait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(60)));
		driver.get().get("http://the-internet.herokuapp.com/secure");
		

	}
	@AfterMethod
	public void cleanUp() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get().quit();
	}

}
