@regression
Feature: user will be able to open sliders in homepage
  Scenario: first slider are clickable on homepage
    When user click in first slider
    Then the relative product for first slider is displayed

  Scenario: second slider are clickable on homepage
    When user click in second slider
    Then the relative product for second slider is displayed
