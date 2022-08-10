package com.test.swaglab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

import static com.test.swaglab.utils.DriverUtils.getDriver;
import static com.test.swaglab.utils.ConfigUtils.getPropertyByKey;
import static com.test.swaglab.utils.CommonUtils.clickOnElement;
import static com.test.swaglab.utils.CommonUtils.sendKeysTo;

public class CheckoutInfoPage {
    public CheckoutInfoPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(id = "first-name")
    private static WebElement firstNameField;
    @FindBy(id = "last-name")
    private static WebElement lastNameField;
    @FindBy(id = "postal-code")
    private static WebElement postCodeField;
    @FindBy(id = "continue")
    private static WebElement continueButton;

    /* ************************************************************************************************
     Implemented method overloading for inputting user details, different arguments passed based on scenario
     ************************************************************************************************ */
    public void enterUserDetails(String firstName, String lastName, String postCode) {
        sendKeysTo(firstNameField, firstName);
        sendKeysTo(lastNameField, lastName);
        sendKeysTo(postCodeField, postCode);
    }

    public void enterUserDetails() {
        sendKeysTo(firstNameField, getPropertyByKey("firstName"));
        sendKeysTo(lastNameField, getPropertyByKey("lastName"));
        sendKeysTo(postCodeField, getPropertyByKey("postCode"));
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

}

