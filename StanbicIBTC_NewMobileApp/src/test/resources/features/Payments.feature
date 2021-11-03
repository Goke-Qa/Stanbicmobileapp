Feature: Payments

  Background: User has logged into the app
    Given user has successfully logged into the app

  @Functional
  Scenario Outline: Buy Airtime
    And click on payments icon
    Then click on buy airtime
    And input phone number and amount
    Then select account to debit
    Then confirm and input pin
    
  @Functional
  Scenario Outline: Auto Airtime
  	And click payments icon
  	Then click on auto airtime
  	And input threshold
  	Then select the account to debit
  	And input pin
  	
  
  #@Functional
  #Scenario Outline: Buy for Self
  #	And click on the payments icon
  #	Then click on buy for self
  #	And proceed to input pin
  
    
    @Functional
    Scenario Outline: Buy Data
    And click on payments icon
    Then click on buy data
    And input phone number
    Then select an account to debit
    
    
    @Functional
    Scenario Outline: Pay Bills
    And click on payments icon
    Then click on pay bills
    And confirm user can see all third party vendor
    
    
    @Functional
    Scenario Outline: Corporate Billers
    And click on the payments icon
    Then click on Corporate Billers
    And confirm government category
    And confirm airlines category
    And confirm insurance category
    And confirm construction category
    And confirm others category
    And confirm cableTV category
    And confirm investment category
    And confirm shipping category 
    
    
    @Functional
    Scenario Outline: Cardless Withdrawal
    	And click on payment sign
    	Then click on cardless withdrawal
    	And amount and pin
    	
    
    
    

