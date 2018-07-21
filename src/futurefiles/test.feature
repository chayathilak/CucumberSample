@tester
Scenario : Go to "find my fare" site and login with credentials
Given I login to the account
When I login to the account providing correct user name and the password
Then I login to my account successfully 


Given I login to the account
When I login to the account providing incorrect user name and the password
Then Throw error message - Incorrect password