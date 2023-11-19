package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ProductDetailPage;
import utils.DriverFactory;

public class ProductDetailPageStepDefs {
    ProductDetailPage productDetailPage = new ProductDetailPage(DriverFactory.getDriver());
    @Then("should see Product Detail Page")
    public void shouldSeeProductDetailPage() {
        productDetailPage.checkProductDetailPage();
    }

    @And("select Size {string} on Product Detail Page")
    public void clickSizeOnProductDetailPage(String size) {
        productDetailPage.selectSize(size);
    }

    @And("click Add Basket Button on Product Detail Page")
    public void clickAddBasketButtonOnProductDetailPage() {
        productDetailPage.clickBasketButton();
    }
}
