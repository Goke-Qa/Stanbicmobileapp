Feature: Transfers

  Background: User has logged in and entered token
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

  @functional
  Scenario Outline: Transfer to Others
    When user clicks on the transfers link
    Then user is navigated to the transfers page
    When user clicks on transfer to others link
    Then user is navigated to transfer to others page
    When user selects source account
    And enters "<RecpAccNo>" and "<Amount>"
    And selects destination bank and enters recpient narration
    And clicks continue
    Then user is naviagated to the confirmation page

  #These steps are pending DB issue resolution
  @functional
  Scenario Outline: Transfer to Self
    When user clicks on the transfers link
    Then user is navigated to the transfers page
    When user ccliks on transfer to self
    Then user is navigated to the transfer to self page
    When users selects the source and destination account
    And enters amount and sender narration
    And clicks continue
    Then user is navigated to the confirmmation page
    When user selects the verify checkbox and clicks continue

    #These steps are pending DB issue resolution
    Examples: 
      | username   | password   | RecpAccNo | Amount |
      | 0015969269 | Test@12345 |           |        |
