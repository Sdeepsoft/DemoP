package StepDefinations;



import CucumberScripts.AT01_NavigateToWebsite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD01_NavigateToWebsite {

    @Given("Navigate to the home page")
    public void open_the_browser_and_enter_url_and_press_enter_key() throws IOException {
        AT01_NavigateToWebsite.Nav();
           }

    @Then("Click on Start Here menu tab")
    public void click_on_account_link() throws IOException, InterruptedException {
        AT01_NavigateToWebsite.NavStartHereLink();
    }
}
