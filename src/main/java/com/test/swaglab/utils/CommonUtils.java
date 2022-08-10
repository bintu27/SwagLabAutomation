package com.test.swaglab.utils;

import org.openqa.selenium.WebElement;

import static com.test.swaglab.utils.WebElementUtils.waitForElementToBeClickable;
import static com.test.swaglab.utils.WebElementUtils.waitForVisible;

public class CommonUtils {
    public static void clickOnElement(WebElement element) {
        waitForVisible(element);
        waitForElementToBeClickable(element);
        element.click();
    }
    public static void sendKeysTo(WebElement element, String text) {
        waitForVisible(element);
        element.clear();
        element.sendKeys(text);
    }
}
