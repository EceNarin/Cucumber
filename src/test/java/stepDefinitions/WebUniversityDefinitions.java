package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class WebUniversityDefinitions {
    WebUniversityPage wu=new WebUniversityPage();
    Actions action=new Actions(Driver.getDriver());
    String firstPageHandle="";
    @Given("Login Portal a kadar asagi inin")
    public void login_portal_a_kadar_asagi_inin() {
      action.sendKeys(Keys.PAGE_DOWN).perform();
    }
    @Given("Login Portal a tiklayin")
    public void login_portal_a_tiklayin() {
        firstPageHandle=Driver.getDriver().getWindowHandle();
       wu.loginPortalButton.click();

    }
    @Then("Diger window'a gecin")
    public void diger_window_a_gecin() {
        //ReusableMethods.switchToWindow(firstPageHandle);
       Set<String> handles= Driver.getDriver().getWindowHandles();
      String other= handles.stream().filter(t->!t.equals(firstPageHandle)).findAny().get();
      Driver.getDriver().switchTo().window(other);
    }
    @Then("username ve password kutularina deger yazdirin")
    public void username_ve_password_kutularina_deger_yazdirin() {
        Faker fake=new Faker();
        action.click(wu.userName).sendKeys(fake.name().name()).sendKeys(Keys.TAB).sendKeys(fake.internet().password()).perform();
    }
    @Then("login butonuna basin")
    public void login_butonuna_basin() {
       wu.loginButton.click();
    }
    @Then("Popup'ta cikan yazinin validation failed oldugunu test edin")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_edin() {
        String actualText=Driver.getDriver().switchTo().alert().getText();
        Assert.assertTrue(actualText.contains("validation failed"));
    }
    @Then("Ok diyerek Popup'i kapatin")
    public void ok_diyerek_popup_i_kapatin() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("Ilk sayfaya geri donun")
    public void Ilk_sayfaya_geri_donun() {
        Driver.getDriver().switchTo().window(firstPageHandle);
    }
    @Then("Ilk sayfaya donuldugunu test edin")
    public void Ilk_sayfaya_donuldugunu_test_edin() {
        String currentHandle=Driver.getDriver().getWindowHandle();
          Assert.assertTrue(currentHandle.equals(firstPageHandle));
    }


}
