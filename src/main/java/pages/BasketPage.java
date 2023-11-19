package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.DriverFactory;
import utils.ElementHelper;

public class BasketPage {
    WebDriver driver;
    ElementHelper helper;

    private By productName = By.cssSelector(".m-basket__productInfoCategory");
    private By productPrice = By.cssSelector(".m-productPrice__salePrice");
    private By productNumberDropdown = By.id("quantitySelect0-key-0");
    private By productNumberDropdownList = By.cssSelector("#quantitySelect0-key-0 option");
    private By deleteButton = By.id("removeCartItemBtn0-key-0");
    private By emptyMessage = By.cssSelector("#emtyCart .m-empty__messageTitle");

    public BasketPage(WebDriver driver) {
        this.driver = driver;
        helper = new ElementHelper(driver);
    }

    public void checkProductName(String name) {
        helper.checkText(productName, name);
    }

    public void checkProductPrice(String price) {
        helper.checkText(productPrice, price);
    }

    public void selectProductNumber(String number) {
        helper.click(productNumberDropdown);
        helper.clickWithText(productNumberDropdownList, number);
    }

    public void checkProductNumber(String number) {
        Assert.assertEquals(helper.getDropdownValue(productNumberDropdown), number);
    }

    public void clickDeleteButton() {
        helper.click(deleteButton);
    }

    public void checkEmptyMessage(String message) {
        helper.checkText(emptyMessage, message);
    }
}
