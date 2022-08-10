package com.test.swaglab.steps;

import com.test.swaglab.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
    LoginPage loginpage = new LoginPage();

    @When("^User logs in with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userLoginWithNameAndPassword(String userid, String password) {
        loginpage.login(userid, password);
    }

    @When("^User logs in with username as ([^\"]*)$")
    public void userLogsWithUserName(String userid) {
        loginpage.login(userid);
    }

    @When("User logs in using valid login credentials")
    public void userLogsIn() {
        loginpage.login();
    }

    @When("User click on top left menu icon")
    public void clickOnMenuIcon() {
        loginpage.clickOnMenuIcon();
    }

    @When("User click on Logout")
    public void userClickOnLogout() {
        loginpage.clickOnLogoutButton();
    }

    @Then("User should get invalid login error message")
    public void InvalidLoginErrorMessage() {
        loginpage.invalidLogin();
    }

    @Then("User should be navigated back to login page")
    public void backToLoginPage() {
        loginpage.backToLoginPage();
    }
}
