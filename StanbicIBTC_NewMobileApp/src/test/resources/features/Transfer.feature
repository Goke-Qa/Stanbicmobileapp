Feature: Transfers

  Background: User has logged into the app
    Given user has successfully logged into the app

  #@Functional
  #Scenario Outline: Transfer to other banks
    #And navigated to the dashboard
    #When user navigate to the transfer screen
    #Then user should select transfer to other banks
    #And input account number
    #Then select bank name

  @Functional
  Scenario Outline: Transfer to Stanbic IBTC account
    And navigated to the dashboard
    When user navigate to the transfer screen
    Then user should select transfer to Stanbic IBTC account
    And input account number
    Then input amount
    
   #@Functional
   #Scenario Outline: Transfer to @ease account
    #And navigated to the dashboard
    #When user navigate to the transfer screen
    #Then user should select transfer to @ease account
    #And input account number
    #Then input Amount1
    
