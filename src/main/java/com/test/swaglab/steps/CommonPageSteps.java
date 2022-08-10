package com.test.swaglab.steps;

import com.test.swaglab.pages.CommonPage;
import io.cucumber.java.en.Then;

public class CommonPageSteps {

    CommonPage commonPage = new CommonPage();

    @Then("User should be on the {string} Page")
    public void verifyPageUrl(String pageName) {
        commonPage.verifyPageUrl(pageName);
    }

}
