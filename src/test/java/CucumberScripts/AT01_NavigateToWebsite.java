package CucumberScripts;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

public class AT01_NavigateToWebsite {

    @Test
    public static void Nav() throws IOException {
        OpenBrowser.NavToWebsite(ReadPropertiesFile.PropFile("HNWebsite"));
        //get title from the page and assert
        String ActualTitle=OpenBrowser.driver.getTitle();
        System.out.println("title : " + ActualTitle);
        String ExpectedTitle="Harvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia";
        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }


    @Test
    public static void NavAccLink() throws IOException, InterruptedException {
Thread.sleep(10000);
        OpenBrowser.driver.findElement((By.xpath("//*[@id='header']/div[1]/div/ul/li[6]/a"))).click();
    }


}
