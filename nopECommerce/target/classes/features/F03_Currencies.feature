@regression
Feature: currency switching
  Scenario: guest user could switch between currencies [$, €]
    When user click on currency field and choose Euro
    Then the currency changes to Euro