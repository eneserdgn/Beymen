package stepDefinitions;

import io.cucumber.java.en.And;
import pages.ProductsPage;
import utils.DriverFactory;

public class ProductsPageStepDefs {
    ProductsPage productsPage = new ProductsPage(DriverFactory.getDriver());

    @And("click Product {string} on Products Page")
    public void clickProductOnProductsPage(String productName) {
        productsPage.clickProduct(productName);
    }
}
