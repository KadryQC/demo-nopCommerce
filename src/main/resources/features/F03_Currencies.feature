@smoke
Feature: F03_Currencies | users assert on the Euro symbol
  Scenario: user could assert on euro symbol if changed or not
    Given Click on the dropdown list on the top left of home page and choose euro symbol
    Then  Make sure that euro symbol changed in the four products displayed in the homepage