Feature: US1025 InvalidVerify

   Scenario: TC35 Verifying
    Given kullanici "apUrl" anasayfasinda
    And  user sign in linkine tiklar
    And  email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar
    Then error mesajinin "Invalid email address." oldugunu dogrulayin
     And close driver