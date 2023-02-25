@smoke
Feature: Search by different inputs
Scenario Outline: user should be able to search by product name
Given user go to search bar and enter <product name>
  And click on search button
Then  search should be successful
Examples:
| product name |
|    book      |
  Scenario Outline: user should be able to search by sku
    Given user go to search bar and enter <sku>
    And click on search button
    Then search should be successful
    Examples:
      |      sku    |
      |   SCI_FAITH |
