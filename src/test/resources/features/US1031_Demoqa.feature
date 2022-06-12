Feature:US1031 Demoqatesting

  Scenario: TC_40 DemoqaWindowTesting
    Given kullanici "deWindowUrl" anasayfasinda
    Then Alerts e tiklayin
    And  On button click, alert will appear after Five seconds karsisindaki click me butonuna basin
    And kullanici 6 sn bekler
    And Allert uzerindeki yazinin "This alert appeared after 5 seconds" oldugunu test edin
    And Ok diyerek alerti kapatin
    And close driver