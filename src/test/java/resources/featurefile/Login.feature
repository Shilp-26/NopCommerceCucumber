Feature: Login Test
  As a user I want to login into Nop Commerce Website

  Background: I am on homepage

  @Smoke @Regression
  Scenario: User should navigate to login page successfully
    When    I click on login link
    Then    I should navigate to login page successfully

  @Sanity @Regression
  Scenario: User should login successfully with valid credentials
    When  I click on login link
    And   I enter email "prime@gamil.com"
    And   I enter password "abc123"
    And   I click on login button
    Then  I should login successfully

  @Regression
  Scenario Outline: User should not login with invalid credentials
    When  I click on login link
    And   I enter email "<email>"
    And   I enter password "<password>"
    And   I click on login button
    Then  I should see the error message"<errorMessage>"
    Examples:
      | email              | password | errorMessage                                                                                |
      | abcd123@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz123@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | adfafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |

  @Regression
  Scenario: User should logout successfully
    When  I click on login link
    And   I enter email "harry.potter21@gmail.com"
    And   I enter password "Harry123"
    And   I click on login button
    And   I click on logout link
    Then  I can see login link
