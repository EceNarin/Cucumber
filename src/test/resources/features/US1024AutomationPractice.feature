Feature: US1024 AutomationPractice
  Scenario: Create and verify new Account
    Given kullanici "" anasayfasinda
    And user sign in linkine tiklar
    And user Create and account bolumunde email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrulayin
    And close driver