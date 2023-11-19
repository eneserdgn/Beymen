Feature: Beymen Test Automation

  Scenario: Interview Test Case 1
    Given user on the Home Page
    When click SearchBox on Home Page
    When sendkeys SearchBox "şort" on Home Page
    And clear SearchBox on Home Page
    And sendkeys SearchBox "gömlek" on Home Page
    And tap "Enter" on Keyboard
    And click Product "Lacivert" on Products Page
    Then should see Product Detail Page
    When save Product Name and Price
    And select Size "L" on Product Detail Page
    And click Add Basket Button on Product Detail Page
    And click Go Basket button on Popup
    Then check Product Name and Price on Basket Page
    When select Product Number "2 adet" on Basket Page
    Then should see Product Number "2 adet" on Basket Page
    When click Delete button on Basket Page
    Then should see Empty Basket Message "SEPETINIZDE ÜRÜN BULUNMAMAKTADIR" on Basket Page
