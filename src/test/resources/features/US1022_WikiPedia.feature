Feature: US1022 wikipedia tables
  @wiki
  Scenario: TC print row and column
    Given kullanici "wikiUrl" anasayfasinda
    Then  go to table which name is List of companies acquired by Dell Inc.
    And   print row 4 of the table on console
    And   also print on console the second and third elements  in line 5.
    And   Verify that Compellent appears in the first cell of line 6
    And   close driver







