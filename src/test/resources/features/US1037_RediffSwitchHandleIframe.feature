Feature: US1037 Switch
  Scenario: TC E2E test
    Given kullanici "rediffUrl" anasayfasinda
    Then logonun gorundugunu kontrol et
    And  header menudeki "Money" linkine tikla yeni sayfada oldugunu verify et
    And NSE sekmesine tikla
    And kullanici 5 sn bekler
    And GAINERS icinde 1 . kazancini %5 ten fazla oldugunu kontrol et
    And kullanici 5 sn bekler
    And SECTORAL INDICES altinda "METAL"'in punanini yazdir
    And kullanici 5 sn bekler
    And "METAL" e tikla
    And "METAL" kazancini dun gore degelendir
    And acilan sayfada grafik uzerindeki basligin "companies" icerdigni kontrol et
    And select indice acilir menusundeki option sayisinin 10 dan buyuk oldugunu kontrol et ve sayisini yazdir
    And optionlardan "BSE-100" u sec
    And acilan sayfadan "BSE 100" puanini konsola yazdir
    And close driver







