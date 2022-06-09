package stepDefinitions;

import io.cucumber.java.en.Given;
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
        Assert.assertTrue(app.deletElementsButtonList.isEmpty());
    }
    @Given("click on the Add Element button {int} times")
    public void click_on_the_add_element_button_times(Integer int1) {
        clickTimes(int1);
    }

    public void clickTimes(Integer int1) {
        for(int i=0;i<int1;i++){
            app.addElementButton.click();
        }
    }

    @Given("write a function that takes a number, and clicks the Delete button")
    public void write_a_function_that_takes_a_number_and_clicks_the_delete_button() {
       int sizeOf= app.deletElementsButtonList.size();
       deleteElements(sizeOf);
    }

    public void deleteElements(int sizeOf) {
        for(int i=0;i<sizeOf;i++){
            app.deleteButton.click();
        }
    }

    @Given("given number of times, and then validates that given number of")
    public void given_number_of_times_and_then_validates_that_given_number_of() {
        int clickedTimes=15;
        clickTimes(clickedTimes);
      int expectedClick=app.deletElementsButtonList.size();
      Assert.assertEquals(clickedTimes,expectedClick);
    }
    @Given("buttons was deleted")
    public void buttons_was_deleted() {
        int size=app.deletElementsButtonList.size();
        deleteElements(size);
       int ifDelete=app.deletElementsButtonList.size();
       Assert.assertTrue(ifDelete==0);
    }

}
