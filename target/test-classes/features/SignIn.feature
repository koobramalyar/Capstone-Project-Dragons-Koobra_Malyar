@Regression
Feature: Sign in/Sign Up Feature

  Background: 
    Given User is on retial website
    When User click on sign in option
    Then user should be logged in into Account

  @SignInRetial
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'kubra@gmail.com' and password 'Malyar@123'
    And User click on login button

  @CreatAccountRetail
  Scenario: Verify user can create an account into Retial Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name  | email                    | password   | confirmPassword |
      | Zala  | kubramalyar@tekschool.us | Malyar@123 | Malyar@123     |
    And User click on signUp button
