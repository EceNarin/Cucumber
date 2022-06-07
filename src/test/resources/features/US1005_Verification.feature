Feature: US1005 verification automation exercise
  @wip
  Scenario: TC08 Verify products
    Given kullanici "aeUrl" anasayfasinda
    Then Verify that home page is visible successfully
    And Add products to cart
    And kullanici 4 sn bekler
    And Click Cart button
    And kullanici 4 sn bekler
    And Verify that cart page is displayed
    And kullanici 4 sn bekler
    And Click X button corresponding to particular product
    And kullanici 4 sn bekler
    And Verify that product is removed from the cart
    And kullanici 4 sn bekler
    And sayfayi kapatir
