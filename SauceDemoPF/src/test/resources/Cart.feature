Feature: Cart feature
  Background: User logs in to Sauce Demo
    Given I am on the Sauce Demo web page
    When Enter the username as "standard_user"
    And Enter the password as "secret_sauce"
    And Click on the login button

  Scenario: Check that the cart is not empty
    When Click on the cart icon
    Then Button continuar should be disabled
