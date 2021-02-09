Feature: Login

	@smoke
  Scenario Outline: Login with valid credentials
    Given user has entered a valid URL
    When user clicks on the Advanced button
    And clicks on the proceed button
    Then user is navigated to the login page
    When user enters valid "<username>" and "<password>"
    And clicks on the login button
    Then user is directed to the token page
    When user enters a valid token
    And clicks on the continue  button
    Then user is navigated to the dashboard

    Examples: 
      | username   | password   |
      | 0004524208 | Test@123456 |
