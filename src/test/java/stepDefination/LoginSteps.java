package stepDefination;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
     @Given("user is on login page")
    public void openLoginPage() {
        System.out.println("Opening Login Page");
    }

    @When("user enters username and password")
    public void enterCredentials() {
        System.out.println("Entering credentials");
    }

    @Then("login should be successful")
    public void loginSuccess() {
        System.out.println("Login Successful");
    }

}
