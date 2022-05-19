@regression
Feature: search for items
  Scenario: users will be able to search for products with different parameters
    When user clicks on search field
    And types "Apple"
    And clicks on the search button
    Then the search results will appear

  Scenario: user could search using sku
    When user clicks on search field
    And types "AP_MBP_13"
    And clicks on the search button
    Then the search results will appear