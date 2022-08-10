package com.test.swaglab.pages;

import org.openqa.selenium.support.PageFactory;

import static com.test.swaglab.utils.DriverUtils.getDriver;
import static com.test.swaglab.utils.ConfigUtils.getPropertyByKey;
import static com.test.swaglab.utils.AssertionUtils.assertPageTitle;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void isUserOnHomepage() {
        assertPageTitle(getPropertyByKey("homepage.title"));
    }

}
