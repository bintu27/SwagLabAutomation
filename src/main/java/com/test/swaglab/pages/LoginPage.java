package com.test.swaglab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.test.swaglab.utils.DriverUtils.getDriver;
import static com.test.swaglab.utils.CommonUtils.clickOnElement;
import static com.test.swaglab.utils.CommonUtils.sendKeysTo;
import static com.test.swaglab.utils.ConfigUtils.getPropertyByKey;
import static com.test.swaglab.utils.AssertionUtils.assertEquals;
import static com.test.swaglab.utils.AssertionUtils.assertPresent;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(id = "user-name")
    private WebElement loginName;
    @FindBy(id = "password")
    private WebElement loginPassword;
    @FindBy(id = "login-button")
    private WebElement loginButton;
    @FindBy(className = "error-message-container")
    private WebElement errorMessage;
    @FindBy(className = "bm-burger-button")
    private WebElement menuIcon;
    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement logoutButton;
    @FindBy(className = "login_logo")
    private WebElement loginLogo;


    /* ************************************************************************************************
     Implemented method overloading for login functionality, different arguments passed according to scenario
     ************************************************************************************************ */
    public void login() {
        sendKeysTo(loginName, getPropertyByKey("username"));
        sendKeysTo(loginPassword, getPropertyByKey("password"));
        clickOnElement(loginButton);
    }

    public void login(String userid) {
        sendKeysTo(loginName, userid);
        sendKeysTo(loginPassword, getPropertyByKey("password"));
        clickOnElement(loginButton);
    }

    public void login(String userid, String password) {
        sendKeysTo(loginName, userid);
        sendKeysTo(loginPassword, password);
        clickOnElement(loginButton);
    }

    public void invalidLogin() {
        assertEquals(errorMessage.getText(), getPropertyByKey("errorMessage"));
    }

    public void clickOnMenuIcon() {
        clickOnElement(menuIcon);
    }

    public void clickOnLogoutButton() {
        clickOnElement(logoutButton);
    }

    public void backToLoginPage() {
        assertPresent(loginLogo);
    }

}
