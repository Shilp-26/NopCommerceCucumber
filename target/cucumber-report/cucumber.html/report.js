$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "As a user I want to login into Nop Commerce Website",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7704727200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 12,
  "name": "User should login successfully with valid credentials",
  "description": "",
  "id": "login-test;user-should-login-successfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Sanity"
    },
    {
      "line": 11,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter email \"prime@gamil.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter password \"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 1426750800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prime@gamil.com",
      "offset": 15
    }
  ],
  "location": "LoginSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 148274900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 115186400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 1084335100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldLoginSuccessfully()"
});
formatter.result({
  "duration": 41188200,
  "status": "passed"
});
formatter.after({
  "duration": 860543800,
  "status": "passed"
});
formatter.uri("Register.feature");
formatter.feature({
  "line": 1,
  "name": "Register Test",
  "description": "As a user I should register successfully",
  "id": "register-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3549754200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 12,
  "name": "verify That First Name Last Name Email Password And Confirm Password Fields Are Mandatory",
  "description": "",
  "id": "register-test;verify-that-first-name-last-name-email-password-and-confirm-password-fields-are-mandatory",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Sanity"
    },
    {
      "line": 11,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I get error message first name \"First name is required\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I get error message last name \"Last name is required\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I get error message email \"Email is required\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I get error message password \"Password is required\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I get error message confirm password \"Confirm Password is required\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I am not able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 618336600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 155833300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "First name is required",
      "offset": 32
    }
  ],
  "location": "RegisterSteps.iGetErrorMessageFirstName(String)"
});
formatter.result({
  "duration": 54625800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Last name is required",
      "offset": 31
    }
  ],
  "location": "RegisterSteps.iGetErrorMessageLastName(String)"
});
formatter.result({
  "duration": 51256700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email is required",
      "offset": 27
    }
  ],
  "location": "RegisterSteps.iGetErrorMessageEmail(String)"
});
formatter.result({
  "duration": 48544200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password is required",
      "offset": 30
    }
  ],
  "location": "RegisterSteps.iGetErrorMessagePassword(String)"
});
formatter.result({
  "duration": 42409200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Confirm Password is required",
      "offset": 38
    }
  ],
  "location": "RegisterSteps.iGetErrorMessageConfirmPassword(String)"
});
formatter.result({
  "duration": 44857900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iAmNotAbleToRegisterSuccessfully()"
});
formatter.result({
  "duration": 27400,
  "status": "passed"
});
formatter.after({
  "duration": 849090700,
  "status": "passed"
});
});