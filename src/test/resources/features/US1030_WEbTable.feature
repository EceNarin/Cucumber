Feature: US1030 guru tables
   @calistir
  Scenario Outline: TC print row and column
    Given kullanici "guruTableUrl" anasayfasinda
    Then  Company listesini consola yazdirir
    And   "Bata India" 'in listede oldugunu test eder
    And "<Istenen Sirket>" Prev.Close degerini yazdirir
    And "<Istenen Satir>", "<Istenen Sutun>" daki yaziyi yazdirir

      Examples:
        |Istenen Satir|Istenen Sutun|Istenen Sirket|
        |Central Bank|% Change|Dewan Housing|
        |Corporation Bank|Current Price (Rs)|YES Bank Ltd.|
        |Dewan Housing|Group|Kajaria Ceramics|
        |IDFC L|Prev Close (Rs)|Bata India|
