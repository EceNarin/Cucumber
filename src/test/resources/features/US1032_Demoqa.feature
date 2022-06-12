Feature: US1032 Demoqa alert task
  @parameter4
  Background: multiple
    Given kullanici "dePropertiesUrl" anasayfasinda

  @parameter4
    Scenario: First
      Given "Will enable 5 seconds" butonunun enable olmasini bekleyin
      Then   "Will enable 5 seconds" butonunun enable oldugunu test edin
  @parameter4
      Scenario: Second
        Given "Will enable 5 seconds" butonunun visible olmasini bekleyin
        Then  "Will enable 5 seconds" butonunun visible oldugunu test edin
  @parameter4
        Scenario: Third
          Given  colorChanges butonuna tiklayin
          Then  rengin degistigini assert edin ya da ss alin