Feature: 1013 General Task
 @wiki
  Scenario Outline: Add/Remove elements33
    Given kullanici "guruTableUrl" anasayfasinda
    Then "<Istenen Baslik>" sutunundaki tum degerleri yazdirir
    And close driver
    Examples:
      | Istenen Baslik     |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |