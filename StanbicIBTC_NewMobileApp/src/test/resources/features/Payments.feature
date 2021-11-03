Feature: Payments

  Background: User has logged into the app
    Given user has successfully logged into the app
    And click on payments icon

  @Functional
  Scenario Outline: Buy Airtime
    Then click on buy airtime
    And input phone number and amount
    Then select account to debit
    Then confirm and input pin

  @Functional
  Scenario Outline: Auto Airtime
    Then click on auto airtime
    And input phone number & amount
    Then select the account to debit
    And input pin

<<<<<<< HEAD
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
  	
  
=======
>>>>>>> branch 'master' of https://stanbicibtcdev.visualstudio.com/Quality%20Assurance%20and%20Testing%20Projects/_git/Quality%20Assurance%20and%20Testing%20Projects
  #@Functional
  #Scenario Outline: Buy for Self
    #Then click on buy for self
    #And proceed to input pin

  @Functional
  Scenario Outline: Buy Data
    Then click on buy data
    And input phone number
    Then select an account to debit
<<<<<<< HEAD
    
    
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
    	
    
    
    

=======

  #@Functional
  #Scenario Outline: Pay Bills
    #Then click on pay bills
    #And select platform you are paying for
    #Then select account to debit during bills payment
    #Then input unique numbers of the platform
    #Then select plan
    #Then confirm
#
  #@Functional
  #Scenario Outline: Corporate Billers
    #Then click on Corporate Billers
    #And select Government
    #When you click on revpay
    #Then select account to debit for revpay
    #And continue

  @active
  Scenario Outline: Cardless Withdrawal
    And click on payment sign
    Then click on cardless withdrawal
    And amount and pin
>>>>>>> branch 'master' of https://stanbicibtcdev.visualstudio.com/Quality%20Assurance%20and%20Testing%20Projects/_git/Quality%20Assurance%20and%20Testing%20Projects
