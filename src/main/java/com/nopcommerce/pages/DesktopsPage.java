package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.commons.exec.OS;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputer;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramSelect;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement radio320GB;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement radio420GB;
    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_3']")
    WebElement hddSelect;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement radioVistaHome;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement radioVistaPremium;
    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_4']")
    WebElement osSelect;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement radioMicrosoftOffice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement radioAcrobatReader;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement radioTotalCommander;
    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_5']")
    WebElement softwareSelect;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement cartBarNotification;


    public void clickOnBuildYourOwnComputer() {
        log.info("Build your own computer" + buildYourOwnComputer.toString());
        clickOnElement(buildYourOwnComputer);
    }

    public void selectProcessor(String Processor) {
        log.info("Select processor" + processor.toString());
        selectByVisibleTextFromDropDown(processor, Processor);
    }

    public void selectRam(String Ram) {
        log.info("select ram" + ramSelect.toString());
        selectByVisibleTextFromDropDown(ramSelect, Ram);
    }

    public void selectHdd(String HDD) {
        log.info("Select Hdd" + HDD.toString());
        if (HDD.equalsIgnoreCase("320 GB")) {
            clickOnElement(radio320GB);
        } else {
            clickOnElement(radio420GB);
        }
    }

    public void selectOs(String OS) {

        if (OS.equalsIgnoreCase("Vista Home [+$50.00]")) {
            clickOnElement(radioVistaHome);
        } else if (OS.equalsIgnoreCase("Vista Premium [+$60.00]")) {
            clickOnElement(radioVistaPremium);
        }
    }

    public void selectSoftware(String Software) {
        clickOnElement(radioMicrosoftOffice);
        if (Software.equalsIgnoreCase("Microsoft Office [+$50.00]")) {
            clickOnElement(radioMicrosoftOffice);
        } else if (Software.equalsIgnoreCase("Acrobat Reader [+$10.00]")) {
            clickOnElement(radioAcrobatReader);
        } else if(Software.equalsIgnoreCase("Total Commander [+$5.00]")) {
            clickOnElement(radioTotalCommander);
        }else{
            System.out.println("print one product");
        }
    }

    public void clickOnAddToCartButton() {
        log.info("Add to cart" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String verifyAddToYourShoppingCart() {
        return getTextFromElement(cartBarNotification);
    }


}
