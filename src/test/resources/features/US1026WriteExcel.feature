Feature: US1026 ExcelWriting
   @bak
  Scenario Outline: TC excel and reusable method
    Given user in "excelPath" excel
    Then 1.satirdaki 2.hucreye gidelim ve yazdiralim
    And baskenti "Jakarta" olan ulke ismini yazdiralim
    And Ulke sayisini bulalim
    And ulke sayisinin 190 oldugunu test edelim
    And Fiziki olarak kullanilan satir sayisini bulun
    And Tum bilgileri map olarak kaydedelim
    And baskenti "Jakarta" olan ulkenin tum bilgilerini yazdiralim
    And "<Satir>" ve "<sutun bilgisi>" ile hucre yazdiralim
    Examples:
      | Satir | sutun bilgisi |
      | Yerevan | Ülke (Türkçe)|
      | Ermenistan | Başkent (İngilizce)|
      | Vienna | Ülke (İngilizce)|
      | Austria | Başkent (Türkçe)|
