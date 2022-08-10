package com.test.swaglab.steps;

import com.test.swaglab.pages.CheckoutCompletePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutCompletePageSteps {

    CheckoutCompletePage checkoutcompletePage = new CheckoutCompletePage();

    @Then("User should see order placed confirmation message")
    public void completeOrderMessage() {
        checkoutcompletePage.completeOrderMessage();
    }

    @When("User click on back home button")
    public void clickOnBackHomeButton() {
        checkoutcompletePage.clickOnBackHomeButton();
    }

}
