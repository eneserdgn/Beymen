package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasketPage;
import utils.DriverFactory;

public class BasketPageStepDefs {
    BasketPage basketPage = new BasketPage(DriverFactory.getDriver());

    @Then("check Product Name and Price on Basket Page")
    public void checkProductNameAndPriceOnBasketPage() {
        String productName = "";
        String productPrice = "";
        basketPage.checkProductName(productName);
        basketPage.checkProductPrice(productPrice);
    }

    @When("select Product Number {string} on Basket Page")
    public void selectProductNumberButton(String number) {
        basketPage.selectProductNumber(number);
    }

    @Then("should see Product Number {string} on Basket Page")
    public void shouldSeeProductNumberOnBasketPage(String number) {
        basketPage.checkProductNumber(number);
    }

    @When("click Delete button on Basket Page")
    public void clickDeleteButtonOnBasketPage() {
        basketPage.clickDeleteButton();
    }

    @Then("should see Empty Basket Message {string} on Basket Page")
    public void shouldSeeEmptyBasketMessageOnBasketPage(String message) {
        basketPage.checkEmptyMessage(message);
    }
}
