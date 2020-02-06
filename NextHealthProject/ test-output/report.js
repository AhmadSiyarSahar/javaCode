$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Ahmad%20Siyar%20Sahar/eclipse-workspace/NextHealthProject/Features/NopCommerceDemo.feature");
formatter.feature({
  "name": "Nop Commerce Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "NopCommerceDemoSteps.user_launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the url \"https:admin-demo.nopcommerce.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "NopCommerceDemoSteps.user_enters_the_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters user name as \"admin@yourstore.com\" and pasword as \"admin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NopCommerceDemoSteps.user_enters_user_name_as_and_pasword_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "NopCommerceDemoSteps.user_clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close",
  "keyword": "Then "
});
formatter.match({
  "location": "NopCommerceDemoSteps.user_close()"
});
formatter.result({
  "status": "passed"
});
});