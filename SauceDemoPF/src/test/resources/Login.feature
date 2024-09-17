Feature: Login Sauce Demo App

  Background:
    Given I am on the Sauce Demo web page

  Scenario Outline: Login to Sauce Demo with valid credentials
    Given Enter the username as "<user>"
    And Enter the password as "<password>"
    When Click on the login button
    Examples:
      | user          | password     |
      | problem_user  | secret_sauce |
      | standard_user | secret_sauce |
