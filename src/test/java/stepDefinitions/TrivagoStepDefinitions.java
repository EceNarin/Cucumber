package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TrivagoPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TrivagoStepDefinitions {
    TrivagoPage trivagoPage=new TrivagoPage();
    String firstHandle="";
    String secondHandle="";
   Actions action=new Actions(Driver.getDriver());
    @Then("tepe menudeki {string} linkine tikla yeni sayfada oldugunu verify et")
    public void tepeMenudekiLinkineTiklaYeniSayfadaOldugunuVerifyEt(String arg0) {
        firstHandle= Driver.getDriver().getWindowHandle();
        trivagoPage.choices(trivagoPage.staysCarsFlightsPackage,arg0).click();
        secondHandle=ReusableMethods.switchToWindowEce(firstHandle);
        Driver.getDriver().switchTo().window(secondHandle);
        Assert.assertTrue(!firstHandle.equals(secondHandle));
    }
    @Then("sayfayi en alta gotur ve tekrar basa gel")
    public void sayfayi_en_alta_gotur_ve_tekrar_basa_gel() {
         action.sendKeys(Keys.END).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        action.sendKeys(Keys.PAGE_UP).perform();
    }
    @Then("onceki sekmeye don")
    public void onceki_sekmeye_don() {
         Driver.getDriver().switchTo().window(secondHandle);
    }
    @And("All stays - Hotel - House  Apartment sekmelerinden {string} sekmesine tikla")
    public void allStaysHotelHouseApartmentSekmelerindenSekmesineTikla(String arg0) {
       trivagoPage.choices(trivagoPage.allHotelHome,arg0).click();
    }
    @And("aramakutusuna {string} yaz")
    public void aramakutusunaYaz(String arg0) {
       trivagoPage.searchBox.sendKeys(arg0);
    }
    @Then("{int} yazi icin {int} haftalik tatil sec")
    public void yazi_icin_haftalik_tatil_sec(Integer int1, Integer int2) {
        int x=5;
        trivagoPage.checkIn.sendKeys("0"+x+"/07/"+int1+"");
        x+=(7*int2);
        trivagoPage.checkOut.sendKeys(""+x+"/07/"+int1+"");
    }
    @Then("{int} yetiskin sec")
    public void yetiskin_sec(Integer int1) {
        action.clickAndHold(trivagoPage.roomAndAdultbutton).perform();
        trivagoPage.adult.clear();
        trivagoPage.adult.sendKeys(""+int1+"" );
    }
    @Then("search e tikla")
    public void search_e_tikla() {
     trivagoPage.searchButton.click();
    }
    @Then("gelen sonuclarda Guest rating uzerine gel ve {string} u sec")
    public void gelen_sonuclarda_guest_rating_uzerine_gel_ve_u_sec(String string) {

    }
    @Then("more filters uzerinde gel, hotel classta {int} ve {int} yildizi sec populer filters tan Beach sec")
    public void more_filters_uzerinde_gel_hotel_classta_ve_yildizi_sec_populer_filters_tan_beach_sec(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("more photos linkinin gorundugunu dogrula ve linke tikla")
    public void more_photos_linkinin_gorundugunu_dogrula_ve_linke_tikla() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Resimlerin altat gorundugunu dogrula")
    public void resimlerin_altat_gorundugunu_dogrula() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("konumu tikla")
    public void konumu_tikla() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("hoteli locate et haritadan")
    public void hoteli_locate_et_haritadan() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("hoteli haritadan zoomla")
    public void hoteli_haritadan_zoomla() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
