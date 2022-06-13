Feature: US1033 TrivagoPage

  Scenario: TC_reservation

    Given kullanici "trivagoUrl" anasayfasinda
    Then tepe menudeki "Flights" linkine tikla yeni sayfada oldugunu verify et
    And kullanici 5 sn bekler
    And  sayfayi en alta gotur ve tekrar basa gel
    And  onceki sekmeye don
    And kullanici 5 sn bekler
    And  All stays - Hotel - House  Apartment sekmelerinden "Hotel" sekmesine tikla
    And aramakutusuna "Seychelles" yaz
    And 2022 yazi icin 2 haftalik tatil sec
    And 2 yetiskin sec
    And search e tikla
    And gelen sonuclarda Guest rating uzerine gel ve "very good" u sec
    And more filters uzerinde gel, hotel classta 4 ve 5 yildizi sec populer filters tan Beach sec
    And more photos linkinin gorundugunu dogrula ve linke tikla
    And Resimlerin altat gorundugunu dogrula
    And konumu tikla
    And hoteli locate et haritadan
    And hoteli haritadan zoomla


