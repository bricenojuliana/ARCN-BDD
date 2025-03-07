Feature: Add/Remove Elements functionality

  Scenario: Add and remove an element
    Given I am on the Add/Remove Elements page
    When I click the Add Element button
    Then a Delete button should appear
    When I click the Delete button
    Then the Delete button should disappear
