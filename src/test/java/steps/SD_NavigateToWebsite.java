package steps;

import java.io.IOException;

import Tests.AT01_NavigateToWebsite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD_NavigateToWebsite {
    @Given("User opens the browser and navigates to the Baeldung website url")
    public void User_opens_the_browser_and_navigates_to_the_Baeldung_website_url() throws IOException {
        AT01_NavigateToWebsite.Nav();
    }
    @Then("click on the Start here link")
    public void click_on_the_Start_here_link() throws IOException, InterruptedException {
        AT01_NavigateToWebsite.clickStartHereLink();
    }


}
