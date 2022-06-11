package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class GuruDefinitions {
    GuruPage guru=new GuruPage();
    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {
        guru.columnElemnt.stream().forEach(t-> System.out.println(t.getText()));
    }
    @And("{string} 'in listede oldugunu test eder")
    public void inListedeOldugunuTestEder(String arg0) {
       boolean ifEquals= guru.istenenSatir.stream().anyMatch(t->t.getText().contains(arg0));

    }


    @And("{string} Prev.Close degerini yazdirir")
    public void prevCloseDegeriniYazdirir(String arg0) {
        String prevValue=guru.istenenCell(guru.columnElemnt,arg0).getText();
        System.out.println(prevValue);
    }

    @And("{string}, {string} daki yaziyi yazdirir")
    public void dakiYaziyiYazdirir(String arg0, String arg1) {
      String cell=  guru.istenenCellPro(arg0, arg1).getText();
        System.out.println(cell);
        ReusableMethods.writeToOneStringToText(cell);
    }
}
