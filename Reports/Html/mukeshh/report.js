$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Mukesh%20babu/eclipse-workspace/Assesment/src/test/resources/Feature/Flipkart.feature");
formatter.feature({
  "name": "To check place order funtionality in Flipkart",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Flipkart"
    }
  ]
});
formatter.scenario({
  "name": "User should login Flipkart application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Flipkart"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enters Into walnut section",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_enters_Into_walnut_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects Farmley Cashews 500g",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_selects_Farmley_Cashews_g(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Go to cart option",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_clicks_Go_to_cart_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Place order",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_Place_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates back",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_navigates_back()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks Remove",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_Clicks_Remove()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Your cart is empty page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.your_cart_is_empty_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});