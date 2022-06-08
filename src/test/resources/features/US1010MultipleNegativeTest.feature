Feature: US1010 Negative TEst
Scenario Outline: TC12 kullanici gecerli bilgilerle giris yapar
Given kullanici "hotelMolyUrl" anasayfasinda
Then user click login button
And user input invalid userNName "<name>"
And user input invalidy password "<password>"
And user click on submit button
Then verify unsuccess login
And sayfayi kapatir
   Examples:
  |name|password|
  |manager1|manager1|
  |manager1|manager1|
  |manager1|manager1|
  |manager1|manager1|
  |manager1|manager1|