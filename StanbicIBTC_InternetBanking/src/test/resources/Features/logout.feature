Feature: Logout

  @Functional
  Scenario: Logout
    When user clicks on the logout link
    Then user is navigated to the satisfaction survey
    When user makes a survey response and submits
    Then user is navigated back to the login page
