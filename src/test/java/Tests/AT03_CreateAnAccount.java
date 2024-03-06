package Tests;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

public class AT03_CreateAnAccount {
    @Test
    public static void navToReg() throws IOException {
        OpenBrowser.navToWebsite(ReadPropertiesFile.PropFile("AccCreate"));

    }

    @Test
    public static void EnterFirstName() {
        OpenBrowser.driver.findElement(By.id("firstname")).sendKeys("test");
    }
    @Test
    public static void EnterLasttName() {
        OpenBrowser.driver.findElement(By.id("lastname")).sendKeys("test");
    }


}







