package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computerTab;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerText;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]")
    WebElement desktopsTab;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;


    public void clickOnComputerTab() {
        log.info("Click on computer tab" + computerTab.toString());
        clickOnElement(computerTab);
    }

    public String verifyComputerText() {
        log.info("Get text computer" + computerTab.toString());
        return getTextFromElement(computerText);
    }

    public void clickOnDesktopTab() {
        log.info("Click on desktop" + desktopsTab.toString());
        clickOnElement(desktopsTab);
    }

    public String verifyDesktopText() {
        log.info("Get text desktop" + desktopsTab.toString());
        return getTextFromElement(desktopsText);
    }
}
