@Regression @PlaceAnOrder
Feature: User should be able to place single or multiple orders

  @Smoke
  Scenario: User should be able to place an order

    Given User is on the homepage of the application
    When User logs in using valid login credentials
    And User add "single item" to the cart
    And User click on the cart icon
    Then User should be on the "Cart" Page

    When User click on the checkout button
    Then User should be on the "CheckoutInfo" Page

    When User enters required details on checkout info page
    And User click on continue button
    Then User should be on the "CheckoutOverview" Page

    When User click on finish button
    Then User should be on the "CheckoutComplete" Page
    And User should see order placed confirmation message


  Scenario: Verify user should be able to place orders with multiple item in single order

    Given User is on the homepage of the application
    When User logs in using valid login credentials
    And User add "multiple item" to the cart
    Then The cart icon should show added item count

    When User click on the cart icon
    Then User should be on the "Cart" Page

    When User click on the checkout button
    Then User should be on the "CheckoutInfo" Page

    When User enters required details on checkout info page
    And User click on continue button
    Then User should be on the "CheckoutOverview" Page

    When User click on finish button
    Then User should be on the "CheckoutComplete" Page
    And User should see order placed confirmation message

  Scenario Outline: Verify user should be able to place multiple orders to multiple address

    Given User is on the homepage of the application
    When User logs in using valid login credentials
    And User add "multiple item" to the cart
    Then The cart icon should show added item count

    When User click on the cart icon
    Then User should be on the "Cart" Page

    When User click on the checkout button
    Then User should be on the "CheckoutInfo" Page

    And User enters <firstname>, <lastname> and <postcode>
    And User click on continue button
    Then User should be on the "CheckoutOverview" Page

    When User click on finish button
    Then User should be on the "CheckoutComplete" Page
    And User should see order placed confirmation message

    Examples:
      | firstname   | lastname   | postcode |
      | "Bintu"     | "Dhillon"  | "E162BA" |
      | "firstname" | "lastname" | "NG22FR" |
