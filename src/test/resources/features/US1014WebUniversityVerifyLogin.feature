Feature: US1014 WebUniversity LogIn

    Scenario: TC15 Verify Validation
          Given kullanici "webUniUrl" anasayfasinda
          And  Login Portal a kadar asagi inin
          And Login Portal a tiklayin
          Then Diger window'a gecin
          And username ve password kutularina deger yazdirin
          And login butonuna basin
          And Popup'ta cikan yazinin validation failed oldugunu test edin
          And Ok diyerek Popup'i kapatin
          And Ilk sayfaya geri donun
          And Ilk sayfaya donuldugunu test edin
          And close driver