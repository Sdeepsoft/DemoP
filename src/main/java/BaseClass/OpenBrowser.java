package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	public static WebDriver driver;

	@Test
	public static void navToWebsite(String url) {
		//setting up chromedriver- clear cache to get the new version of chromedriver by webdrivermanager
		//WebDriverManager.chromedriver().clearDriverCache().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to the website
		driver.get(url);
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}


}