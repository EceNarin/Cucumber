Feature: US1023 DataProvider
  Scenario Outline: TC33 login with unvalid userName and Password
    Given kullanici "hotelMolyUrl" anasayfasinda
    Then user click login button
    And user input invalid userNName "<name>"
    And user input invalidy password "<password>"
    And user click on submit button
    Then verify unsuccess login
    And sayfayi kapatir

    Examples:
      |name|password|
      | Manager  |  Manager   |
      | Manager1  |  Manager1   |
      | Manager2  |  Manager2   |
      | Manager3 |  Manager3   |
      | Manager4  |  Manager4   |

