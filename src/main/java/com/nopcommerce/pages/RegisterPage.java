package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.commons.logging.Log;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameError;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameError;
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailError;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordError;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordError;
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femaleRadio;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayFromDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthFromDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearFromDropDown;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompletedText;


    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link :" + registerLink.toString());
    }

    public String verifyRegisterText() {
        log.info("Register text not displayed " + registerText.toString());
        return getTextFromElement(registerText);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String verifyFirstNameError() {
        log.info("First name is not required " + firstNameError.toString());
        return getTextFromElement(firstNameError);
    }

    public String verifyLastNameError() {
        log.info("Last name is not required " + lastNameError.toString());
        return getTextFromElement(lastNameError);
    }

    public String verifyEmailRequired() {
        log.info("Email is not required " + emailError.toString());
        return getTextFromElement(emailError);
    }

    public String verifyPasswordError() {
        log.info("Password is not required " + passwordError.toString());
        return getTextFromElement(passwordError);
    }

    public String verifyConfirmPasswordError() {
        log.info("Confirm password is not required " + confirmPasswordError.toString());
        return getTextFromElement(confirmPasswordError);
    }

    public void selectGenderFemale() {
        log.info("Select gender " + femaleRadio.toString());
        clickOnElement(femaleRadio);
    }

    public void clickOnFirstName(String firstName) {
        log.info("Enter first name" + firstNameField.toString());
        sendTextToElement(firstNameField, firstName);
    }

    public void clickOnLastName(String lastName) {
        log.info("Enter last name" + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
    }

    public void selectDayFromDropDown(String day) {
        log.info("Select day" + dayFromDropDown.toString());
        selectByValueFromDropDown(dayFromDropDown, "5");
    }

    public void selectMonthFromDropDown(String month) {
        log.info("Select month" + monthFromDropDown.toString());
        selectByValueFromDropDown(monthFromDropDown, "5");
    }

    public void selectYearFormDropDown(String year) {
        log.info("Select year" + yearFromDropDown.toString());
        selectByValueFromDropDown(yearFromDropDown, "2021");
    }

    public void enterConfirmPassword(String confirmPassword) {
        log.info("Enter confirm password" + confirmPasswordField.toString());
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public String verifyYourRegistrationCompleted() {
        log.info("Your registration completed" + registrationCompletedText.toString());
        return getTextFromElement(registrationCompletedText);

    }


}
