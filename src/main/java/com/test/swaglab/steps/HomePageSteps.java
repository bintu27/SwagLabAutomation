package com.test.swaglab.steps;

import com.test.swaglab.pages.HomePage;
import io.cucumber.java.en.Given;

public class HomePageSteps {
    HomePage homepage = new HomePage();

    @Given("^User is on the homepage of the application$")
    public void isUserOnHomepage() {
        homepage.isUserOnHomepage();
    }

}
