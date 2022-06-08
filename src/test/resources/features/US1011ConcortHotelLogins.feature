Feature: US1011 Concort Hotels Login

  Scenario: TC12 kullanici gecerli bilgilerle giris yapar
    Given kullanici "hotelMolyUrl" anasayfasinda
    Then user click login button
    And user input valid "username"
    And user input validy "password"
    And user click on submit button
    Then verify to navigate expected page
    And close driver