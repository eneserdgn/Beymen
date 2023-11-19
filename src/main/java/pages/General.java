package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class General {
    WebDriver driver;
    ElementHelper helper;
    private By goBasketButton = By.cssSelector(".m-notification__button.btn");
    private By productName = By.cssSelector("#deneme");
    private By productPrice = By.cssSelector("#deneme");

    public General(WebDriver driver) {
        this.driver = driver;
        helper = new ElementHelper(driver);
    }

    public void clickGoBasketButton() {
        helper.click(goBasketButton);
    }

    public void sendKeysKeyboard(String button) {
        helper.sendKeysKeyboard(button);
    }

    public void saveProductName() {
    }

    public void saveProductPrice() {
    }
}
