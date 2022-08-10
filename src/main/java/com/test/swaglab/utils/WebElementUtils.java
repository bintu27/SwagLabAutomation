package com.test.swaglab.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.test.swaglab.utils.DriverUtils.driver;
import static com.test.swaglab.utils.DriverUtils.getDriver;

public class WebElementUtils {
    static Long timeout = Long.parseLong("30");
    static WebDriverWait wait = new WebDriverWait(getDriver(), timeout);

    public static void waitForVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void presenceOfElement(String className) {
//        try {
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.className(className)));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


    public static void waitForNotVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.invisibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitForElementToBeClickable(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectValueFromDropDown(WebElement element, String value) {
        Select option = new Select(element);
        option.selectByValue(value);
    }

    public static void selectValueFromDropDownByVisibleTxt(WebElement element, String value) {
        Select option = new Select(element);
        option.selectByVisibleText(value);
    }

    public static WebElement createDynamicLocator(String xpath, String formattingString) {
        WebElement element = driver.findElement(By.xpath(String.format(xpath, formattingString)));
        waitForVisible(element);
        return element;
    }
}
