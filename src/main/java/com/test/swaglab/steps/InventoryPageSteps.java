package com.test.swaglab.steps;

import com.test.swaglab.pages.InventoryPage;
import io.cucumber.java.en.When;

public class InventoryPageSteps {
    InventoryPage inventoryPage = new InventoryPage();

    @When("User add items to the cart$")
    public void clickAddToCart() {
        inventoryPage.clickAddToCart();
    }

    @When("User add {string} to the cart")
    public void addSingleItemToCart(String quantity) {
        if (quantity.equals("single item")) {
            inventoryPage.addSingleItemToCart();
        }
        inventoryPage.clickAddToCart();
    }

    @When("User add {string} product to the cart")
    public void addProductToCart(String productName) {
        inventoryPage.addProductToCartByName(productName);
    }

    @When("^User click on the cart icon$")
    public void clickOnCartIcon() {
        inventoryPage.clickOnCartIcon();
    }

    @When("^User click on the checkout button$")
    public void clickOnCheckoutButton() {
        inventoryPage.clickOnCheckoutButton();
    }
}
