package com.test.swaglab.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.test.swaglab.utils.CommonUtils.clickOnElement;
import static com.test.swaglab.utils.ConfigUtils.getPropertyByKey;
import static com.test.swaglab.utils.DriverUtils.getDriver;

public class InventoryPage {
    public InventoryPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(className = "btn")
    private List<WebElement> addToCartButtons;

    @FindBy(className = "inventory_item_name")
    private List<WebElement> itemName;

    @FindBy(id = "checkout")
    private static WebElement checkoutButton;
    @FindBy(className = "shopping_cart_link")
    private WebElement cartIcon;

    public void clickAddToCart() {
        int productCount = Integer.parseInt(getPropertyByKey("NumberOfItem"));
        int totalProducts = addToCartButtons.size();
        int i = 0;
        /* ************************************************************************************************
         Check if supplied products count value is less or greater than items present on website
         If product count is negative set its value to zero
         If supplied products count is grater than total products on website,
         set products count to total products on website
         ************************************************************************************************ */


        if (productCount > totalProducts) {
            productCount = totalProducts;
        } else if (productCount < 0) {
            productCount = 0;
        }

        /* ************************************************************************************************
         Add at least 1 item to cart if supplied products count is negative or zero.
         Add supplied products to cart
         ************************************************************************************************ */
        do {
            clickOnElement(addToCartButtons.get(i));
            i++;
        } while (i < productCount);
    }

    public void addSingleItemToCart() {
            clickOnElement(addToCartButtons.get(0));
    }

    public void addProductToCartByName(String productName) {
        for (int i = 0; itemName.size() > i; i++) {
            if (itemName.get(i).getText().equals(productName)) {
                clickOnElement(addToCartButtons.get(i));
            }
        }

    }

    public void clickOnCartIcon() {
        clickOnElement(cartIcon);
    }

    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
    }

}

