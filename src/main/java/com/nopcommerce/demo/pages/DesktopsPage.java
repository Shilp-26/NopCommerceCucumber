package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopsText;

    @FindBy(id = "products-orderby")
    WebElement sortby;

    @FindBy(id = "products-pagesize")
    WebElement display;

    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement selectProductList;

    @FindBy(xpath = "//div[@class='picture']")
    WebElement selectProductDesktpsPage;

    public void selectProductDesktpsPage(String product){
        clickOnElement(selectProductDesktpsPage,product);


    }

    public void verifyDesktopsText(String text) {
        verifyThatTextIsDisplayed(desktopsText, text);

    }

    public void selectSortBy(String sortBy) {
        selectByVisibleTextFromDropDown(sortby, sortBy);

    }

    public void selectDisplay(String size) {
        selectByVisibleTextFromDropDown(display, size);

    }

    public void clickOnList() {
        clickOnElement(selectProductList);


    }

}
