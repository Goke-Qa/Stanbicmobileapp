Feature: Create OnePass Account

Scenario: Create OnePass Account with valid details

When user clicks to create OnePass Account and Agrees to terms
Then user is required to select a login module
When user enters valid module credentials and logs in
Then an OTP should be sent
When user validates the OTP
Then user should create OnePass ID 
And Create a password
When user selects a security question and response
Then OnePass Account should be created successfully
