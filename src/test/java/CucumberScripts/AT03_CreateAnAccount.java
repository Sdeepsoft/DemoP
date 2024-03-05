package CucumberScripts;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

public class AT03_CreateAnAccount {
    @Test
    public static void navToReg() throws IOException {
        OpenBrowser.NavToWebsite(ReadPropertiesFile.PropFile("AccCreate"));

    }

    @Test
    public static void EnterFirstName() throws IOException {
        OpenBrowser.driver.findElement(By.id("firstname")).sendKeys("test");
    }
    @Test
    public static void EnterLasttName() throws IOException {
        OpenBrowser.driver.findElement(By.id("lastname")).sendKeys("test");
    }


}







