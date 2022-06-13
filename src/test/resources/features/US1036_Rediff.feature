Feature: US1036 Rediff Task

  Scenario: Rediff iframe
    Given kullanici "rediffUrl" anasayfasinda
    Then logonun gorundugunu kontrol et
    Then NSE puani dune gore yukselmis mi kontrol et
    Then Haberler menusunde HOME haricinde 8 eleman oldugunu dogrula
    And sayfayi asagi kaydir
    And Kare seklindeki haberlerden ilk GET AHEAD baslikli olani yeni sekmede ac
    And Acilan sekme url sinin "GETAHEAD" icerdigini dogrula
    And ana sekmeye don
    And Haber menusunden "BUSINESS" a tikla
    And acilan sayfada "TECHNOLOGY" alt menusune tikla
    And acilan sayfadaki haberlerin uzerinde baslik olarak "Technology" yazdigini dogrula
