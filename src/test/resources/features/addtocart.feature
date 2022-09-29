Feature: Add to cart

  Scenario: Add to cart function
    Given Already logged in
    When I select an item
    Then Item should be added

