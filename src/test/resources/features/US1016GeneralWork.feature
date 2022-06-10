Feature: 1013 General Task
  @Remove
  Scenario: Add/Remove elements
    Given kullanici "okuUrl" anasayfasinda
        Then Add Element  butona basin
        And kullanici 3 sn bekler
        And Delete butonu gorunur oluncaya kadar bekleyin
        And Delete butonunun gorunur oldugunu test edin
        And kullanici 3 sn bekler
        And Delete butonuna basarak butonu silin
        And Delete butonunun gorunmedigini test edin
        And close driver