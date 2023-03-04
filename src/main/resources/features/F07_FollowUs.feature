@smoke
Feature: F07_FollowUs | Navigate between Webpages
  Scenario: user opens Facebook link
    Given user opens facebook
    Then   facebook page is opened in new tab and assert on it



  Scenario: user opens twitter link
    Given   user opens twitter
    Then   twitter page is opened in new tab and assert on it



  Scenario: user opens youtube link
    Given user opens youtube
    Then   youtube page is opened in new tab and assert on it

