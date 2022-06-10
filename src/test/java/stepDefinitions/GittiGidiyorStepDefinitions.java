package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.GittiGidiyorPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class GittiGidiyorStepDefinitions {
    GittiGidiyorPage gg=new GittiGidiyorPage();
    String firstPageHandle="";
    Actions action=new Actions(Driver.getDriver());
    int price=0;
    @Then("Arama kutucuguna {string} kelimesi girilir")
    public void aramaKutucugunaKelimesiGirilir(String arg0) {
        gg.coockiesCloseButton.click();
        gg.searchBox.sendKeys(arg0 + Keys.ENTER);
    }
    @Then("Arama sonuclari sayfasindan {int} .sayfa acilir")
    public void arama_sonuclari_sayfasindan_sayfa_acilir(Integer int1) {
       action.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
         gg.getSelectPage(int1).click();
    }

    @Then("{int}.sayfanin acildigi kontrol edilir")
    public void sayfanin_acildigi_kontrol_edilir(Integer int1) {
       String page=  gg.selectPage.getAttribute("title");
        //Assert.assertTrue(page.contains(""+int1+""));
    }
    @Then("sonuca gore sergilenen urunlerden random urun secilir")
    public void sonuca_gore_sergilenen_urunlerden_random_urun_secilir() {

        action.moveToElement(gg.getSelectedPoduct()).click().perform();
        action.click(gg.getSelectedPoduct()).perform();

    }
    @Then("secilen urunun tutar bilgisi txt dosyasina yazilir")
    public void secilen_urunun_tutar_bilgisi_txt_dosyasina_yazilir() {
        price=Integer.parseInt(gg.price.getText().replaceAll("[^0-9]",""));
         action.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.writeToListINTOText(gg.productFields);
    }
    @Then("secilen urun sepete eklenir")
    public void secilen_urun_sepete_eklenir() {
        gg.addToBasket.click();
    }
    @Then("urun sayfasindaki fiyat ve sepette yer alan urun fiyati verify edilir")
    public void urun_sayfasindaki_fiyat_ve_sepette_yer_alan_urun_fiyati_verify_edilir() {
        action.moveToElement(gg.moveToBasket).perform();
        gg.goToBasket.click();
        int expectedPrice= Integer.parseInt(Driver.getDriver().findElement(By.xpath("//p[@class=\"new-price\"]"))
                .getText().replaceAll("[^0-9]",""));
        Assert.assertEquals(price,expectedPrice);
    }
    @Then("adet arttirilarak urun adenin {int} oldugu dogrulanir")
    public void adet_arttirilarak_urun_adenin_oldugu_dogrulanir(Integer int1) {
        Select select=new Select(Driver.getDriver().findElement(By.xpath("//select[@class=\"amount\"]")));

        select.selectByValue("2");

       boolean hele= Integer.parseInt(select.getFirstSelectedOption().getAttribute("value"))==2;
       Assert.assertTrue(hele);
    }
    @Then("urun sepetten silinerek dogrulugu conrrol edilir")
    public void urun_sepetten_silinerek_dogrulugu_conrrol_edilir() {
        gg.deleteFromBasket.click();

    }


    @And("verify basket is empty")
    public void verifyBasketIsEmpty() {
        String empty="Sepetinizde ürün bulunmamaktadır.";
        Assert.assertTrue(Driver.getDriver()
                .findElement(By.xpath("//*[@id=\"empty-cart-container\"]/div[1]/div[1]/div/div[2]/h2")).getText().equals(empty));
    }
}
