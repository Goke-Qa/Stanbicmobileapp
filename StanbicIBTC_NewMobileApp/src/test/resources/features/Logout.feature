Feature: Logout
@Functional
Scenario: Logout of the mobile app
Given user has logged into the app
And user is on the dashboard
When user navigate to the profile screen
Then user click on the logout button
