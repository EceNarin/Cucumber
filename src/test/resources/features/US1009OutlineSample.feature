Feature: 1009 outline sample
  Scenario Outline: Searching multiple words
    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici kelimeler "<SearchingWord>" icin arama yapar
    And kullanici  sonuclarin kelimeleri "<ResultTest>" icerdigini test eder
    And sayfayi kapatir

    Examples:
    |SearchingWord|ResultTest|
    |java  |java   |
    |elma  |elma   |
    |loreal|loreal  |
    |nutella|nutella|