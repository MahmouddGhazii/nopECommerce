@regression
Feature: guest user could add products to cart
  Scenario: success message is visible after adding product to cart
    When user add product to cart
    Then cart notification success is visible

  Scenario: number of cart items increased
    When user add product to cart
    Then cart notification success is visible
    And the cart page is updated