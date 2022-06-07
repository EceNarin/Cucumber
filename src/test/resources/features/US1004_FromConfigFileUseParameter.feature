Feature: US1004_FromConfigFileUseParameter

  @config
  Scenario: TC07 from configration properties file useing parameter
    Given kullanici "aeUrl" anasayfasinda
    Then kullanici 2 sn bekler
    And url'in "automation" icerdigini test eder
    Then sayfayi kapatir
