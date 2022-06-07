Feature: 1007 View Cart and Brand Button
  Scenario: TC10 cart and brand button
    Given kullanici "aeUrl" anasayfasinda
    Then Click on 'Products' button
    And  Verify that Brands are visible on left side bar
    And  Click on any brand name
    And  Verify that user is navigated to brand page and brand products are displayed
    And  On left side bar, click on any other brand link
    And  Verify that user is navigated to that brand page and can see products
    And sayfayi kapatir