package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.DataTable;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class DataTableDefinitions {
    DataTable dt=new DataTable();
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
      dt.newButton.click();
    }
    @Then("user input firstname {string}")
    public void user_input_firstname(String string) {
      dt.fName.sendKeys(string);
    }
    @Then("user input lastname {string}")
    public void user_input_lastname(String string) {
      dt.lName.sendKeys(string);
    }
    @Then("user input positions {string}")
    public void user_input_positions(String string) {
       dt.position.sendKeys(string);
    }
    @Then("user input office {string}")
    public void user_input_office(String string) {
        dt.office.sendKeys(string);
    }
    @Then("user input extension {string}")
    public void user_input_extension(String string) {
        dt.extension.sendKeys(string);
    }
    @Then("user input startdate {string}")
    public void user_input_startdate(String string) {
        dt.startDate.sendKeys(string);
    }
    @Then("user input salary {string}")
    public void user_input_salary(String string) {
        dt.salary.sendKeys(string);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
         dt.createButton.click();
    }


    @When("kullanici ilk isim {string} arama yapar")
    public void kullaniciIlkIsimAramaYapar(String arg0) {
        dt.searchBox.sendKeys(arg0 + Keys.ENTER);
    }


    @Then("isim bolumunde isminin {string} oldugunu dogrular")
    public void isimBolumundeIsmininOldugunuDogrular(String arg0) {
        String actualWord=dt.verifyName.getText();
        Assert.assertTrue(actualWord.contains(arg0));
    }

    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String arg0) {

        List<WebElement> listHead=Driver.getDriver().findElements(By.xpath("//thead//tr//th"));
        ReusableMethods.writeToListINTOText(listHead);
        int size=listHead.size();
        for(int i=1;i<=size;i++){
            if(arg0.equals(Driver.getDriver().findElement(By.xpath("//thead//tr//th["+i+"]")).getText())){
                Driver.getDriver().findElements(By.xpath("//thead//tr//th["+i+"]")).stream().forEach(t-> System.out.println(t.getText()));
                Driver.getDriver().findElements(By.xpath("//thead//tr//th["+i+"]")).stream().forEach(t-> System.out.println(t.getText()));

            }
        }
        ReusableMethods.writeToListINTOText(Driver.getDriver().findElements(By.xpath("//thead//tr//th")));
    }
}
