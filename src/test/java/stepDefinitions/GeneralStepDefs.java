package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.General;
import utils.DriverFactory;

public class GeneralStepDefs {
    General general = new General(DriverFactory.getDriver());
    @And("click Go Basket button on Popup")
    public void clickGoBasketButtonOnPopup() {
        general.clickGoBasketButton();
    }
    @When("save Product Name and Price")
    public void saveProductNameAndPrice() {
        general.saveProductName();
        general.saveProductPrice();
    }
    @And("tap {string} on Keyboard")
    public void tapOnKeyboard(String button) {
        general.sendKeysKeyboard(button);
    }
}
