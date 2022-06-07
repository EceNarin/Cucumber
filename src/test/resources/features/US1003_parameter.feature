Feature: US1003 parameter

  @parametre
  Scenario: TC06 user search with parameter
    Given kullanici amazon anasayfasinda
    And kullanici "Nutella" icin arama yapar
    And sonuclarin "Nutella" icerdigini test eder
    Then sayfayi kapatir