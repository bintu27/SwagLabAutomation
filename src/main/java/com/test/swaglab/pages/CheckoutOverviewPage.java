package com.test.swaglab.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.test.swaglab.utils.CommonUtils.clickOnElement;
import static com.test.swaglab.utils.DriverUtils.getDriver;

public class CheckoutOverviewPage {
    public CheckoutOverviewPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(id = "finish")
    private static WebElement finishButton;

    @FindBy(className = "summary_subtotal_label")
    private static WebElement preTaxTotal;

    @FindBy(className = "inventory_item_price")
    private List<WebElement> itemPrices;

    public void clickOnFinishButton() {
        clickOnElement(finishButton);
    }

    public double calculateItemsTotalPrice() {
        double total = 0;
        for (int i = 0; i < itemPrices.size(); i++) {
            String value = itemPrices.get(i).getText().substring(1);
            total += Double.parseDouble(value);
        }
        return total;
    }

    public double getPreTaxTotal() {
        String preTax = preTaxTotal.getText();
        double preTaxAmount = Double.parseDouble(preTax.substring(preTax.indexOf("$") + 1));
        return preTaxAmount;
    }

}

