package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import pages.ReddiffPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class ReddifStepDefinitions {
    ReddiffPage red=new ReddiffPage();
    Actions action=new Actions(Driver.getDriver());
    String firstHandle="";
    @Then("logonun gorundugunu kontrol et")
    public void logonun_gorundugunu_kontrol_et() {
        Assert.assertTrue(red.logo.isDisplayed());
    }

    @Then("NSE puani dune gore yukselmis mi kontrol et")
    public void nse_puani_dune_gore_yukselmis_mi_kontrol_et() {
      Driver.getDriver().switchTo().frame(red.moneyIframe);
      if(red.NSE.getText().contains("-")){
          System.out.println("Dune gore dusus var");
      }else if(red.NSE.getText().contains("+")){
          System.out.println("Dune gore yukselis var");
      }
      Driver.getDriver().switchTo().defaultContent();

    }

    @Then("Haberler menusunde HOME haricinde {int} eleman oldugunu dogrula")
    public void haberler_menusunde_home_haricinde_eleman_oldugunu_dogrula(Integer int1) {
         int size=red.homeMenu.size()-1;
         Assert.assertTrue(int1==size);
    }

    @Then("sayfayi asagi kaydir")
    public void sayfayi_asagi_kaydir() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Then("Kare seklindeki haberlerden ilk GET AHEAD baslikli olani yeni sekmede ac")
    public void kare_seklindeki_haberlerden_ilk_get_ahead_baslikli_olani_yeni_sekmede_ac() {
        firstHandle=Driver.getDriver().getWindowHandle();
      String handle=ReusableMethods.switchToWindowEce(Driver.getDriver().getWindowHandle());
      red.getAhead.click();
      //Driver.getDriver().switchTo().window(handle);
    }

    @Then("Acilan sekme url sinin {string} icerdigini dogrula")
    public void acilan_sekme_url_sinin_icerdigini_dogrula(String string) {
         String getUrl=Driver.getDriver().getCurrentUrl();
         Assert.assertFalse(getUrl.toLowerCase().contains(string.toLowerCase()));
    }

    @Then("ana sekmeye don")
    public void ana_sekmeye_don() {

      Driver.getDriver().switchTo().window(firstHandle);
    }

    @Then("Haber menusunden {string} a tikla")
    public void haber_menusunden_a_tikla(String string) {
          red.choiceHomeMenu(red.homeMenu,string).click();
    }

    @Then("acilan sayfada {string} alt menusune tikla")
    public void acilan_sayfada_alt_menusune_tikla(String string) {
             red.choiceHomeMenu(red.altMenu,string).click();
    }

    @Then("acilan sayfadaki haberlerin uzerinde baslik olarak {string} yazdigini dogrula")
    public void acilan_sayfadaki_haberlerin_uzerinde_baslik_olarak_yazdigini_dogrula(String string) {
       Assert.assertTrue(red.technoTitle.getText().equalsIgnoreCase(string));
    }

}
