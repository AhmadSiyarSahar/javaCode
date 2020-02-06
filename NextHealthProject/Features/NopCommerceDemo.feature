Feature: Nop Commerce Login

Scenario: Valid Credentials

Given user launch Chrome Browser
When user enters the url "https:admin-demo.nopcommerce.com/"
Then user enters user name as "admin@yourstore.com" and pasword as "admin"
And user clicks on login
Then user close