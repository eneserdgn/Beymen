package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class HomePage {
    WebDriver driver;
    ElementHelper helper;

    private String url = "https://www.beymen.com/";
    private By searchBox = By.cssSelector(".o-header__search--input");
    private By searchBoxTextbox = By.id("o-searchSuggestion__input");
    private By searchBoxSilButton = By.cssSelector(".o-header__search--close");
    private By acceptAllCookiesButton = By.id("onetrust-accept-btn-handler");
    private By genderButtons = By.cssSelector(".genderPopup__bottom>button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        helper = new ElementHelper(driver);
    }

    public void checkHomePage() {
        helper.checkUrl(url);
    }

    public void acceptCookies() {
        helper.click(acceptAllCookiesButton);
    }

    public void selectGencer(String gender) {
        helper.clickWithText(genderButtons, gender);
    }

    public void sendKeysSearchBox(String text) {
        helper.sendKeys(searchBoxTextbox, text);
    }

    public void clickSearchBox() {
        helper.click(searchBox);
    }

    public void clearSearchBox() {
        helper.click(searchBoxSilButton);
    }


}
