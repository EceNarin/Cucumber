package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.searchbox.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.result.getText().contains("Nutella"));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
    Driver.getClose();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.searchbox.sendKeys("Java" + Keys.ENTER);
    }
    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.result.getText().contains("Java"));
    }


    @Then("kullanici Iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.searchbox.sendKeys("Iphone" + Keys.ENTER);
    }

    @And("sonuclarin Iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.result.getText().contains("Iphone"));
    }
    @Given("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String searchingWord) {
        amazonPage.searchbox.sendKeys(searchingWord + Keys.ENTER);
    }
    @Given("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String containsWord) {
        Assert.assertTrue(amazonPage.result.getText().contains(containsWord));
    }

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String expectedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(expectedUrl));
    }


    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int expectedSc) {
        try {
            Thread.sleep(expectedSc*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String expectedContainsUrl) {
     Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedContainsUrl));
    }

    @Then("kullanici kelimeler {string} icin arama yapar")
    public void kullaniciKelimelerIcinAramaYapar(String SearchingWord) {
        
    }

    @And("kullanici  sonuclarin kelimeleri {string} icerdigini test eder")
    public void kullaniciSonuclarinKelimeleriIcerdiginiTestEder(String ResultTest) {
    }
}
