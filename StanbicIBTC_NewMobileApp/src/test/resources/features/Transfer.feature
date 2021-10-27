Feature: Transfers

  Background: User has logged into the app
    Given user has successfully logged into the app
    And user is navigated to the dashboard
    When user navigate to the transfer screen
#
  #@Functional
  #Scenario Outline: Transfer to Self
    #Then user should select transfer to Self
    #When user selects source and destination accounts
    #And inputs a valid amount and narration
    #Then funds should be transfered successfully

  #@Functional
  #Scenario Outline: Transfer to Stanbic IBTC account
    #Then user should select transfer to Stanbic IBTC account
    #When user selects the source account number
    #And inputs destination account number
    #And inputs a valid amount and narration
    #Then user should input valid PIN
    #And funds should be transfered successfully

  #@Functional
  #Scenario Outline: Transfer to other banks
    #Then user should select transfer to other banks
    #When user selects the source account number
    #And input the destination bank account number
    #Then selects the bank name
    #And inputs a valid amount and narration
    #Then user should input valid PIN
    #And funds should be transfered successfully
#
  #@Functional
  #Scenario Outline: Transfer to AtEase account
    #Then user should select transfer to AtEase account
    #When user selects the source account number
    #And inputs AtEase account number
    #And inputs a valid amount and narration
    #Then user should input valid PIN
    #And funds should be transfered successfully

  @Functional
  Scenario Outline: Transfer to Single Beneficiary
    Then user should select transfer to a Beneficiary
    And selects transfer to a single beneficiary
    When user selects the source account number
    And selects a beneficiary
    And inputs a valid amount and narration
	And funds should be transfered successfully