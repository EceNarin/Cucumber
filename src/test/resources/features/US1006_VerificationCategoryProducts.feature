Feature:US1006 Verification category products
  @work
  Scenario: TC09 verify products category
    Given kullanici "aeUrl" anasayfasinda
    Then Verify that categories are visible on left side bar
    And kullanici 3 sn bekler
    And Click on Women category
    And kullanici 3 sn bekler
    And Click on any category link under Women category, for example: Dress
    And Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
    And On left side bar, click on any sub-category link of Men category
    And Verify that user is navigated to that category page
    And sayfayi kapatir
