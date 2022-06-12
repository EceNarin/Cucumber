package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DemoqaPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.ScreenShot;

public class DemoqaDefinitions {
    DemoqaPage demoqaPage=new DemoqaPage();
    @Then("Alerts e tiklayin")
    public void alerts_e_tiklayin() {
        demoqaPage.alertButton.click();
    }
    @And("On button click, alert will appear after Five seconds karsisindaki click me butonuna basin")
    public void onButtonClickAlertWillAppearAfterFiveSecondsKarsisindakiClickMeButonunaBasin() {
        demoqaPage.willAppearFiveSeconds.click();
    }
    @Then("Allert uzerindeki yazinin {string} oldugunu test edin")
    public void allert_uzerindeki_yazinin_oldugunu_test_edin(String string) {
        System.out.println(Driver.getDriver().switchTo().alert().getText());
       Assert.assertTrue(Driver.getDriver().switchTo().alert().getText().equals(string));
    }
    @Then("Ok diyerek alerti kapatin")
    public void ok_diyerek_alerti_kapatin() {
       Driver.getDriver().switchTo().alert().accept();
    }
    @Given("{string} butonunun enable olmasini bekleyin")
    public void butonunun_enable_olmasini_bekleyin(String string) {
     ReusableMethods.waitForVisibility(demoqaPage.enableAfter5Min,6);
    }
    @Then("{string} butonunun enable oldugunu test edin")
    public void butonunun_enable_oldugunu_test_edin(String string) {
        Assert.assertTrue(demoqaPage.enableAfter5Min.isEnabled());
    }
    @Given("{string} butonunun visible olmasini bekleyin")
    public void butonununVisibleOlmasiniBekleyin(String arg0) {
        ReusableMethods.waitForVisibility(demoqaPage.enableAfter5Min,6);
    }

    @Then("{string} butonunun visible oldugunu test edin")
    public void butonununVisibleOldugunuTestEdin(String arg0) {
        Assert.assertTrue(demoqaPage.visibleAfter5Min.isDisplayed());
    }
    @Given("colorChanges butonuna tiklayin")
    public void colorchangesButonunaTiklayin() {
        ScreenShot.takeShootWebElement(demoqaPage.colorChangeButton);
        ReusableMethods.waitForVisibility(demoqaPage.colorChangeButton,6);
        demoqaPage.colorChangeButton.click();
    }
    @Then("rengin degistigini assert edin ya da ss alin")
    public void renginDegistiginiAssertEdinYaDaSsAlin() {
        ReusableMethods.waitForVisibility(demoqaPage.colorChangeButton,6);
        ScreenShot.takeShootWebElement(demoqaPage.colorChangeButton);
    }


}
