Feature: Add product love to cart

  Scenario: Add product love to cart success
    Given that user open page MundoFlor and select the love category
    When user click add to cart on one of the products and return to the love section
      And repeat the process with another product
    Then The user will be able to see the selected products