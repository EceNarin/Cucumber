Feature: 1008 Search Product And Verify After Login
  @work2
  Scenario: TC11 Verify products
    Given kullanici "aeUrl" anasayfasinda
    Then  Click on "Products" button
    And  Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name in search input and click search button
    And  Verify SEARCHED PRODUCTS is visible
    And  Verify all the products related to search are visible
    And Add those products to cart
    And Click on Cart button
    And verify that products are visible in cart
    And Click Signup Login button and submit login details Again, go to Cart page
    And Click on Cart button
    And verify that products are visible in cart
    And close driver
