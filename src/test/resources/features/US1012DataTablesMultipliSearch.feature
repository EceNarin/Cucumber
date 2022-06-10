
Feature: US1012 add users informs and verify whether in or not


  Scenario Outline: TC12 table addition

    When kullanici "datatTabUrl" anasayfasinda
    Then new butonuna basar
    And  user input firstname "<fname>"
    And  user input lastname "<lname>"
    And  user input positions "<positions>"
    And  user input office "<office>"
    And  user input extension "<extension>"
    And  user input startdate "<startDate>"
    And  user input salary "<salary>"
    And  Create tusuna basar
    When kullanici ilk isim "<fname>" arama yapar
    Then isim bolumunde isminin "<fname>" oldugunu dogrular
    And  close driver
    Examples:
      |fname|lname|positions|office|extension|startDate|salary|
      |velican  |ddd  |qa       |sweden| UI    |2022-06-21 |2300  |
      |alim  |dde   |qa       |norway| UI    |2022-06-25 |3500  |
      |ayse  |dds  |qa       |sweden| -   |2022-06-23 |2900  |
      |asya  |ddf  |qa       |germany| UI    |2022-06-26 |2800  |
      |ayla  |ddrt   |qa       |US| -   |2022-06-29 |3900  |

