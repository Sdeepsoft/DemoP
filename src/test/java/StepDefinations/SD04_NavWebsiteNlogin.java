package StepDefinations;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.io.IOException;

public class SD04_NavWebsiteNlogin {

    @Given("Navigate to abc website")
    public void navigate_to_abc_website() throws IOException {
        OpenBrowser.NavToWebsite(ReadPropertiesFile.PropFile("OmayoWebpage"));
    }

    @Then("Enter username as {string}")
    public void enter_username_as(String username) {
        OpenBrowser.driver.findElement(By.xpath("//*[@id='HTML31']/div[1]/form/input[1]")).sendKeys(username);

    }

    @Then("Enter password as {string}")
    public void enter_password_as(String password) {
        OpenBrowser.driver.findElement(By.xpath("//*[@id='HTML31']/div[1]/form/input[2]")).sendKeys(password);
    }
}
