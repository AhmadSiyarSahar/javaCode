Feature: facebooklogin

Scenario: Login with valid credentials 

Given I want to open chrome browser
When I enter facebook url as "https://www.facebook.com/"
Then I enter userName as "SiyarSahar" and I enter  password as "abcd"
Then I click sign in btn

