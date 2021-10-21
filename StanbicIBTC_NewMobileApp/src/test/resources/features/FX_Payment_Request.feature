Feature: FX Request

  Background: User has logged into the app
    Given user has successfully logged into the app

  @Functional
  Scenario Outline: Request for FX
    And user clicks on FX Payment
    Then clicks on New Request
