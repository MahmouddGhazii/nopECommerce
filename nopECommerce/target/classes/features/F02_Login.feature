@regression
Feature: user login
  Scenario: guest user could Login with valid credentials
    When user click on "Log in" tab
    Then user should be directed to login page
    When user enter "MahmoudGalal.ElGhazy@gmail.com" and "Dduudd0@"
    And clicks on LOG IN button
    Then user should be logged in successfully