package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AT01_NavigateToWebsite {
    static WebDriver driver = null;
    @Test
    public static void Nav() throws IOException {
        //setting up chromedriver- clear cache to get the new version of chromedriver by webdrivermanager
		//WebDriverManager.chromedriver().clearDriverCache().setup();
        
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to the website
		driver.get("https://www.baeldung.com/");
        //get title from the page and assert
        String ActualTitle=driver.getTitle();
        String ExpectedTitle="Baeldung";
        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }


    @Test
    public static void clickStartHereLink() throws IOException, InterruptedException {
        Thread.sleep(10000);

        driver.findElement(By.xpath("//a[text()='Start Here']")).click();
    }


}
