package StepDefinations;


import CucumberScripts.AT01_NavigateToWebsite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD01_NavigateToHNWebsite {

    @Given("open the browser and enter url and press enter key")
    public void open_the_browser_and_enter_url_and_press_enter_key() throws IOException {
        AT01_NavigateToWebsite.Nav();
           }

    @Then("click on Account link")
    public void click_on_account_link() throws IOException, InterruptedException {
        AT01_NavigateToWebsite.NavAccLink();
    }
}
