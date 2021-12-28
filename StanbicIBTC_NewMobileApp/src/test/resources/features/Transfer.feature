Feature: Transfers

  Background: User has logged into the app
    Given user has successfully logged into the app
    And user is navigated to the dashboard
    When user navigate to the transfer screen

  #@active
  #Scenario Outline: Transfer to Self
    #Then user should select transfer to Self
    #When user selects source and destination accounts
    #And inputs a valid amount and narration
    #Then funds should be transfered successfully

  @active
  Scenario Outline: Transfer to Stanbic IBTC account
    Then user should select transfer to Stanbic IBTC account
    When user selects the source account
    And inputs the destination account number
    And inputs valid amount and narration
    Then user should input a 4digit valid PIN
    And funds should be transferred with a successful screen

  @active
  Scenario Outline: Transfer to other banks
    Then user should select transfer to other banks
    When user selects source account number
    And input destination bank account number
    Then selects bank name
    And inputs amount and narration
    Then user should input a valid PIN
    And funds should be transferred successfully

  @active
  Scenario Outline: Transfer to AtEase account
    Then user should select transfer to AtEase account
    When user selects account number to debit
    And inputs AtEase account number
    And inputs an amount and a narration
    Then user should input PIN
    And funds should be transffered successfully

  @active
  Scenario Outline: Transfer to Single Beneficiary
    Then user should select transfer to a Beneficiary
    And selects transfer to a single beneficiary 
    When user selects a source account number
    And selects a beneficiary
    And inputs amount and the narration
		And funds should be transferred successfully to the beneficiary account