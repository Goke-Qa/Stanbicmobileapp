Feature: Create Account
  @Functional
  Scenario: Create a new Account
    Given user has logged into the app
    And navigated to the dashboard
    When user navigate to the profile screen
    Then user should select the create account button