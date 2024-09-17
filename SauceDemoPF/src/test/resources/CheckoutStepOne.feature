Feature: Checkout Step One feature
  Background: User login into Sauce Demo and some products added to the cart
    Given I am on the Sauce Demo web page
    When Enter the username as "standard_user"
    And Enter the password as "secret_sauce"
    And Click on the login button
    And Add the product "Sauce Labs Backpack" to the cart
    And Add the product "Sauce Labs Bike Light" to the cart
    And Click on the cart icon
    And Click on checkout button

  Scenario: Verify error message when fields are empty
    And Set the first name with ""
    And Set the last name with ""
    And Set the postal code with ""
    And Click on Continue Button
    Then The error message "Error: First Name is required" should be displayed