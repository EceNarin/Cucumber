Feature: US_1019 Iframe and Fill in the form
  Scenario: TC iframe and fill in the form
    Given kullanici "jqUrl" anasayfasinda
    Then 2 . emojiye tiklayin
    And kullanici 5 sn bekler
    And tum ikinci emoji ogelerini tiklayin
    And kullanici 5 sn bekler
    And parent iframe e geri donun
    And formu istediginiz verilerle doldurun
    And apply butonuna basin
    And sayfayi kapatir