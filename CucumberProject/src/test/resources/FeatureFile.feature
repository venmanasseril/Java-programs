@Login
Feature: Login Functionality

Scenario: User logs with valid credentials

Given The user is on the login page
When The user enters a valid username and password
And Clicks the login button
Then The user should be redirected to the home page

Scenario: User attempts to login with invalid username and password

Given The user is on the login page
When The user enters invalid username and invalid password
And Clicks the login button
Then An error message should be displayed

Scenario: User attempts to login with valid username and invalid password

Given The user is on the login page
When The user enters valid username and invalid password
And Clicks the login button
Then An error message should be displayed

Scenario: User attempts to login with invalid username and valid password

Given The user is on the login page
When The user enters invalid username and valid password
And Clicks the login button
Then An error message should be displayed

Scenario: User attempts to login with empty username and empty password

Given The user is on the login page
When The user enters empty username and empty password
And Clicks the login button
Then A validation message should be displayed