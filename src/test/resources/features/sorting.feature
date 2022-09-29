Feature: Sorting
  Scenario: Sorting Function
    Given Already logged in and Add one item
    When I click sort by "<Filter>"
    And I add item
    And I click cart icon
    And I redirect to cart page
    And I remove item
    Then I click continue shopping button


    Example:
      |Filter           |
      |Name (Z to A)   |