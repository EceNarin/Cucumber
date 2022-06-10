Feature: US1021 TextWrite
  @Text
  Scenario: TC write toresult on text file
    Given kullanici "ggUrl" anasayfasinda
    Then  Arama kutucuguna "bilgisayar" kelimesi girilir
    And   Arama sonuclari sayfasindan 2 .sayfa acilir
    And   2.sayfanin acildigi kontrol edilir
    And   sonuca gore sergilenen urunlerden random urun secilir
    And   secilen urunun tutar bilgisi txt dosyasina yazilir
    And   secilen urun sepete eklenir
    And   urun sayfasindaki fiyat ve sepette yer alan urun fiyati verify edilir
    And   adet arttirilarak urun adenin 2 oldugu dogrulanir
    And   kullanici 5 sn bekler
    And   urun sepetten silinerek dogrulugu conrrol edilir
    And   kullanici 5 sn bekler
    And   verify basket is empty
    And   close driver



