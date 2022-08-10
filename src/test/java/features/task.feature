@Regression @Task
Feature: task: User should be able to place multiple orders in single session

  Scenario Outline: Verify user should be able to place multiple orders in single session with single and multiple items

    Given User is on the homepage of the application
    When User logs in using valid login credentials
    Then Cart icon should be empty

    When User add "single item" to the cart
    And User click on the cart icon
    And User click on the checkout button
    And User enters required details on checkout info page
    And User click on continue button
    And User click on finish button
    Then User should see order placed confirmation message
    And Cart icon should be empty

    When User click on the cart icon
    And User click on continue shopping button in cart page
    Then User should be on the "Inventory" Page

    When User add <ProductName> product to the cart
    And User click on the cart icon
    Then Verify <ProductName> is added on cart page

    When User click on the checkout button
    And User enters required details on checkout info page
    And User click on continue button
    Then Tax free price should match total items price in cart

    When User click on finish button
    Then User should see order placed confirmation message

    Examples:

      | ProductName                |
      | "Sauce Labs Onesie"        |
      | "Sauce Labs Fleece Jacket" |