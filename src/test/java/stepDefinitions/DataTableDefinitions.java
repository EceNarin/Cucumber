package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTable;

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
}
