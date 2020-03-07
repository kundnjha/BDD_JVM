@SmokeCases @Regression
Feature: smoke cases of application
Description: it page includes all smoke cases
@12
Scenario: Check user is able to login into suiteCRM of not
Given User is on login page
When use enters credentials and hit login button
Then User is on dashboard
And user click all btn
@13
Scenario: Verify dashboard 
Given user is on dashboard page
Then user verify  menu

Scenario: Create account
Given user is on dshboard page
When user clicks on the account icon
Then create account page opens
And user enters required data is field 
And clicks on save account.
Then user verifies newly created account in list of account to db
