package com.nopcommerce.steps;

import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.DesktopsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComputerSteps {

    @When("^I click on computer tab$")
    public void iClickOnComputerTab() {
        new ComputerPage().clickOnComputerTab();
    }



    @Then("^I should see the computer text$")
    public void iShouldSeeTheComputerText() {
        String expectedMessage= "Computers";
        String actualMessage = new ComputerPage().verifyComputerText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }


    @And("^I click on desktops$")
    public void iClickOnDesktops() {
        new ComputerPage().clickOnDesktopTab();
    }

    @Then("^I should see the desktops text$")
    public void iShouldSeeTheDesktopsText() {
        String expectedMessage ="Desktops";
        String actualMessage = new ComputerPage().verifyDesktopText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }


    @And("^I click on build on own computer$")
    public void iClickOnBuildOnOwnComputer() {
        new DesktopsPage().clickOnBuildYourOwnComputer();
    }

    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String Processor)  {
        new DesktopsPage().selectProcessor(Processor);

    }

    @And("^I select ram \"([^\"]*)\"$")
    public void iSelectRam(String Ram)  {
        new DesktopsPage().selectRam(Ram);

    }

    @And("^I select hdd \"([^\"]*)\"$")
    public void iSelectHdd(String HDD)  {
        new DesktopsPage().selectHdd(HDD);

    }

    @And("^I select os \"([^\"]*)\"$")
    public void iSelectOs(String Os)  {
        new DesktopsPage().selectOs(Os);

    }

    @And("^I select software \"([^\"]*)\"$")
    public void iSelectSoftware(String Software)  {
        new DesktopsPage().selectSoftware(Software);

    }
    @And("^I click on Add to cart button$")
    public void iClickOnAddToCartButton() {
        new DesktopsPage().clickOnAddToCartButton();
    }


    @Then("^I should get message \"([^\"]*)\"$")
    public void iShouldGetMessage(String NotificationMessage )  {
        String expectedMessage= "The product has been added to your shopping cart";
        String actualMessage= new DesktopsPage().verifyAddToYourShoppingCart();
        Assert.assertEquals(expectedMessage,actualMessage);

    }
}
