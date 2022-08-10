@Regression @Login
Feature: User should be able to login with valid credentials only

  @Smoke
  Scenario: Verify user should be able to log in and log out
    Given User is on the homepage of the application
    When User logs in using valid login credentials
    And User click on top left menu icon
    And User click on Logout
    Then User should be navigated back to login page

  Scenario Outline: Verify user should be able to login with valid credentials
    Given User is on the homepage of the application
    When User logs in with username as <Username>
    Then User should be on the "Inventory" Page
    And Cart icon should be empty

    Examples:
      | Username                |
      | performance_glitch_user |
      | standard_user           |
      | problem_user            |

  Scenario Outline: Verify user should not be able to login with invalid credentials
    Given User is on the homepage of the application
    When User logs in with <Username> and <Password>
    Then User should get invalid login error message

    Examples:
      | Username                  | Password           |
      | "performance_glitch_user" | "Invalid_password" |
      | "Invalid_userName"        | "secret_sauce"     |
      | "Invalid_userName"        | "Invalid_password" |