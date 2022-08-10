package com.test.swaglab.steps;

import com.test.swaglab.pages.CheckoutOverviewPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutOverviewPageSteps {

    CheckoutOverviewPage checkoutoverviewPage = new CheckoutOverviewPage();

    @When("User click on finish button")
    public void clickOnFinishButton() {
        checkoutoverviewPage.clickOnFinishButton();
    }

    @Then("Tax free price should match total items price in cart")
    public void verifyTaxFreePrice() {
        Assert.assertTrue((checkoutoverviewPage.calculateItemsTotalPrice() -
                checkoutoverviewPage.getPreTaxTotal()) == 0);
    }
}
