package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(linkText = "Register")
    WebElement registerLink;

    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopCommerceLogo;

    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountLink;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutLink;

    public void verifyLogInlink() {
        verifyThatElementIsDisplayed(loginLink);
    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@class='header-menu']//li"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }

    }

    public void verifyLogOutlink() {
        verifyThatElementIsDisplayed(logOutLink);
    }

    public void clickOnLogOut() {
        clickOnElement(logOutLink);

    }

    public void verifyNopCommerceLogo() {
        verifyThatElementIsDisplayed(nopCommerceLogo);

    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);

    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);

    }

}
