Feature: US1024 AutomationPractice
  @invoke
  Scenario: Create and verify new Account
    Given kullanici "apUrl" anasayfasinda
    And user sign in linkine tiklar
    And user Create and account bolumunde email adresi girer
    And Create an Account butonuna basar
    And kullanici 5 sn bekler
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And kullanici 10 sn bekler
    And user Register butonuna basar
    Then hesap olustugunu dogrulayin