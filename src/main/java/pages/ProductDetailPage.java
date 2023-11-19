package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ProductDetailPage {
    WebDriver driver;
    ElementHelper helper;

    private By productName = By.cssSelector(".o-productDetail__brandLink");
    private By productPrice = By.id("priceNew");
    private By sizeButtons = By.cssSelector(".m-variation__item");
    private By basketButton = By.id("addBasket");

    public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
        helper = new ElementHelper(driver);
    }

    public void checkProductDetailPage() {
        helper.checkElement(productName);
    }

    public void selectSize(String size) {
        helper.clickWithText(sizeButtons, size);
    }

    public void clickBasketButton() {
        helper.click(basketButton);
    }

}
