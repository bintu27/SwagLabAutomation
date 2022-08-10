package com.test.swaglab.pages;

import static com.test.swaglab.utils.AssertionUtils.assertEquals;
import static com.test.swaglab.utils.ConfigUtils.getPropertyByKey;
import static com.test.swaglab.utils.DriverUtils.getDriver;

public class CommonPage {

    public void verifyPageUrl(String pageName) {
        assertEquals(getDriver().getCurrentUrl(), getPropertyByKey(pageName));
    }
}
