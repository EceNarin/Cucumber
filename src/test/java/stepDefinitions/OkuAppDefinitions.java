package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HerOkuApp;
import utilities.Driver;
import utilities.ReusableMethods;

public class OkuAppDefinitions {
    HerOkuApp app=new HerOkuApp();
    @Then("Add Element  butona basin")
    public void add_element_butona_basin() {
      app.addElementButton.click();
    }
    @Then("Delete butonu gorunur oluncaya kadar bekleyin")
    public void delete_butonu_gorunur_oluncaya_kadar_bekleyin() {
        ReusableMethods.waitForVisibility(app.deleteButton,15);
    }
    @Then("Delete butonunun gorunur oldugunu test edin")
    public void delete_butonunun_gorunur_oldugunu_test_edin() {
        Assert.assertTrue(app.deleteButton.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu silin")
    public void delete_butonuna_basarak_butonu_silin() {
          app.deleteButton.click();
    }
    @Then("Delete butonunun gorunmedigini test edin")
    public void delete_butonunun_gorunmedigini_test_edin() {
        Assert.assertTrue(app.deleteButtonList.isEmpty());
    }
}
