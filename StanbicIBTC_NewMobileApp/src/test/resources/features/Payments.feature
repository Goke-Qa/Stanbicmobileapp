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

  #@Functional
  #Scenario Outline: Buy for Self
    #Then click on buy for self
    #And proceed to input pin

  @Functional
  Scenario Outline: Buy Data
    Then click on buy data
    And input phone number
    Then select an account to debit

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
