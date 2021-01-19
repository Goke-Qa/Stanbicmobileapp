Feature: Login to the Mobile App

Scenario: Login to mobile App with valid credentials
Given user has launched the App
When user selects the MyBank menu
And clicks on the login arrow
Then user is navigated to the login screen
When user enters a valid username and password
And clicks on the login button
Then user is navigated to the dashboard

