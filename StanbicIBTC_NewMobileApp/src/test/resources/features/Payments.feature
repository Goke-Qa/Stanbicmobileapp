Feature: Payments

  Background: User has logged into the app
    Given user has successfully logged into the app

  #@Functional
  #Scenario Outline: Buy Airtime
    #And click on payments icon
    #Then click on buy airtime
    #And input phone number and amount
    #Then select account to debit
    #Then confirm and input pin
    
    #@Functional
    #Scenario Outline: Buy Data
    #And click on payments icon
    #Then click on buy data
    #And input phone number
    #Then select account to debit
    
    
    @Functional
    Scenario Outline: Pay Bills
    And click on payments icon
    Then click on pay bills
    And select platform you are paying for
    Then select account to debit
    Then input unique numbers of the platform
    Then select plan
    Then confirm
    
    
    
    
    
    
