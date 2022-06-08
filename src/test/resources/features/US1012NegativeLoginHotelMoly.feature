Feature: US1011 Ck Hotels Negative Login Test


  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
Given kullanici "hotelMolyUrl" anasayfasinda
Then user click login button
And user input invalid "name"
And user input invalidy "password"
And user click on submit button
Then verify unsuccess login
And sayfayi kapatir