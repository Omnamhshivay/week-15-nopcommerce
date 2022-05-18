package com.nopcommerce.steps;

import com.nopcommerce.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterSteps {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new RegisterPage().clickOnRegisterLink();

    }

    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        String expectedMessage= "Register";
        String actualMessage = new RegisterPage().verifyRegisterText();
        Assert.assertEquals("Register not displayed",expectedMessage,actualMessage);
    }

    @And("^I click register button$")
    public void iClickRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^I should see the First name is required$")
    public void iShouldSeeTheFirstNameIsRequired() {
        String expectedMessage ="First name is required.";
        String actualMessage = new RegisterPage().verifyFirstNameError();
        Assert.assertEquals("First name is not required.",expectedMessage,actualMessage);
    }

    @And("^I should see the Last name is required$")
    public void iShouldSeeTheLastNameIsRequired() {
        String expectedMessage ="Last name is required.";
        String actualMessage = new RegisterPage().verifyLastNameError();
        Assert.assertEquals("Last name is not required.",expectedMessage,actualMessage);
    }

    @And("^I should see the Email is required$")
    public void iShouldSeeTheEmailIsRequired() {
        String expectedMessage ="Email is required.";
        String actualMessage = new RegisterPage().verifyEmailRequired();
        Assert.assertEquals("Email is not required.",expectedMessage,actualMessage);
    }

    @And("^I should see the Password is required$")
    public void iShouldSeeThePasswordIsRequired() {
        String expectedMessage ="Password is required.";
        String actualMessage = new RegisterPage().verifyPasswordError();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @Then("^I should see the Confirm Password is required$")
    public void iShouldSeeTheConfirmPasswordIsRequired() {
        String expectedMessage ="Password is required.";
        String actualMessage = new RegisterPage().verifyConfirmPasswordError();
      Assert.assertEquals(expectedMessage,actualMessage);
    }

    @And("^I select gender \"([^\"]*)\"$")
    public void iSelectGender(String female)  {
        new RegisterPage().selectGenderFemale();

    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName)  {
        new RegisterPage().clickOnFirstName(firstName);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
        new RegisterPage().clickOnLastName(lastName);

    }

    @And("^I select day \"([^\"]*)\"$")
    public void iSelectDay(String day)  {
        new RegisterPage().selectDayFromDropDown(day);

    }

    @And("^I select month \"([^\"]*)\"$")
    public void iSelectMonth(String month)  {
        new RegisterPage().selectMonthFromDropDown(month);
    }

    @And("^I select year \"([^\"]*)\"$")
    public void iSelectYear(String year)  {
        new RegisterPage().selectYearFormDropDown(year);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPassword)  {
        new RegisterPage().enterConfirmPassword(confirmPassword);

    }

    @Then("^I should see the message$")
    public void iShouldSeeTheMessage() {
        new RegisterPage().verifyYourRegistrationCompleted();
    }
}
