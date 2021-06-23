Feature: Activate 3S Banking

  Background: User has logged into the app
    Given user has successfully logged into the app

  @Functional
  Scenario Outline: Activate 3S Banking
    When user click on 3S Banking icon
    And click on activate 3S Banking
    Then enter PIN