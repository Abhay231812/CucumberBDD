package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_VerifyLogin {

@Given("user is on home page")
public void user_is_on_home_page() {
    System.out.println("Launch Rediff..");
}
@When("user enters username and password clicks on Submit button")
public void user_enters_username_and_password_clicks_on_submit_button() {
   System.out.println("Enter user name and password click on submit button");
}
@Then("Check user and if valid display successful message")
public void check_user_and_if_valid_display_successful_message() {
   System.out.println("Login Successful");
}
@Then("Logout and Close browser")
public void logout_and_close_browser() {
	System.out.println("Logout");
}



}
