package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPractice;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationPracticeDefinitions {
    AutomationPractice ap=new AutomationPractice();
    Faker fake=new Faker();
    String email="";
    String password="";
    Actions action=new Actions(Driver.getDriver());

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        ap.logIn.click();
    }
    @Given("user Create and account bolumunde email adresi girer")
    public void user_create_and_account_bolumunde_email_adresi_girer() {
         email=fake.internet().emailAddress();
         ap.emailInput.sendKeys(email);
    }
    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        ap.createAccountButton.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        password=fake.internet().password();
        String fName=fake.name().firstName();
        String lName=fake.name().lastName();
         action.click(ap.choiceGenderMale1Female2(2)).sendKeys(Keys.TAB).sendKeys(fName).sendKeys(Keys.TAB).sendKeys(lName).sendKeys(Keys.TAB)
         .sendKeys(Keys.TAB).sendKeys(email).sendKeys(Keys.TAB).sendKeys(password).sendKeys(Keys.TAB).sendKeys("1").sendKeys(Keys.TAB).sendKeys("4")
         .sendKeys(Keys.TAB).sendKeys("1990").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).sendKeys(Keys.ENTER)
         .sendKeys(Keys.TAB).sendKeys(fName).sendKeys(Keys.TAB).sendKeys(lName).sendKeys(Keys.TAB).sendKeys(fake.company().name()).sendKeys(Keys.TAB)
         .sendKeys(fake.address().fullAddress()).sendKeys(Keys.TAB).sendKeys(fake.address().cityName()).sendKeys(Keys.TAB).sendKeys(fake.address().state())
         .sendKeys(fake.address().zipCode()).sendKeys(Keys.TAB).sendKeys("United States").sendKeys(fake.lorem().sentence(30)).sendKeys(Keys.TAB)
         .sendKeys(fake.phoneNumber().phoneNumber()).sendKeys(Keys.TAB).sendKeys(fake.phoneNumber().phoneNumber()).sendKeys(Keys.TAB)
         .sendKeys(fake.address().secondaryAddress()).sendKeys(Keys.TAB).perform();
    }
    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
         ap.register.click();
    }
    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {

    }
    @Given("email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar")
    public void email_kutusuna_isareti_olmayan_email_adresi_yazar_ve_enter_a_tiklar() {
           action.click(ap.emailInput).sendKeys("djjgjgkdlls.hotmail.com").perform();
           ap.createAccountButton.click();
    }
    @Then("error mesajinin {string} oldugunu dogrulayin")
    public void error_mesajinin_oldugunu_dogrulayin(String string) {
        ReusableMethods.waitForVisibility(ap.inValidMail,10);
      String actualMessage=ap.inValidMail.getText();
        Assert.assertTrue(actualMessage.equals(string));
    }


}
