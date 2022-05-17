@regression
Feature: user could open followUs links
  Scenario: user could open facebook link
    When user clicks on facebook link
    Then "https://web.facebook.com/nopCommerce?_rdc=1&_rdr" is opened in a new tab

  Scenario: user could open twitter link
    When user clicks on twitter link
    Then "https://twitter.com/nopCommerce" is opened in a new tab

  Scenario: user could open rss link
    When user clicks on rss link
    Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in a new tab

  Scenario: user could open youtube link
    When user clicks on youtube link
    Then "https://www.youtube.com/user/nopCommerce" is opened in a new tab