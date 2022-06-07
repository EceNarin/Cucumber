  @all
Feature: US1001 Amazon Search
  @Nutella
  Scenario: E1 kullanici amazonda kelime aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And  sonuclarin Nutella icerdigini test eder
    And  sayfayi kapatir
    @Java @bothOf
    Scenario: E2 kullanici amazonda Java aratir

      Given kullanici amazon anasayfasinda
      Then kullanici Java icin arama yapar
      And sonuclarin Java icerdigini test eder
      And sayfayi kapatir
      @Iphone @bothOf
      Scenario: E3 kullanici amazonda
        Given kullanici amazon anasayfasinda
        Then kullanici Iphone icin arama yapar
        And sonuclarin Iphone icerdigini test eder
        And sayfayi kapatir