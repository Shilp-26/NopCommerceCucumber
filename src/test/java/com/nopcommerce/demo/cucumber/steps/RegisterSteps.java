package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterSteps {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I am on register page$")
    public void iAmOnRegisterPage() {
        new RegisterPage().verifyRegisterTxt("Register");
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterBtn();
    }


    @Then("^I am not able to register successfully$")
    public void iAmNotAbleToRegisterSuccessfully() {
    }

    @And("^I click on Gender \"([^\"]*)\"$")
    public void iClickOnGender(String gender) {
        new RegisterPage().selectGender(gender);

    }

    @And("^I enter First Name \"([^\"]*)\" into 'First name' field$")
    public void iEnterFirstNameIntoFirstNameField(String first) {
        new RegisterPage().enterFirstName(first);
    }

    @And("^I enter Last Name \"([^\"]*)\" into 'Last name' field$")
    public void iEnterLastNameIntoLastNameField(String last) {
        new RegisterPage().enterLastName(last);
    }


    @And("^I enter email \"([^\"]*)\" into 'Email' field$")
    public void iEnterEmailIntoEmailField(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("^I enter password \"([^\"]*)\" in 'Password' field$")
    public void iEnterPasswordInPasswordField(String pass) {
        new RegisterPage().enterPassword(pass);
    }

    @And("^I enter confirm password \"([^\"]*)\" into 'Confirm password' field$")
    public void iEnterConfirmPasswordIntoConfirmPasswordField(String cPass) {
        new RegisterPage().enterConfirmPassword(cPass);
    }

    @Then("^I am able to register successfully$")
    public void iAmAbleToRegisterSuccessfully() {
        new RegisterPage().verifyRegistrationCompletedMsg("Your registration completed");
    }


    @And("^I get error message first name \"([^\"]*)\"$")
    public void iGetErrorMessageFirstName(String expMsg) {
        new RegisterPage().verifyFirstNameErrorMsg(expMsg);
    }

    @And("^I get error message last name \"([^\"]*)\"$")
    public void iGetErrorMessageLastName(String expMsg) {
        new RegisterPage().verifyLastNameErrorMsg(expMsg);
    }

    @And("^I get error message email \"([^\"]*)\"$")
    public void iGetErrorMessageEmail(String expMsg) {
        new RegisterPage().verifyEmailErrorMsg(expMsg);
    }

    @And("^I get error message password \"([^\"]*)\"$")
    public void iGetErrorMessagePassword(String expMsg) {
        new RegisterPage().verifyPasswordErrorMsg(expMsg);
    }

    @And("^I get error message confirm password \"([^\"]*)\"$")
    public void iGetErrorMessageConfirmPassword(String expMsg) {
        new RegisterPage().verifyConfirmPasswordErrorMsg(expMsg);
    }

    @And("^I select the date of birth \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iSelectTheDateOfBirth(String day, String month, String year) throws InterruptedException {
        new RegisterPage().selectDateOfBirth(day, month, year);
    }
}
