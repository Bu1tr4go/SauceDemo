Feature: Home feature
  Background: User logs in to Sauce Demo
    Given I am on the Sauce Demo web page
    When Enter the username as "standard_user"
    And Enter the password as "secret_sauce"
    And Click on the login button

  Scenario Outline: Check the reset state option
    Then Add the product "<products>" to the cart
    And Select the menu button
    And Reset the app state
    And Check if the app state is reset "<products>"
    Examples:
      | products                |
      | Sauce Labs Backpack     |
      | Sauce Labs Bike Light   |
      | Sauce Labs Bolt T-Shirt |

  Scenario: Logout works properly
    When Select the menu button
    And Click on the logout button
    Then Redirection to login page

  Scenario: Check Twitter link
    When Click Twitter link
    Then Redirection to the Sauce Labs Twitter page