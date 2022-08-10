package com.test.swaglab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

import static com.test.swaglab.utils.DriverUtils.getDriver;
import static com.test.swaglab.utils.ConfigUtils.getPropertyByKey;
import static com.test.swaglab.utils.AssertionUtils.assertEquals;
import static com.test.swaglab.utils.CommonUtils.clickOnElement;

public class CheckoutCompletePage {
    public CheckoutCompletePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(className = "complete-header")
    private static WebElement orderConfirmationMessage;

    @FindBy(id = "back-to-products")
    private static WebElement backHomeButton;

    public void completeOrderMessage() {
        assertEquals(orderConfirmationMessage.getText(), getPropertyByKey("orderConfirmationMessage"));
    }

    public void clickOnBackHomeButton() {
        clickOnElement(backHomeButton);
    }

}

