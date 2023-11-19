package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.DriverFactory;

public class HomePageStepDefs {
    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Given("user on the Home Page")
    public void userOnTheHomePage() {
        homePage.checkHomePage();
        homePage.acceptCookies();
        homePage.selectGencer("ERKEK");
    }

    @When("sendkeys SearchBox {string} on Home Page")
    public void sendkeysSearchBoxOnHomePage(String arg0) {
        homePage.sendKeysSearchBox(arg0);
    }

    @And("clear SearchBox on Home Page")
    public void clearSearchBoxOnHomePage() {
        homePage.clearSearchBox();
    }

    @When("click SearchBox on Home Page")
    public void clickSearchBocOnHomePage() {
        homePage.clickSearchBox();
    }
}
