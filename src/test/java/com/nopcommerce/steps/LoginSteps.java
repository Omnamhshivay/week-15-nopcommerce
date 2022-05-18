package com.nopcommerce.steps;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals("Login page not displayed",expectedMessage,actualMessage);
    }


    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        new LoginPage().enterEmailId(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword(password);


    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errorMessage)  {
        new LoginPage().getErrorMessage();

    }

    @Then("^I can see log out link$")
    public void iCanSeeLogOutLink() {
        String expectedMessage = "Log out";
        String actualMessage = new HomePage().getLogOutLink();
        Assert.assertEquals("Log out link not displayed",expectedMessage,actualMessage);
    }

    @And("^I click on logout link$")
    public void iClickOnLogoutLink() {
        new HomePage().clickOnLogOutButton();
    }

    @Then("^I can see log in link$")
    public void iCanSeeLogInLink() {
        String expectedMessage= "Log in";
        String actualMessage= new HomePage().getLogInLink();
        Assert.assertEquals("Log in link not displayed",expectedMessage,actualMessage);
    }
}
