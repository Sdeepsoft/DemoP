package StepDefinations;


import Tests.AT03_CreateAnAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD03_CreateAnAccount {

    @Given("Navigate to Create an Account screen")
    public void navigate_to_create_an_account_screen() throws IOException {
        AT03_CreateAnAccount.navToReg();
    }
    @Then("Enter FirstName")
    public void enter_first_name() throws IOException {
        AT03_CreateAnAccount.EnterFirstName();
    }
    @Then("Enter LastName")
    public void enter_last_name() throws IOException {
        AT03_CreateAnAccount.EnterLasttName();
    }
}
