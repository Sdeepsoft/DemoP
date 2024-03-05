package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class OpenBrowser {
	public static WebDriver driver;

	public static void NavToWebsite(String url) throws IOException {
		//setting up chromedriver
		WebDriverManager.chromedriver().setup();
		//options
		ChromeOptions chromeOptions = new ChromeOptions();
		//we create an object of WebDriver
		driver = new ChromeDriver(chromeOptions);
		//At this point browser will be opened
		//maximize browser
		driver.manage().window().maximize();
		//Navigate to HN website
		driver.get(url);

	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static void closeBrowser() {
		driver.close();
	}


}