package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.BuildYouOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComputersSteps {
    @When("^I click on Computers tab$")
    public void iClickOnComputersTab() {
        new HomePage().selectMenu("Computers");
    }

    @Then("^I should navigate to Computers page successfully$")
    public void iShouldNavigateToComputersPageSuccessfully() {
        new ComputerPage().verifyComputersText("Computers");
    }

    @And("^I click on Desktop link$")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnDesktopLink();
    }

    @Then("^I should navigate to Desktop page successfully$")
    public void iShouldNavigateToDesktopPageSuccessfully() {
        new ComputerPage().verifyDesktopsText("Desktops");
    }

    @And("^I select product \"([^\"]*)\"$")
    public void iSelectProduct(String product) {
        new DesktopsPage().selectProductDesktpsPage(product);
    }


    @And("^I click on Add to cart button$")
    public void iClickOnAddToCartButton() {
        new BuildYouOwnComputerPage().clickOnAddToCart();
    }

    @Then("^Product is added to cart successfully$")
    public void productIsAddedToCartSuccessfully() {
        new BuildYouOwnComputerPage().verifyProductHasBeenAddedMsg("shopping cart");
    }

    @And("^User selects the computer build \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void userSelectsTheComputerBuild(String processor, String ram, String hdd, String os, String software) {
        new BuildYouOwnComputerPage().buildConfigurationFromList(processor, ram, hdd, os, software);
    }
}
