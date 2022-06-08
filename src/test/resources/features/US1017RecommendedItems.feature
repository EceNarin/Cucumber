Feature: US1018 Recoomended Items
  Scenario: TC Recommended
    Given kullanici "aeUrl" anasayfasinda
    Then Scroll to bottom of page
    And  Verify RECOMMENDED ITEMS are visible
    And kullanici 5 sn bekler
    And  Click on Add To Cart on Recommended product
    And kullanici 5 sn bekler
    And  Click on View Cart button
    And  Verify that product is displayed in cart page
    And  close driver





