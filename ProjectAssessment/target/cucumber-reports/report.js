$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/featurefile.feature");
formatter.feature({
  "name": "Order a Tshirt and Update Personal Information functionalities of automationpractice web application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test scenario 1 : Order T-Shirt",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@firstTest"
    }
  ]
});
formatter.step({
  "name": "user is on the Sign in page",
  "keyword": "Given "
});
formatter.step({
  "name": "user adds a T-Shirt to cart by clicking on Add to cart",
  "keyword": "When "
});
formatter.step({
  "name": "completes the order using \"\u003cemail\u003e\",\"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "select Pay by bank wire",
  "keyword": "And "
});
formatter.step({
  "name": "Order reference of the order placed is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "someone@xample.com",
        "Password123"
      ]
    }
  ]
});
formatter.background({
  "name": "Open the URL",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in the homepage \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.getHomePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test scenario 1 : Order T-Shirt",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@firstTest"
    }
  ]
});
formatter.step({
  "name": "user is on the Sign in page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.validateFirstSignInPageFirstTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds a T-Shirt to cart by clicking on Add to cart",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.addATshirt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "completes the order using \"someone@xample.com\",\"Password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.completeTheOrder(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Pay by bank wire",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.payByBankWire()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order reference of the order placed is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verifyOrderHistory()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Test Scenario 2 : Update First Name in My Account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@secondTest"
    }
  ]
});
formatter.step({
  "name": "user is in the sign in page",
  "keyword": "Given "
});
formatter.step({
  "name": "user sign in into the account using \"\u003cemail\u003e\",\"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "updates first name in My Account page using \"\u003cfName\u003e\",\"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user gets a success message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "fName"
      ]
    },
    {
      "cells": [
        "someone@xample.com",
        "Password123",
        "Smriti"
      ]
    }
  ]
});
formatter.background({
  "name": "Open the URL",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in the homepage \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.getHomePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Scenario 2 : Update First Name in My Account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@secondTest"
    }
  ]
});
formatter.step({
  "name": "user is in the sign in page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.validateSecondSignInPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sign in into the account using \"someone@xample.com\",\"Password123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.signInToAccount(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "updates first name in My Account page using \"Smriti\",\"Password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.UpdateCredential(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets a success message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.validateSuccessMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});