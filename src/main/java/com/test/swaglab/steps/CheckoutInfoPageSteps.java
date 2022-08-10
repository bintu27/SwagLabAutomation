package com.test.swaglab.steps;

import com.test.swaglab.pages.CheckoutInfoPage;

import io.cucumber.java.en.When;

public class CheckoutInfoPageSteps {

    CheckoutInfoPage checkoutinfoPage = new CheckoutInfoPage();

    @When("^User enters \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterUserDetails(String firstName, String lastName, String postCode) {
        checkoutinfoPage.enterUserDetails(firstName, lastName, postCode);
    }

    @When("^User enters required details on checkout info page$")
    public void enterRequiredDetails() {
        checkoutinfoPage.enterUserDetails();
    }

    @When("User click on continue button")
    public void clickOnContinueButton() {
        checkoutinfoPage.clickOnContinueButton();
    }

}
