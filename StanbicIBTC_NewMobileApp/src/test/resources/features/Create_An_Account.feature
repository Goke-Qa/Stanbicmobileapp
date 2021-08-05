Feature: Create An Account
@Functional
  Scenario: Create a new Account
    Given user has logged into the app
    And navigated to the dashboard
    Then user navigate to the profile screen
    And user should select the create account button