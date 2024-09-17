Feature: Checkout Step Two feature
  Background: User logs in to Sauce Demo and adds products to the cart
    Given I am on the Sauce Demo web page
    When Enter the username as "standard_user"
    And Enter the password as "secret_sauce"
    And Click on the login button
    And Add the product "Sauce Labs Backpack" to the cart
    And Add the product "Sauce Labs Bike Light" to the cart
    And Click on the cart icon
    And Click on checkout button

  Scenario: Check the total price in the shop summary
    And Set the first name with "Daniel"
    And Set the last name with "Torrico"
    And Set the postal code with "123"
    And Click on Continue Button
    And Check the total price calculated and the total products price
