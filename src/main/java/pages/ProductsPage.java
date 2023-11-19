package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ProductsPage {
    WebDriver driver;
    ElementHelper helper;
    private By productNameList = By.cssSelector(".m-productCard__desc");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        helper = new ElementHelper(driver);
    }

    public void clickProduct(String productName) {
        helper.clickWithText(productNameList, productName);
    }
}
