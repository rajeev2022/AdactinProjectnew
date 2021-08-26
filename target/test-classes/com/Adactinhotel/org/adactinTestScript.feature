Feature: User Checking overall functionality of adactin hotel booking
Scenario: checking login function
Given  user launch application
When user entredvalid usernanme in user name efield
And user enter valid password in password field
And user click button.
And user entre retype passsword
Then click login 

Scenario: user search hotel in search hotel page
Given user login to application
When search hotel location  from location field
