Feature: US1035 HerOku
  Scenario: positive Test
    Given kullanici "hOkuUrl" anasayfasinda
    Then  "Drag and Drop" 'a mouse action ile sag tiklatip yeni sekmede acalim
    Then drag and drop islemini yap mouse action ile
    Then degisen degerleri test et
    And Elemental Selenium ile yeni acilan sekmenin windowhandle degerini yaz
    And sponsored by Sauce Labs'a tikla
    And fareyle contact in uzerine gelip contact support u tikla
    And ilk sayfaya geri gel
    And close driver
