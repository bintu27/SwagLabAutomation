package com.test.swaglab.steps;

import com.test.swaglab.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CartPageSteps {
    CartPage cartPage = new CartPage();


    @Then("Cart icon should be empty")
    public void isCartIconEmpty() {
            cartPage.isCartIconEmpty();
    }

    @Then("^The cart icon should show added item count$")
    public void cartIconTotalCount() {
        cartPage.cartIconCount();
    }

    @Then("Verify {string} is added on cart page")
    public void verifyAddedProduct(String productName) {
        cartPage.verifyAddedProduct(productName);
    }

    @Then("Cart page should not be empty")
    public void isCartNotEmpty() {
            cartPage.isCartNotEmpty();
    }

    @When("^User click on continue shopping button in cart page$")
    public void continueShopping() {
        cartPage.clickOnContinueShopping();
    }

}
