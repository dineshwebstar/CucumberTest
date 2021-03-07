Feature: validating login function of fb
Scenario: validating login function correct password and correct user name
Given user enter on fb login page
When user enter username and password
		|Udinesh|Phsdgd|
		|jdsuhd|bnvdhxvsa|
And user click login button
Then user should login validate page 

