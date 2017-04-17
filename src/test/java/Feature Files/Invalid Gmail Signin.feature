
Feature: Invalid Gmail Signin

Scenario: Invalid username
Given The user is on gmail sign in page
When An Invalid input is given for username field
And The user clicks on Next button
Then "Please enter a valid email address or phone number." error message should be displayed

Scenario: Invalid password
Given The user is on gmail sign in page
When A valid input is given for username field
And The user clicks on Next button
And An Invalid input is given for password field
Then "Wrong password. Try again." error message should be displayed

