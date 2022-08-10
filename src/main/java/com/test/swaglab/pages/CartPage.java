package com.test.swaglab.pages;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.test.swaglab.utils.CommonUtils.clickOnElement;
import static com.test.swaglab.utils.DriverUtils.getDriver;
import static com.test.swaglab.utils.ConfigUtils.getPropertyByKey;
import static com.test.swaglab.utils.AssertionUtils.assertEquals;


public class CartPage {
    public CartPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(className = "cart_item")
    private List<WebElement> cartItems;

    @FindBy(className = "shopping_cart_badge")
    private List<WebElement> cartIconCount;

    @FindBy(className = "inventory_item_name")
    private static WebElement itemName;

    @FindBy(id = "continue-shopping")
    private static WebElement continueShoppingButton;

    @FindBy(className = "shopping_cart_badge")
    private WebElement shoppingCartCount;

    public void cartCount() {
        assertEquals( getPropertyByKey("NumberOfItem"), (shoppingCartCount.getText()));
    }

    public void isCartNotEmpty() {
        Assert.assertTrue(cartItems.size() != 0);
    }

    public void isCartIconEmpty() {
        Assert.assertFalse(cartIconCount.size() != 0);
    }

    public void cartIconCount() {
        assertEquals( getPropertyByKey("NumberOfItem"), (shoppingCartCount.getText()));
    }

    public void verifyAddedProduct(String productName) {
        assertEquals( productName, (itemName.getText()));
    }

    public void clickOnContinueShopping() {clickOnElement(continueShoppingButton);}
}

