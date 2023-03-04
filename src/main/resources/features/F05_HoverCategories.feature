@smoke
Feature: F05_HoverCategories | Mouse Hover on mail category then select sub-category
  Scenario: user could hover on main category then select sub-category
    Given Move by the mouse on computer category
    And   select Sub-category
   Then  Make sure that the sub-category title is contains the one you get it