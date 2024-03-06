package Tests;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

public class AT01_NavigateToWebsite {

    @Test
    public static void Nav() throws IOException {
        OpenBrowser.navToWebsite(ReadPropertiesFile.PropFile("HNWebsite"));
        //get title from the page and assert
        String ActualTitle=OpenBrowser.driver.getTitle();
        String ExpectedTitle="Baeldung";
        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }


    @Test
    public static void NavStartHereLink() throws IOException, InterruptedException {
        Thread.sleep(10000);
        OpenBrowser.driver.findElement((By.xpath("//a[text()='Start Here']"))).click();
    }


}
