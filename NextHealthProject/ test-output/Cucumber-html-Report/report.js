$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Ahmad%20Siyar%20Sahar/eclipse-workspace/NextHealthProject/Features/FacebookLogin.feature");
formatter.feature({
  "name": "facebooklogin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I want to open chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookLoginStepDefinations.i_want_to_open_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter facebook url as \"https://www.facebook.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLoginStepDefinations.i_enter_facebook_url_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter userName as \"SiyarSahar\" and I enter  password as \"abcd\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginStepDefinations.i_enter_userName_as_and_I_enter_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click sign in btn",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginStepDefinations.i_click_sign_in_btn()"
});
formatter.result({
  "status": "passed"
});
});